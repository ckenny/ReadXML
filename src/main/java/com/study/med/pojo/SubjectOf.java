
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;







public class SubjectOf {

    private Approval approval;
    private MarketingAct marketingAct;
    private Characteristic characteristic;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Approval getApproval() {
        return approval;
    }

    public void setApproval(Approval approval) {
        this.approval = approval;
    }

    public MarketingAct getMarketingAct() {
        return marketingAct;
    }

    public void setMarketingAct(MarketingAct marketingAct) {
        this.marketingAct = marketingAct;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
