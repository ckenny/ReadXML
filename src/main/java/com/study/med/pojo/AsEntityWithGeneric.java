
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;

public class AsEntityWithGeneric {

    private GenericMedicine genericMedicine;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public GenericMedicine getGenericMedicine() {
        return genericMedicine;
    }

    public void setGenericMedicine(GenericMedicine genericMedicine) {
        this.genericMedicine = genericMedicine;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
