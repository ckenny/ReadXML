
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class Example {

    private Document document;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
