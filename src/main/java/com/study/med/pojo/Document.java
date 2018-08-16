
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;







import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="document")
public class Document {


    private Id id;

    private Code code;
    
    private String title;
    
    private EffectiveTime effectiveTime;
    
    private SetId setId;
    
    private VersionNumber versionNumber;
    
    private Author author;

    private Component component;
    
    private String xmlns;
    
    private String xmlnsXsi;
    
    private String xsiSchemaLocation;

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

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    
    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    
    public SetId getSetId() {
        return setId;
    }

    
    public void setSetId(SetId setId) {
        this.setId = setId;
    }

    
    public VersionNumber getVersionNumber() {
        return versionNumber;
    }

    
    public void setVersionNumber(VersionNumber versionNumber) {
        this.versionNumber = versionNumber;
    }

    
    public Author getAuthor() {
        return author;
    }

    
    public void setAuthor(Author author) {
        this.author = author;
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }

    
    public String getXmlns() {
        return xmlns;
    }

    
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    
    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    
    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    
    public String getXsiSchemaLocation() {
        return xsiSchemaLocation;
    }

    
    public void setXsiSchemaLocation(String xsiSchemaLocation) {
        this.xsiSchemaLocation = xsiSchemaLocation;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
