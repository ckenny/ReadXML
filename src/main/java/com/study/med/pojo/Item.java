
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class Item {

    
    private String caption;

    private String text;
    
    private Content content;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public String getCaption() {
        return caption;
    }

    
    public void setCaption(String caption) {
        this.caption = caption;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    
    public Content getContent() {
        return content;
    }

    
    public void setContent(Content content) {
        this.content = content;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
