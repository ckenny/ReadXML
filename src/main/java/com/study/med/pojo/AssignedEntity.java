
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;

public class AssignedEntity {

    private RepresentedOrganization representedOrganization;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public RepresentedOrganization getRepresentedOrganization() {
        return representedOrganization;
    }

    public void setRepresentedOrganization(RepresentedOrganization representedOrganization) {
        this.representedOrganization = representedOrganization;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
