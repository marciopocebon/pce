package com.sri.csl.xpce.object;

import org.json.JSONException;
import org.json.JSONObject;

import com.sri.csl.xpce.json.XPCEConstants;

public class NotFormula extends Formula {
	Formula formula;
	
	public NotFormula(Formula f) {
		formula = f;
	}

	@Override
	public boolean equals(Object obj) {
		if ( !(obj instanceof NotFormula) ) return false;
		NotFormula other = (NotFormula)obj;
		return formula.equals(other.getInner());
	}

	public Formula getInner() {
		return formula;
	}
	
	@Override
	public JSONObject toJSON() throws JSONException {
		JSONObject obj = new JSONObject();
		obj.put(XPCEConstants.NOT, formula.toJSON());
		return obj;
	}

	@Override
	public String toString() {
		return XPCEConstants.NEGATIONPREFIX + formula;
	}
}
