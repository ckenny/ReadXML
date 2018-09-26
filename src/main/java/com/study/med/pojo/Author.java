
package com.study.med.pojo;

public class Author {

    private String time;
    private AssignedEntity assignedEntity;
    private TerritorialAuthority territorialAuthority;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(time != null) sb.append("time:'").append(time).append('\'');
        if(assignedEntity != null) sb.append(", assignedEntity:").append(assignedEntity);
        if(territorialAuthority != null) sb.append(", territorialAuthority:").append(territorialAuthority);
        sb.append('}');
        return sb.toString();
    }
}
