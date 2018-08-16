
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class Content {

    
    private String styleCode;

    private String text;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public String getStyleCode() {
        return styleCode;
    }

    
    public void setStyleCode(String styleCode) {
        this.styleCode = styleCode;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
