
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
    "substanceAdministration"
})
public class ConsumedIn {

    @JsonProperty("substanceAdministration")
    private SubstanceAdministration substanceAdministration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("substanceAdministration")
    public SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    @JsonProperty("substanceAdministration")
    public void setSubstanceAdministration(SubstanceAdministration substanceAdministration) {
        this.substanceAdministration = substanceAdministration;
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
