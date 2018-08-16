
package com.study.med.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class StructuredBody {


    private List<Component> component = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public List<Component> getComponent() {
        return component;
    }


    public void setComponent(List<Component> component) {
        this.component = component;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
