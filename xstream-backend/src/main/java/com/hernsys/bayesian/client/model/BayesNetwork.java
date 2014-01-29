package com.hernsys.bayesian.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

import com.hernsys.bayesian.client.services.Vertex;

@Portable
public class BayesNetwork<T> implements Serializable {
	
    private static final long serialVersionUID = 6231201134802600033L;



    public BayesNetwork(){
        
    }
    
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
