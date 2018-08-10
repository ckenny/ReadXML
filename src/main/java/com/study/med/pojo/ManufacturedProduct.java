
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
    "manufacturedProduct",
    "subjectOf",
    "consumedIn"
})
public class ManufacturedProduct {

    @JsonProperty("manufacturedProduct")
    private ManufacturedProduct_ manufacturedProduct;
    @JsonProperty("subjectOf")
    private List<SubjectOf> subjectOf = null;
    @JsonProperty("consumedIn")
    private ConsumedIn consumedIn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("manufacturedProduct")
    public ManufacturedProduct_ getManufacturedProduct() {
        return manufacturedProduct;
    }

    @JsonProperty("manufacturedProduct")
    public void setManufacturedProduct(ManufacturedProduct_ manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
    }

    @JsonProperty("subjectOf")
    public List<SubjectOf> getSubjectOf() {
        return subjectOf;
    }

    @JsonProperty("subjectOf")
    public void setSubjectOf(List<SubjectOf> subjectOf) {
        this.subjectOf = subjectOf;
    }

    @JsonProperty("consumedIn")
    public ConsumedIn getConsumedIn() {
        return consumedIn;
    }

    @JsonProperty("consumedIn")
    public void setConsumedIn(ConsumedIn consumedIn) {
        this.consumedIn = consumedIn;
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
