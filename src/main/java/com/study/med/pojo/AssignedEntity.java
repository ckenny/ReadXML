
package com.study.med.pojo;

public class AssignedEntity {

    private RepresentedOrganization representedOrganization;

    public RepresentedOrganization getRepresentedOrganization() {
        return representedOrganization;
    }

    public void setRepresentedOrganization(RepresentedOrganization representedOrganization) {
        this.representedOrganization = representedOrganization;
    }

    @Override
    public String toString() {
        return '{' + "representedOrganization:" + representedOrganization + '}';
    }
}
