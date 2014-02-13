package com.hernsys.bayesian.service.impl;

import java.io.File;
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

    @Override
    public BayesNetwork buildXml03(String pathXmlExample) {
        String pathFile = this.getAbsolutePath() + pathXmlExample;
        return new BayesianBuilder().build(xmlToObject(pathFile));
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

    private String getAbsolutePath() {
        return new File("").getAbsolutePath();
    }

}
