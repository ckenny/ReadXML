
package com.study.med.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="document", namespace = "urn:hl7-org:v3")
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(title != null) {
            sb.append("\ntitle:'").append(title).append('\'');
        }
        if(effectiveTime != null) {
            if(sb.length()>1) {
                sb.append(',');
            }
            sb.append(" \neffectiveTime:").append(effectiveTime);
        }
        if(setId != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" \nsetId:").append(setId);
        }
        if(versionNumber != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" \nversionNumber:").append(versionNumber);
        }
        if(author != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" \nauthor:").append(author);
        }
        if(component != null) {
            if(sb.length()>1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" \ncomponent:").append(component);
        }
        sb.append("\n}");
        return sb.toString();
    }
}
