
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;






public class EffectiveTime {


    private String value;
    
    private Low low;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    
    public Low getLow() {
        return low;
    }

    
    public void setLow(Low low) {
        this.low = low;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
