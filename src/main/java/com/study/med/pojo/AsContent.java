
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;

public class AsContent {

    private Quantity quantity;
    private ContainerPackagedProduct containerPackagedProduct;
    private SubjectOf subjectOf;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public ContainerPackagedProduct getContainerPackagedProduct() {
        return containerPackagedProduct;
    }

    public void setContainerPackagedProduct(ContainerPackagedProduct containerPackagedProduct) {
        this.containerPackagedProduct = containerPackagedProduct;
    }

    public SubjectOf getSubjectOf() {
        return subjectOf;
    }

    public void setSubjectOf(SubjectOf subjectOf) {
        this.subjectOf = subjectOf;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
