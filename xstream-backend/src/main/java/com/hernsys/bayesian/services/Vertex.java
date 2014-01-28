package com.hernsys.bayesian.services;

import java.util.List;

public interface Vertex<T> {
    
	
	public int getId();

    public List<Edge> getInEdges();

    public List<Edge> getOutEdges();

    public T getContent();

    public void setContent(T content);
    
    
}
