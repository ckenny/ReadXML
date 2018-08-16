
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;






public class MarketingAct {


    private Code code;
    private StatusCode statusCode;
    private EffectiveTime effectiveTime;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Code getCode() {
        return code;
    }


    public void setCode(Code code) {
        this.code = code;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
