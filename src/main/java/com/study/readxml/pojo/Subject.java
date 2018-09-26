package com.study.readxml.pojo;

import java.util.HashMap;
import java.util.Map;



public class Subject {


    private String name;
    
    private String marks;

    private Map<String, Object> additionalProperties = new HashMap<>();


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public String getMarks() {
        return marks;
    }

    
    public void setMarks(String marks) {
        this.marks = marks;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name:'" + name + '\'' +
                ", marks:'" + marks + '\'' +
                '}';
    }
}