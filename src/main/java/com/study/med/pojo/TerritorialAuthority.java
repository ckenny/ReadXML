
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class TerritorialAuthority {


    private Territory territory;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
