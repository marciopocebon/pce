package com.sri.csl.xpce.object;


public class Constant extends Term {
	protected Sort sort;

	public Constant(String name) {
		if ( name.startsWith("\'") )
			this.name = name.substring(1,name.length()-1);
		else
			this.name = name;
		this.sort = null;
	}

	public Constant(String name, Sort sort) {
		this.name = name;
		this.sort = sort;
	}
	
	public Sort getSort() {
		return sort;
	}
	

	public String toJSON() {
		return name;
	}
	
	public String toString() {
		if ( name.indexOf(' ') > -1 )
			return "\'" + name + "\'";
		return name;
	}
}
