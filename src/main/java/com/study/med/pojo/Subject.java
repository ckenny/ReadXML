
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
    "manufacturedProduct"
})
public class Subject {

    @JsonProperty("manufacturedProduct")
    private ManufacturedProduct manufacturedProduct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("manufacturedProduct")
    public ManufacturedProduct getManufacturedProduct() {
        return manufacturedProduct;
    }

    @JsonProperty("manufacturedProduct")
    public void setManufacturedProduct(ManufacturedProduct manufacturedProduct) {
        this.manufacturedProduct = manufacturedProduct;
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
