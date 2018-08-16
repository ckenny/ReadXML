package com.study.readxml.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;


@XmlRootElement(name="student")
public class Student {

    private String id;
    
    private String age;
    
    private Result result;

    private Map<String, Object> additionalProperties = new HashMap<>();


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    
    public String getAge() {
        return age;
    }

    
    public void setAge(String age) {
        this.age = age;
    }

    
    public Result getResult() {
        return result;
    }

    
    public void setResult(Result result) {
        this.result = result;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}