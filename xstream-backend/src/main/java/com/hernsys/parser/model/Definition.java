package com.hernsys.parser.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("DEFINITION")
public class Definition {

	@XStreamAlias("FOR")
	private String name;

	@XStreamImplicit(itemFieldName = "GIVEN")
	private List<String> given;

	@XStreamAlias("TABLE")
	private String probabilities;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getGiven() {
		return given;
	}

	public void setGiven(List<String> given) {
		this.given = given;
	}

	public String getProbabilities() {
		return probabilities;
	}

	public void setProbabilities(String probabilities) {
		this.probabilities = probabilities;
	}

	
	

	
	
}
