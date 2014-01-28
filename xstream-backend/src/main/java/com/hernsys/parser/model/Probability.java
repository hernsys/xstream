package com.hernsys.parser.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("PROBABILITY")
public class Probability {

	@XStreamAlias("FOR")
	private String for_;

	@XStreamImplicit(itemFieldName = "GIVEN")
	private List<String> given;

	@XStreamAlias("TABLE")
	private String table;
	
	

	public String getFor_() {
		return for_;
	}

	public void setFor_(String for_) {
		this.for_ = for_;
	}

	public List<String> getGiven() {
		return given;
	}

	public void setGiven(List<String> given) {
		this.given = given;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

}
