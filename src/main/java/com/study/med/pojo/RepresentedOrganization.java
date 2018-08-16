
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;


public class RepresentedOrganization {


    private Id id;

    private String name;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Id getId() {
        return id;
    }


    public void setId(Id id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
