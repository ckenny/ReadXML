
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class SetId {

    private String root;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
