package com.hernsys.bayesian.services;

import java.util.Map;

public interface Graph<T> {
	
	
    public Vertex<T> addVertex();

    public Vertex<T> removeVertex(int id);

    public Vertex<T> getVertex(int id);

    public Map<Integer, Vertex<T>> getVertices();


}
