
package com.study.med.pojo;

public class VersionNumber {


    private String value;

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "{value:'" + value + '\'' + '}';
    }
}
