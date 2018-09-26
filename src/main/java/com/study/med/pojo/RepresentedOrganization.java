
package com.study.med.pojo;

public class RepresentedOrganization {


    private Id id;

    private String name;


    public Id getId() {
        return id;
    }


    public void setId(Id id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id:" + id + ", name:'" + name + "\'}";
    }
}
