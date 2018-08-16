
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;





public class SubstanceAdministration {

    private RouteCode routeCode;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public RouteCode getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(RouteCode routeCode) {
        this.routeCode = routeCode;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
