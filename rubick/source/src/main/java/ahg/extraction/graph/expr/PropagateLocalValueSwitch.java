package ahg.extraction.graph.expr;

import java.util.HashMap;
import java.util.Map.Entry;
import soot.Local;
import soot.Value;
import soot.jimple.AbstractJimpleValueSwitch;
import soot.jimple.AddExpr;
import soot.jimple.AndExpr;
import soot.jimple.ArrayRef;
import soot.jimple.BinopExpr;
import soot.jimple.CastExpr;
import soot.jimple.CaughtExceptionRef;
import soot.jimple.ClassConstant;
import soot.jimple.CmpExpr;
import soot.jimple.CmpgExpr;
import soot.jimple.CmplExpr;
import soot.jimple.DivExpr;
import soot.jimple.DoubleConstant;
import soot.jimple.DynamicInvokeExpr;
import soot.jimple.EqExpr;
import soot.jimple.FloatConstant;
import soot.jimple.GeExpr;
import soot.jimple.GtExpr;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InstanceOfExpr;
import soot.jimple.IntConstant;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.LeExpr;
import soot.jimple.LengthExpr;
import soot.jimple.LongConstant;
import soot.jimple.LtExpr;
import soot.jimple.MethodHandle;
import soot.jimple.MethodType;
import soot.jimple.MulExpr;
import soot.jimple.NeExpr;
import soot.jimple.NegExpr;
import soot.jimple.NewArrayExpr;
import soot.jimple.NewExpr;
import soot.jimple.NewMultiArrayExpr;
import soot.jimple.NullConstant;
import soot.jimple.OrExpr;
import soot.jimple.ParameterRef;
import soot.jimple.RemExpr;
import soot.jimple.ShlExpr;
import soot.jimple.ShrExpr;
import soot.jimple.SpecialInvokeExpr;
import soot.jimple.StaticFieldRef;
import soot.jimple.StaticInvokeExpr;
import soot.jimple.StringConstant;
import soot.jimple.SubExpr;
import soot.jimple.ThisRef;
import soot.jimple.UnopExpr;
import soot.jimple.UshrExpr;
import soot.jimple.VirtualInvokeExpr;
import soot.jimple.XorExpr;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PropagateLocalValueSwitch extends AbstractJimpleValueSwitch {

	private static final Logger logger = LogManager.getLogger(PropagateLocalValueSwitch.class.getName());

	static String CROSS_SIGN = "╳";
	static String RECT_SIGN = "🞮";

	private HashMap<Local, iExpr> locals;

	private iExpr tmp;

	public PropagateLocalValueSwitch() {
		locals = new HashMap<Local, iExpr>();
		tmp = null;
	}

	public PropagateLocalValueSwitch(PropagateLocalValueSwitch _old) {
		locals = new HashMap<Local, iExpr>();
		tmp = null;

		for (Entry<Local, iExpr> entry : _old.locals.entrySet())
			locals.put(entry.getKey(), entry.getValue());
	}

	public void addLocal(Local local, iExpr value) {
		locals.put(local, value);
	}

	public boolean containsLocal(Local local) {
		return locals.containsKey(local);
	}

	public iExpr propagate(Value v) {
		// this function is not thread-safe
		// logger.debug("enter propagate");

		iExpr previous_tmp = tmp;
		iExpr ret = null;

		tmp = null;
		v.apply(this);
		ret = tmp;
		tmp = previous_tmp;

		// logger.debug("propagate results is " + ret);
		return ret;
	}

	private void unsupportedExpr() {
		tmp = new iValueExpr(CROSS_SIGN, false);
	}

	@Override
	public void caseArrayRef(ArrayRef v) {
		unsupportedExpr();
	}

	private void handleBinopExpr(BinopExpr v) {
		iBinOp opr = new iBinOp(v.getSymbol());
		iExpr lop = null;
		iExpr rop = null;

		Value op1 = v.getOp1();
		Value op2 = v.getOp2();

		// logger.debug("op1: " + op1);
		// logger.debug("op1 instanceof Local: " + (op1 instanceof Local));
		// if (op1 instanceof Local)
		// 	logger.debug("locals.containsKey: " + (locals.containsKey((Local) op1)));
		// logger.debug("locals: " + locals);

		if ((op1 instanceof Local) && (locals.containsKey((Local) op1)))
			lop = locals.get((Local) op1);
		else
			lop = this.propagate(op1);

		// logger.debug("lop: " + lop);

		if ((op2 instanceof Local) && (locals.containsKey((Local) op2)))
			rop = locals.get((Local) op2);
		else
			rop = this.propagate(op2);

		tmp = new iBinExpr(opr, lop, rop);
	}

	@Override
	public void caseAddExpr(AddExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseAndExpr(AndExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseCmpExpr(CmpExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseCmpgExpr(CmpgExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseCmplExpr(CmplExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseDivExpr(DivExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseEqExpr(EqExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseGeExpr(GeExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseGtExpr(GtExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseLeExpr(LeExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseLtExpr(LtExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseMulExpr(MulExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseNeExpr(NeExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseOrExpr(OrExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseRemExpr(RemExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseShlExpr(ShlExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseShrExpr(ShrExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseSubExpr(SubExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseUshrExpr(UshrExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseXorExpr(XorExpr v) {
		handleBinopExpr(v);
	}

	@Override
	public void caseInterfaceInvokeExpr(InterfaceInvokeExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseSpecialInvokeExpr(SpecialInvokeExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseStaticInvokeExpr(StaticInvokeExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseVirtualInvokeExpr(VirtualInvokeExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseDynamicInvokeExpr(DynamicInvokeExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseCastExpr(CastExpr v) {
		// we keep the type conversion for future investigate
		iUnOp opr = new iUnOp("CAST " + v.getCastType().toString());
		iExpr op = this.propagate(v.getOp());

		tmp = new iUnExpr(opr, op);
	}

	@Override
	public void caseInstanceOfExpr(InstanceOfExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseNewArrayExpr(NewArrayExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseNewMultiArrayExpr(NewMultiArrayExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseNewExpr(NewExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	private void handleUnopExpr(String _opr, UnopExpr v) {
		iUnOp opr = new iUnOp(_opr);
		iExpr op = null;

		Value _op = v.getOp();

		if ((op instanceof Local) && (locals.containsKey((Local) op)))
			op = locals.get((Local) op);
		else
			op = this.propagate(_op);
		
		tmp = new iUnExpr(opr, op);
	}

	@Override
	public void caseLengthExpr(LengthExpr v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseNegExpr(NegExpr v) {
		handleUnopExpr("NEG ", v);
	}

	@Override
	public void caseInstanceFieldRef(InstanceFieldRef v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseLocal(Local v) {
		if (locals.containsKey(v)) 
			tmp = locals.get((Local)v);
		else
			tmp = new iValueExpr(RECT_SIGN, false);
		// logger.debug("v " + v + " is " + tmp + " from locals: " + locals);
	}

	@Override
	public void caseParameterRef(ParameterRef v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseCaughtExceptionRef(CaughtExceptionRef v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseThisRef(ThisRef v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseStaticFieldRef(StaticFieldRef v) {
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void caseDoubleConstant(DoubleConstant v) {
		tmp = new iValueExpr(v.toString(), false);
	}
	    
	@Override
	public void caseFloatConstant(FloatConstant v) {
		tmp = new iValueExpr(v.toString(), false);
	}
	    
	@Override
	public void caseIntConstant(IntConstant v) {
		tmp = new iValueExpr(v.toString(), false);
	}
	    
	@Override
	public void caseLongConstant(LongConstant v) {
		tmp = new iValueExpr(v.toString(), false);
	}
	    
	@Override
	public void caseNullConstant(NullConstant v) {
		tmp = new iValueExpr(v.toString(), false);
	}
	    
	@Override
	public void caseStringConstant(StringConstant v) {
		tmp = new iValueExpr("\"" + v.toString() + "\"", false);
	}
	    
	@Override
	public void caseClassConstant(ClassConstant v) {
		// why we need to propagate on constant expr
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}
	    
	@Override
	public void caseMethodHandle(MethodHandle v) {
		// why we need to propagate on constant expr
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}
	      
	@Override
	public void caseMethodType(MethodType v) {
		// why we need to propagate on constant expr
		// TODO: currently we didn't handle this kind of case
		unsupportedExpr();
	}

	@Override
	public void defaultCase(Object v) {
		// check whether there are unhandled cases
		throw new RuntimeException("Why we can reach here?");
	}
	    
}
