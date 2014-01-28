package com.hernsys.bayesian.model;

import java.util.ArrayList;
import java.util.List;

import com.hernsys.bayesian.services.Vertex;

public class BayesNetwork<T> {
	
	public BayesNetwork(String name){
		//TODO implement Guava
		this.nodos = new ArrayList<Vertex<T>>();
		this.name = name;
	}
	
	private String name;
	
	private List<Vertex<T>> nodos;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex<T>> getNodos() {
		return nodos;
	}

	public void setNodos(List<Vertex<T>> nodos) {
		this.nodos = nodos;
	}

}
