
package com.study.med.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Section {

    
    private Id id;

    private Code code;
    
    private EffectiveTime effectiveTime;
    
    private Subject subject;
    
    private String title;
    
    private Text text;
    
    private String iD;

    private List<Component> component = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public Id getId() {
        return id;
    }

    
    public void setId(Id id) {
        this.id = id;
    }


    public Code getCode() {
        return code;
    }


    public void setCode(Code code) {
        this.code = code;
    }

    
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    
    public Subject getSubject() {
        return subject;
    }

    
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public Text getText() {
        return text;
    }

    
    public void setText(Text text) {
        this.text = text;
    }

    
    public String getID() {
        return iD;
    }

    
    public void setID(String iD) {
        this.iD = iD;
    }


    public List<Component> getComponent() {
        return component;
    }


    public void setComponent(List<Component> component) {
        this.component = component;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
