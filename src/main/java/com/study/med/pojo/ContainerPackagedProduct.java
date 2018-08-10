
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
    "formCode",
    "asContent"
})
public class ContainerPackagedProduct {

    @JsonProperty("code")
    private String code;
    @JsonProperty("formCode")
    private FormCode formCode;
    @JsonProperty("asContent")
    private AsContent asContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("formCode")
    public FormCode getFormCode() {
        return formCode;
    }

    @JsonProperty("formCode")
    public void setFormCode(FormCode formCode) {
        this.formCode = formCode;
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
