
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;

public class Approval {

    private Id id;
    private Code code;
    private Author author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
