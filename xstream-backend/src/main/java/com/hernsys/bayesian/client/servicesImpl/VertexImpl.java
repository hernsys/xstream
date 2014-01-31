package com.hernsys.bayesian.client.servicesImpl;

import java.util.List;

import com.hernsys.bayesian.client.services.Edge;
import com.hernsys.bayesian.client.services.Vertex;

public class VertexImpl<T> implements Vertex<T> {
	
	private int id;
	private T content;
	
	public VertexImpl(int id){
		this.id = id;
	}

	//@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	//@Override
	public List<Edge> getInEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public List<Edge> getOutEdges() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	

}
