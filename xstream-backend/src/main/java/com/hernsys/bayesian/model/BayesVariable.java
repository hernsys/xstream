package com.hernsys.bayesian.model;


public class BayesVariable {
    private String name;
    private int id;
    double[][] probabilities;
    private Object[] outcomes;
    
    
    //lo que le agregue
    private String type;
    double[][] position;
    

    public BayesVariable(String name, int id, Object[] outcomes, double[][] probabilities) {
        this.name = name;
        this.id = id;
        this.probabilities = probabilities;
        this.outcomes = outcomes;
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
}
