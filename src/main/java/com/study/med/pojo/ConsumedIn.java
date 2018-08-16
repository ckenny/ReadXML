
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class ConsumedIn {

    
    private SubstanceAdministration substanceAdministration;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    
    public void setSubstanceAdministration(SubstanceAdministration substanceAdministration) {
        this.substanceAdministration = substanceAdministration;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
