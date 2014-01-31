package com.hernsys.bayesian.client.model;

import java.io.Serializable;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class BayesVariable implements Serializable {
    private static final long serialVersionUID = -6018017577352463589L;
    private String name;
    private int id;
    double[][] probabilities;
    private Object[] outcomes;
    
    
    //lo que le agregue
    private String type;
    double[][] position;
    
    private List<String> incomingNodes;
    

    public BayesVariable(){
        
    }
    
    public BayesVariable(String name, int id, Object[] outcomes, double[][] probabilities) {
        this.name = name;
        this.id = id;
        this.probabilities = probabilities;
        this.outcomes = outcomes;
    }
    
    public BayesVariable(String name, int id, Object[] outcomes, double[][] probabilities, List<String> incomingNodes, double[][] position) {
        this.name = name;
        this.id = id;
        this.probabilities = probabilities;
        this.outcomes = outcomes;
        this.incomingNodes = incomingNodes;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double[][] getProbabilities() {
        return probabilities;
    }

    public Object[] getOutcomes() {
        return outcomes;
    }

	public List<String> getIncomingNodes() {
		return incomingNodes;
	}

	public void setIncomingNodes(List<String> incomingNodes) {
		this.incomingNodes = incomingNodes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double[][] getPosition() {
		return position;
	}

	public void setPosition(double[][] position) {
		this.position = position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProbabilities(double[][] probabilities) {
		this.probabilities = probabilities;
	}

	public void setOutcomes(Object[] outcomes) {
		this.outcomes = outcomes;
	}

}
