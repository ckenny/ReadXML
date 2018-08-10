
package com.study.med.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "name",
    "formCode",
    "asEntityWithGeneric",
    "ingredient",
    "asContent"
})
public class ManufacturedProduct_ {

    @JsonProperty("code")
    private Code code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("formCode")
    private FormCode formCode;
    @JsonProperty("asEntityWithGeneric")
    private AsEntityWithGeneric asEntityWithGeneric;
    @JsonProperty("ingredient")
    private List<Ingredient> ingredient = null;
    @JsonProperty("asContent")
    private AsContent asContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Code getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Code code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("formCode")
    public FormCode getFormCode() {
        return formCode;
    }

    @JsonProperty("formCode")
    public void setFormCode(FormCode formCode) {
        this.formCode = formCode;
    }

    @JsonProperty("asEntityWithGeneric")
    public AsEntityWithGeneric getAsEntityWithGeneric() {
        return asEntityWithGeneric;
    }

    @JsonProperty("asEntityWithGeneric")
    public void setAsEntityWithGeneric(AsEntityWithGeneric asEntityWithGeneric) {
        this.asEntityWithGeneric = asEntityWithGeneric;
    }

    @JsonProperty("ingredient")
    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    @JsonProperty("ingredient")
    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
    }

    @JsonProperty("asContent")
    public AsContent getAsContent() {
        return asContent;
    }

    @JsonProperty("asContent")
    public void setAsContent(AsContent asContent) {
        this.asContent = asContent;
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
