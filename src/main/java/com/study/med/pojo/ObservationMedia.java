
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;


public class ObservationMedia {


    private String text;

    private Value value;

    private String iD;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public Value getValue() {
        return value;
    }


    public void setValue(Value value) {
        this.value = value;
    }


    public String getID() {
        return iD;
    }


    public void setID(String iD) {
        this.iD = iD;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
