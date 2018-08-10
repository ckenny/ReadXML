
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
        "codeSystem",
        "displayName",
        "reference",
        "mediaType",
        "originalText",
        "code",
        "codeSystem",
        "displayName",
        "xsi:type",
        "unit",
        "value",
        "text"
})
public class Value {

    @JsonProperty("code")
    private String code;
    @JsonProperty("codeSystem")
    private String codeSystem;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("xsi:type")
    private String xsiType;
    @JsonProperty("reference")
    private Reference reference;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("originalText")
    private String originalText;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("value")
    private String value;
    @JsonProperty("text")
    private String text;
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

    @JsonProperty("codeSystem")
    public String getCodeSystem() {
        return codeSystem;
    }

    @JsonProperty("codeSystem")
    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("xsi:type")
    public String getXsiType() {
        return xsiType;
    }

    @JsonProperty("xsi:type")
    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }

    @JsonProperty("reference")
    public Reference getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(Reference reference) {
        this.reference = reference;
    }

    @JsonProperty("mediaType")
    public String getMediaType() {
        return mediaType;
    }

    @JsonProperty("mediaType")
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @JsonProperty("originalText")
    public String getOriginalText() {
        return originalText;
    }

    @JsonProperty("originalText")
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
