
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class FormCode {


    private String code;
    
    private String codeSystem;
    
    private String displayName;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    
    public String getCodeSystem() {
        return codeSystem;
    }

    
    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    
    public String getDisplayName() {
        return displayName;
    }

    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
