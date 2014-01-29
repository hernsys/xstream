package com.hernsys.bayesian.client.parser.model;

import java.io.Serializable;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@Portable
public class VariableXml implements Serializable {
	
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