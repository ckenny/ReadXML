
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;



public class Territory {


    private Code code;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Code getCode() {
        return code;
    }


    public void setCode(Code code) {
        this.code = code;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
