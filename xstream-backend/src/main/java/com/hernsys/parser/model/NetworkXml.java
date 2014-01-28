package com.hernsys.parser.model;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class NetworkXml {
	
	@XStreamImplicit(itemFieldName = "PROBABILITY")
	private List<Probability> probabilities;
	
	
	
	public List<Probability> getProbabilities() {
		return probabilities;
	}

	public void setProbabilities(List<Probability> probabilities) {
		this.probabilities = probabilities;
	}

}
