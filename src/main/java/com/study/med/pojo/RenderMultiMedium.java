
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class RenderMultiMedium {


    private String iD;
    private String referencedObject;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getID() {
        return iD;
    }


    public void setID(String iD) {
        this.iD = iD;
    }

    public String getReferencedObject() {
        return referencedObject;
    }

    public void setReferencedObject(String referencedObject) {
        this.referencedObject = referencedObject;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
