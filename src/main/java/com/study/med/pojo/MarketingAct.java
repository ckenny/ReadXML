
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
    "code",
    "statusCode",
    "effectiveTime"
})
public class MarketingAct {

    @JsonProperty("code")
    private Code code;
    @JsonProperty("statusCode")
    private StatusCode statusCode;
    @JsonProperty("effectiveTime")
    private EffectiveTime effectiveTime;
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

    @JsonProperty("statusCode")
    public StatusCode getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("effectiveTime")
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    @JsonProperty("effectiveTime")
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
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
