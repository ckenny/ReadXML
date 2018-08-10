
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
    "id",
    "code",
    "title",
    "effectiveTime",
    "setId",
    "versionNumber",
    "author",
    "component",
    "xmlns",
    "xmlns:xsi",
    "xsi:schemaLocation"
})
public class Document {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("code")
    private Code code;
    @JsonProperty("title")
    private String title;
    @JsonProperty("effectiveTime")
    private EffectiveTime effectiveTime;
    @JsonProperty("setId")
    private SetId setId;
    @JsonProperty("versionNumber")
    private VersionNumber versionNumber;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("component")
    private Component component;
    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("xmlns:xsi")
    private String xmlnsXsi;
    @JsonProperty("xsi:schemaLocation")
    private String xsiSchemaLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("code")
    public Code getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Code code) {
        this.code = code;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("effectiveTime")
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    @JsonProperty("effectiveTime")
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    @JsonProperty("setId")
    public SetId getSetId() {
        return setId;
    }

    @JsonProperty("setId")
    public void setSetId(SetId setId) {
        this.setId = setId;
    }

    @JsonProperty("versionNumber")
    public VersionNumber getVersionNumber() {
        return versionNumber;
    }

    @JsonProperty("versionNumber")
    public void setVersionNumber(VersionNumber versionNumber) {
        this.versionNumber = versionNumber;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    @JsonProperty("xmlns")
    public String getXmlns() {
        return xmlns;
    }

    @JsonProperty("xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    @JsonProperty("xmlns:xsi")
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    @JsonProperty("xmlns:xsi")
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    @JsonProperty("xsi:schemaLocation")
    public String getXsiSchemaLocation() {
        return xsiSchemaLocation;
    }

    @JsonProperty("xsi:schemaLocation")
    public void setXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
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
