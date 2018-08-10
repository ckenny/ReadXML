
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
    "containerPackagedProduct",
    "subjectOf"
})
public class AsContent {

    @JsonProperty("quantity")
    private Quantity quantity;
    @JsonProperty("containerPackagedProduct")
    private ContainerPackagedProduct containerPackagedProduct;
    @JsonProperty("subjectOf")
    private SubjectOf subjectOf;
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

    @JsonProperty("containerPackagedProduct")
    public ContainerPackagedProduct getContainerPackagedProduct() {
        return containerPackagedProduct;
    }

    @JsonProperty("containerPackagedProduct")
    public void setContainerPackagedProduct(ContainerPackagedProduct containerPackagedProduct) {
        this.containerPackagedProduct = containerPackagedProduct;
    }

    @JsonProperty("subjectOf")
    public SubjectOf getSubjectOf() {
        return subjectOf;
    }

    @JsonProperty("subjectOf")
    public void setSubjectOf(SubjectOf subjectOf) {
        this.subjectOf = subjectOf;
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
