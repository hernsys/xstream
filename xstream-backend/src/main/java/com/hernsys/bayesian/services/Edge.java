package com.hernsys.bayesian.services;

public interface Edge {
	
    public Vertex getOutVertex();

    public Vertex getInVertex();
    
    
    // agregue yo 
    public void setOutVertex(Vertex parent);

    public void setInVertex(Vertex child);
}
