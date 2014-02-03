package com.hernsys.bayesian.client.parser.model;

import java.io.Serializable;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class BayesProbability implements Serializable {

    private static final long serialVersionUID = 1818727344778961803L;
    private String FOR;
    private String GIVEN;
    private String TABLE;

    public String getFOR() {
        return FOR;
    }

    public void setFOR(String fOR) {
        FOR = fOR;
    }

    public String getGIVEN() {
        return GIVEN;
    }

    public void setGIVEN(String gIVEN) {
        GIVEN = gIVEN;
    }

    public String getTABLE() {
        return TABLE;
    }

    public void setTABLE(String tABLE) {
        TABLE = tABLE;
    }

}
