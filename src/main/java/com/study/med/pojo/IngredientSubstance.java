
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;






public class IngredientSubstance {


    private Code code;

    private String name;
    
    private ActiveMoiety activeMoiety;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Code getCode() {
        return code;
    }


    public void setCode(Code code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public ActiveMoiety getActiveMoiety() {
        return activeMoiety;
    }

    
    public void setActiveMoiety(ActiveMoiety activeMoiety) {
        this.activeMoiety = activeMoiety;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
