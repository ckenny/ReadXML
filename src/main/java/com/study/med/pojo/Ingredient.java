
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class Ingredient {

    
    private Quantity quantity;
    
    private IngredientSubstance ingredientSubstance;
    
    private String classCode;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public Quantity getQuantity() {
        return quantity;
    }

    
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    
    public IngredientSubstance getIngredientSubstance() {
        return ingredientSubstance;
    }

    
    public void setIngredientSubstance(IngredientSubstance ingredientSubstance) {
        this.ingredientSubstance = ingredientSubstance;
    }

    
    public String getClassCode() {
        return classCode;
    }

    
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
