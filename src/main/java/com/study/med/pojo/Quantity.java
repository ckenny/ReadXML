
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
    "numerator",
    "denominator"
})
public class Quantity {

    @JsonProperty("numerator")
    private Numerator numerator;
    @JsonProperty("denominator")
    private Denominator denominator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numerator")
    public Numerator getNumerator() {
        return numerator;
    }

    @JsonProperty("numerator")
    public void setNumerator(Numerator numerator) {
        this.numerator = numerator;
    }

    @JsonProperty("denominator")
    public Denominator getDenominator() {
        return denominator;
    }

    @JsonProperty("denominator")
    public void setDenominator(Denominator denominator) {
        this.denominator = denominator;
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
