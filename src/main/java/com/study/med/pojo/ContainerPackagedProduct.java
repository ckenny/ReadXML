
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;






public class ContainerPackagedProduct {


    private String code;
    
    private FormCode formCode;
    
    private AsContent asContent;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    
    public FormCode getFormCode() {
        return formCode;
    }

    
    public void setFormCode(FormCode formCode) {
        this.formCode = formCode;
    }

    
    public AsContent getAsContent() {
        return asContent;
    }

    
    public void setAsContent(AsContent asContent) {
        this.asContent = asContent;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
