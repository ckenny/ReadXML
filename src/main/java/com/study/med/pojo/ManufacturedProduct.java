
package com.study.med.pojo;

import java.util.List;


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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
//        sb.append("manufacturedProduct=").append(manufacturedProduct);
//        sb.append(", subjectOf=").append(subjectOf);
//        sb.append(", consumedIn=").append(consumedIn);
//        sb.append(", code=").append(code);
        sb.append(" name:'").append(name).append('\'');
//        sb.append(", formCode=").append(formCode);
//        sb.append(", asEntityWithGeneric=").append(asEntityWithGeneric);
//        sb.append(", ingredient=").append(ingredient);
//        sb.append(", asContent=").append(asContent);
        sb.append('}');
        return sb.toString();
    }
}
