package com.hernsys.bayesian.client.servicesImpl;

import java.util.Map;

import com.hernsys.bayesian.client.services.Graph;
import com.hernsys.bayesian.client.services.Vertex;

public class GraphImpl<T> implements Graph<T> {
	
	private static int id = 0;

	@Override
	public Vertex<T> addVertex() {
		id += 1;
		return new VertexImpl<T>(id);
	}

	@Override
	public Vertex<T> removeVertex(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vertex<T> getVertex(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Vertex<T>> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
