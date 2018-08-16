
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class List {

    
    private java.util.List<Item> item = null;
    
    private String listType;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public java.util.List<Item> getItem() {
        return item;
    }

    
    public void setItem(java.util.List<Item> item) {
        this.item = item;
    }

    
    public String getListType() {
        return listType;
    }

    
    public void setListType(String listType) {
        this.listType = listType;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
