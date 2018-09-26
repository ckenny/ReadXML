
package com.study.med.pojo;

import java.util.List;


public class StructuredBody {


    private List<Component> component = null;


    public List<Component> getComponent() {
        return component;
    }


    public void setComponent(List<Component> component) {
        this.component = component;
    }


    @Override
    public String toString() {
        return "{" +
                "component:" + component +
                '}';
    }
}
