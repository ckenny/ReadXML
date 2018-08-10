
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
    "id",
    "code",
    "effectiveTime",
    "subject",
    "title",
    "text",
    "ID",
    "component"
})
public class Section {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("code")
    private Code code;
    @JsonProperty("effectiveTime")
    private EffectiveTime effectiveTime;
    @JsonProperty("subject")
    private Subject subject;
    @JsonProperty("title")
    private String title;
    @JsonProperty("text")
    private Text text;
    @JsonProperty("ID")
    private String iD;
    @JsonProperty("component")
    private List<Component__> component = null;
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

    @JsonProperty("effectiveTime")
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    @JsonProperty("effectiveTime")
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("component")
    public List<Component__> getComponent() {
        return component;
    }

    @JsonProperty("component")
    public void setComponent(List<Component__> component) {
        this.component = component;
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
