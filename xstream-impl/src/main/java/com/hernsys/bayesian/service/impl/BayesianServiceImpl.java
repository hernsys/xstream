package com.hernsys.bayesian.service.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.enterprise.context.ApplicationScoped;

import org.jboss.errai.bus.server.annotations.Service;

import com.hernsys.bayesian.client.entry.BayesianService;
import com.hernsys.bayesian.client.model.BayesNetwork;
import com.hernsys.bayesian.client.parser.model.Bif;
import com.hernsys.bayesian.client.parser.model.Definition;
import com.hernsys.bayesian.client.parser.model.Network;
import com.hernsys.bayesian.client.parser.model.Probability;
import com.hernsys.bayesian.client.services.BayesianBuilder;
import com.thoughtworks.xstream.XStream;

/**
 * @author horacio
 * 
 */
@Service
@ApplicationScoped
public class BayesianServiceImpl implements BayesianService {

    private static String pathaXmlExample = "/media/horacio/C/java/comunidad-jboss/OTHERS/xstream/xstream-backend/src/main/java/com/hernsys/bayesian/client/resources/dog-problem.xml03";

    @Override
    public BayesNetwork buildXml03(String pathXmlExample) {
        BayesianServiceImpl xmlTrasformer = new BayesianServiceImpl();
        return new BayesianBuilder().build(xmlTrasformer.xmlToObject(pathXmlExample);
    }

    /* Xml to Object */
    @Override
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
        return data;
    }
    
    
}
