
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;








public class Characteristic {

    private Code code;
    private Value value;
    private String classCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
