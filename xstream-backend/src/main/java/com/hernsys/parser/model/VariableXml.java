package com.hernsys.parser.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class VariableXml {
	
	@XStreamImplicit(itemFieldName = "VALUE")
	private List<String> value;
	
	@XStreamAlias("TYPE")
	private String type;
	
	
	public List<String> getValue() {
		return value;
	}

	public void setValue(List<String> value) {
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
