
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item",
    "listType"
})
public class List {

    @JsonProperty("item")
    private java.util.List<Item> item = null;
    @JsonProperty("listType")
    private String listType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("item")
    public java.util.List<Item> getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(java.util.List<Item> item) {
        this.item = item;
    }

    @JsonProperty("listType")
    public String getListType() {
        return listType;
    }

    @JsonProperty("listType")
    public void setListType(String listType) {
        this.listType = listType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
