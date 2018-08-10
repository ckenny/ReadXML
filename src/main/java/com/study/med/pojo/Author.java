
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
    "time",
    "assignedEntity",
    "territorialAuthority"
})
public class Author {

    @JsonProperty("time")
    private String time;
    @JsonProperty("assignedEntity")
    private AssignedEntity assignedEntity;
    @JsonProperty("territorialAuthority")
    private TerritorialAuthority territorialAuthority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("territorialAuthority")
    public TerritorialAuthority getTerritorialAuthority() {
        return territorialAuthority;
    }

    @JsonProperty("territorialAuthority")
    public void setTerritorialAuthority(TerritorialAuthority territorialAuthority) {
        this.territorialAuthority = territorialAuthority;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("assignedEntity")
    public AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    @JsonProperty("assignedEntity")
    public void setAssignedEntity(AssignedEntity assignedEntity) {
        this.assignedEntity = assignedEntity;
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
