
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class Paragraph {

    private Content content;
    private String text;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
