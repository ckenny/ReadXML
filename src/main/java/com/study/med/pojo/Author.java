
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;







public class Author {

    private String time;
    private AssignedEntity assignedEntity;
    private TerritorialAuthority territorialAuthority;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public TerritorialAuthority getTerritorialAuthority() {
        return territorialAuthority;
    }

    public void setTerritorialAuthority(TerritorialAuthority territorialAuthority) {
        this.territorialAuthority = territorialAuthority;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    public void setAssignedEntity(AssignedEntity assignedEntity) {
        this.assignedEntity = assignedEntity;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
