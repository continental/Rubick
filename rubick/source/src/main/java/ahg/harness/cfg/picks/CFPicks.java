package ahg.harness.cfg.picks;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import ahg.harness.internal.iMultiTran;
import ahg.harness.internal.iSingleTran;
import ahg.harness.internal.iState;
import ahg.harness.internal.iTran;
import net.automatalib.automata.graphs.TransitionEdge;

public class CFPicks {
	
	private long allNum = 0;
	private List<Integer> perInitialNums = null;
	private List<iState> allInitialPicks = null;
	private HashMap<Integer, List<HashMap<Integer, iTran>>> allTranPicks = null;

	private Integer initialPick = null;
	private HashMap<Integer, iTran> tranPicks = null;

	public CFPicks(long _allNum, List<iState> _allInitialPicks, HashMap<Integer, List<HashMap<Integer, iTran>>> _allTranPicks) {
		allNum = _allNum;
		allInitialPicks = _allInitialPicks;
		allTranPicks = _allTranPicks;

		perInitialNums = new ArrayList<>();
		perInitialNums.add(0);
		int index = 0;
		for (int i = 0; i < allInitialPicks.size() - 1; i++) {
			int num = allTranPicks.get( allInitialPicks.get(i).getNO() ).size();
			index = index + num;
			perInitialNums.add(index);
		}

		initialPick = null;
		tranPicks = null;
	}

	public void setCtrlFlowPicks(long cfNO) {
		cfNO = Math.floorMod(cfNO, allNum);

		int initialPickNum = 0;
		int index = 0;

		int size = allInitialPicks.size();
		while(initialPickNum < size - 1) {
			int newIndex = perInitialNums.get(initialPickNum + 1);

			if (cfNO < newIndex)
				break;

			index = newIndex;
			initialPickNum++;
		}

		int transPickNum = (int) cfNO - index;

		initialPick = allInitialPicks.get(initialPickNum).getNO();
		tranPicks = allTranPicks.get(initialPick).get(transPickNum);
	}

	public Integer getInitialPick() {
		return initialPick;
	}

	public HashMap<Integer, iTran> getTranPicks() {
		return tranPicks;
	}

	public long getAllChoiceNum() {
		return allNum;
	}

	public static CFPicks loadFromFile(String cfPickJsonFile) {
		List<iState> _allInitialPicks = new ArrayList<>();
		HashMap<Integer, List<HashMap<Integer, iTran>>> _allTranPicks = new HashMap<>();

		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader(cfPickJsonFile)) {

			JSONObject obj = (JSONObject) parser.parse(reader);
			obj.forEach((_initial, _tranPicksList) -> {
				Integer initial = iState.getStateFromId((String)_initial);
				_allInitialPicks.add( new iState(initial) );

				List<HashMap<Integer, iTran>> tranPicksList = new ArrayList<>();
				((JSONArray) _tranPicksList).forEach((_tranPicks) -> {
					HashMap<Integer, iTran> tranPicks = new HashMap<>();

					((JSONArray) _tranPicks).forEach((_rawPickUnit) -> {
						JSONArray _pickUnit = (JSONArray) _rawPickUnit;

						Integer state = null;
						iTran pickUnit = null;

						state = iState.getStateFromId( (String) _pickUnit.get(0) );

						int unitNum = ((JSONArray) _pickUnit).size();
						if (unitNum == 2) {
							// single tran
							JSONArray arr = (JSONArray) _pickUnit.get(1);
							String eventStr = (String) arr.get(0);
							if (eventStr.length() != 1)
								throw new RuntimeException("eventStr " + eventStr + " is invalid");
							Character event = eventStr.charAt(0);
							Integer toState = iState.getStateFromId( (String) arr.get(1) );

							pickUnit = new iSingleTran(new TransitionEdge<Character,Integer>(event, toState));

						} else if (unitNum > 2) {
							List<TransitionEdge<Character, Integer>> _trans = new ArrayList<>();
							// multi tran
							for (int i = 1; i < unitNum; i++) {
								JSONArray arr = (JSONArray) _pickUnit.get(i);
								String eventStr = (String) arr.get(0);
								if (eventStr.length() != 1)
									throw new RuntimeException("eventStr " + eventStr + " is invalid");
								Character event = eventStr.charAt(0);
								Integer toState = iState.getStateFromId( (String) arr.get(1) );

								_trans.add(new TransitionEdge<>(event, toState));
							}

							pickUnit = new iMultiTran(_trans);

						} else {
							throw new RuntimeException("meet pickUnit which even cannot be a singletran");
						}

						tranPicks.put(state, pickUnit);
					});

					tranPicksList.add(tranPicks);
				});

				_allTranPicks.put(initial, tranPicksList);
			});

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");

		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("meet json ParseException");

		}

		Collections.sort(_allInitialPicks);

		long _allNum = 0;
		for (List<HashMap<Integer, iTran>> v : _allTranPicks.values() ) {
			long size = v.size();
			if (size == 0)
				_allNum = _allNum + 1;
			else
				_allNum = _allNum + size;
		}

		return new CFPicks(_allNum, _allInitialPicks, _allTranPicks);
	}

}
