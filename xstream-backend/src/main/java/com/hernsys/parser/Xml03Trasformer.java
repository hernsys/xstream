package com.hernsys.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.hernsys.bayesian.model.BayesNetwork;
import com.hernsys.parser.model.Bif;
import com.hernsys.parser.model.Definition;
import com.hernsys.parser.model.Network;
import com.hernsys.parser.model.Probability;
import com.thoughtworks.xstream.XStream;


/**
 * This class can read Bayesian ".xml" and ".xml03" 
 * 
 * 
 * @author horacio
 *
 */
public class Xml03Trasformer {
	
	private static String pathXmlExample = "/media/horacio/C/java/comunidad-jboss/OTHERS/xstream/xstream-backend/src/main/resources/com/hernsys/xml03/dog-problem.xml03";
	
	public static void main(String[] args) {
		xml03ToVayes(pathXmlExample);
	}
	
	public static BayesNetwork xml03ToVayes(String pathXmlExample){
		Xml03Trasformer xmlTrasformer = new Xml03Trasformer();
		return new BayesianBuilder().build(xmlTrasformer.xmlToObject(pathXmlExample));
	}
	
	/* Xml to Object*/
	public Bif xmlToObject(String xmlFileName) {
		FileReader reader = null;
		try {
			reader = new FileReader(xmlFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
	    XStream xstream = new XStream();
	    xstream.processAnnotations(Bif.class);
	    xstream.processAnnotations(Network.class); 
	    xstream.processAnnotations(Probability.class);
	    xstream.processAnnotations(Definition.class);
	    Bif data = (Bif) xstream.fromXML(reader); // parse
	    System.out.println("First bif = " + data.getNetwork().getName());
	    System.out.println("size variables = " + data.getNetwork().getVariables().size());
	    System.out.println("size definitions = " + data.getNetwork().getDefinitions().size());
		return data;
	}
	
	
	
	
	
	
	
	
}
