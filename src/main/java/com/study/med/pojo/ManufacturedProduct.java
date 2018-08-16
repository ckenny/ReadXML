
package com.study.med.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class ManufacturedProduct {

    private ManufacturedProduct manufacturedProduct;
    private List<SubjectOf> subjectOf = null;
    private ConsumedIn consumedIn;

    private Code code;

    private String name;
    private FormCode formCode;
    private AsEntityWithGeneric asEntityWithGeneric;
    private List<Ingredient> ingredient = null;
    private AsContent asContent;


    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public ManufacturedProduct getManufacturedProduct() {
        return manufacturedProduct;
    }

    public void setManufacturedProduct(ManufacturedProduct manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
    }

    public List<SubjectOf> getSubjectOf() {
        return subjectOf;
    }

    public void setSubjectOf(List<SubjectOf> subjectOf) {
        this.subjectOf = subjectOf;
    }

    public ConsumedIn getConsumedIn() {
        return consumedIn;
    }

    public void setConsumedIn(ConsumedIn consumedIn) {
        this.consumedIn = consumedIn;
    }


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

    public FormCode getFormCode() {
        return formCode;
    }

    public void setFormCode(FormCode formCode) {
        this.formCode = formCode;
    }

    public AsEntityWithGeneric getAsEntityWithGeneric() {
        return asEntityWithGeneric;
    }

    public void setAsEntityWithGeneric(AsEntityWithGeneric asEntityWithGeneric) {
        this.asEntityWithGeneric = asEntityWithGeneric;
    }

    public List<Ingredient> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<Ingredient> ingredient) {
        this.ingredient = ingredient;
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
