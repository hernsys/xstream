package com.hernsys.parser;

import com.hernsys.bayesian.model.BayesNetwork;
import com.hernsys.bayesian.model.BayesVariable;
import com.hernsys.bayesian.services.Graph;
import com.hernsys.bayesian.services.Vertex;
import com.hernsys.bayesian.servicesImpl.EdgeImpl;
import com.hernsys.bayesian.servicesImpl.GraphImpl;
import com.hernsys.parser.model.Bif;
import com.hernsys.parser.model.Definition;
import com.hernsys.parser.model.Network;
import com.hernsys.parser.model.Variable;

public class BayesianBuilder {
	
	public BayesNetwork<BayesVariable> build(Bif bif){
		BayesNetwork<BayesVariable> bayesNetwork = new BayesNetwork<BayesVariable>(bif.getNetwork().getName());
		for(Definition def : bif.getNetwork().getDefinitions()){
			Vertex<BayesVariable> nodo = buildVertex(def, bif.getNetwork());
			bayesNetwork.getNodos().add(nodo);
		}
		System.out.println("network name " + bayesNetwork.getName());
		System.out.println("node size " + bayesNetwork.getNodos().size());
		for(Vertex<BayesVariable> nodo : bayesNetwork.getNodos()){
			System.out.println(nodo.getId());
			System.out.println("nodo.getContent().getName() " + nodo.getContent().getName());
			System.out.println("nodo.getContent().getOutcomes() " + nodo.getContent().getOutcomes().length);
			System.out.println("nodo.getContent().getProbabilities() " + nodo.getContent().getProbabilities().length);
		}
		return bayesNetwork;
	}
	
	private Vertex<BayesVariable> buildVertex(Definition def, Network network){
		Graph<BayesVariable> graph = new GraphImpl<BayesVariable>();
		
		Vertex<BayesVariable> nodo = (Vertex<BayesVariable>) graph.addVertex();
		nodo.setContent(new BayesVariable(def.getName(),  
				  						  nodo.getId(), //id 
				  						  this.getOutcomesByVariable(network, def.getName()), // outcomes  
				  						  this.getProbabilities(def.getProbabilities()) // probabilities 
				  		));
		return nodo;
	}
	
	private Object[] getOutcomesByVariable(Network network, String nameDedinition){
		Object[] outcomes = new Object[2]; 
		int position = 0;
		for(Variable var : network.getVariables()){
			if (var.getName().equals(nameDedinition)){
				for(String outcome: var.getOutComes()){
					outcomes[position] = outcome; 
				}
				position += 1;
			}
		}
		return outcomes;
	}
	
	private double[][] getProbabilities(String table){
		double probabilities[][] = new double[table.split(" ").length][table.split(" ").length];
		int i = 0;
		int j = 0;
		for(String prob : table.split(" ")){
			probabilities[i][j] = Double.parseDouble(prob);
			if(i < j){
				i += 1;
			}
			j += 1;
		}
		return probabilities;
	}
	
	
	///////////////////////////////
	
	public BayesVariable build_back(Bif bif){
		Graph<BayesVariable> graph = new GraphImpl<BayesVariable>();
		
		Vertex x0 = (Vertex) graph.addVertex();
		Vertex x1 = (Vertex) graph.addVertex();
		Vertex x2 = (Vertex) graph.addVertex();
		Vertex x3 = (Vertex) graph.addVertex();
		Vertex x4 = (Vertex) graph.addVertex();
		
		connectParentToChildren(x2, x1);
		connectParentToChildren(x3, x1);
		connectParentToChildren(x4, x1);
		
		//How i create the variable and assist it as contect:
		Vertex<BayesVariable> icy = (Vertex<BayesVariable>) graph.addVertex();
		icy.setContent(new BayesVariable("icy", icy.getId(), new Object[]{true},  new double[][]{{0.7, 0.3},{0.7, 0.3}}));
		
		return null;
	}
	
	private void connectParentToChildren(Vertex parent, Vertex... children){
		for(Vertex child : children){
			EdgeImpl e = new EdgeImpl();
			e.setOutVertex(parent);
			e.setInVertex(child);
		}
	}

}