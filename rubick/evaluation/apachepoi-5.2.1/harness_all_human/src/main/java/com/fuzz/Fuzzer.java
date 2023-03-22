package com.fuzz;

import java.io.File;
import java.io.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.ByteArrayInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {

	public static void fuzzerTestOneInput(FuzzedDataProvider data) {

		try {

			//Create the input stream from the xlsx/xls file
			InputStream myInputStream = new ByteArrayInputStream(com.fuzz.ExpCollector.recordAndPrepareInputsNotRubick(data));
			//Create Workbook instance for xlsx/xls file input stream
			Workbook workbook = null;
			//workbook = new XSSFWorkbook(myInputStream);
			workbook = new HSSFWorkbook(myInputStream);

			//Get the number of sheets in the xlsx file
			int numberOfSheets = workbook.getNumberOfSheets();

			//loop through each of the sheets
			for(int i=0; i < numberOfSheets; i++){

				//Get the nth sheet from the workbook
				Sheet sheet = workbook.getSheetAt(i);

				//every sheet has rows, iterate over them
				Iterator<Row> rowIterator = sheet.iterator();
				//while (rowIterator.hasNext()) 
				if (rowIterator.hasNext())
				{
					String name = "";
					String shortCode = "";

					//Get the row object
					Row row = rowIterator.next();

					//Every row has columns, get the column iterator and iterate over them
					Iterator<Cell> cellIterator = row.cellIterator();

					//while (cellIterator.hasNext()) 
					if(cellIterator.hasNext())
					{
						//Get the Cell object
						Cell cell = cellIterator.next();

						//check the cell type and process accordingly
						if (cell.getCellType() == CellType.STRING){
							name = cell.getStringCellValue().trim();
							System.out.println("Random data::"+ name);
						} else if (cell.getCellType() == CellType.NUMERIC){
							System.out.println("Random data::"+cell.getNumericCellValue());
						}
					} //end of cell iterator
				} //end of rows iterator

				//close file input stream
				myInputStream.close();
			}	

		} catch (Exception | java.lang.AssertionError  ex) {
			//System.out.println("catched throwable " + ignore);
			//ignore.printStackTrace();
            com.fuzz.ExpCollector.addNewCrashNotRubick(ex);
		}

	}

}
