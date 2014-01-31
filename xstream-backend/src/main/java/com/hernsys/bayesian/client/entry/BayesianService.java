package com.hernsys.bayesian.client.entry;

import org.jboss.errai.bus.server.annotations.Remote;

import com.hernsys.bayesian.client.model.BayesNetwork;
import com.hernsys.bayesian.client.parser.model.Bif;

/**
 * @author horacio
 *
 */
@Remote
public interface BayesianService {
	
	BayesNetwork buildXml03(String pathXmlExample);
	
	Bif xmlToObject(String xmlFileName);
	
}
