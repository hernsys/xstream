package com.hernsys.parser.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("VARIABLE")
public class Variable extends VariableXml {

	@XStreamAlias("NAME")
	private String name;

	@XStreamImplicit(itemFieldName = "OUTCOME")
	private List<String> outComes;

	@XStreamAlias("PROPERTY")
	private String position;

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOutComes() {
		return outComes;
	}

	public void setOutComes(List<String> outComes) {
		this.outComes = outComes;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	

}
