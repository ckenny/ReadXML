
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantity",
    "ingredientSubstance",
    "classCode"
})
public class Ingredient {

    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("ingredientSubstance")
    private IngredientSubstance ingredientSubstance;
    @JsonProperty("classCode")
    private String classCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("ingredientSubstance")
    public IngredientSubstance getIngredientSubstance() {
        return ingredientSubstance;
    }

    @JsonProperty("ingredientSubstance")
    public void setIngredientSubstance(IngredientSubstance ingredientSubstance) {
        this.ingredientSubstance = ingredientSubstance;
    }

    @JsonProperty("classCode")
    public String getClassCode() {
        return classCode;
    }

    @JsonProperty("classCode")
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
