
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;


public class Component {

    private StructuredBody structuredBody;
    private Section section;
    private ObservationMedia observationMedia;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public StructuredBody getStructuredBody() {
        return structuredBody;
    }

    public void setStructuredBody(StructuredBody structuredBody) {
        this.structuredBody = structuredBody;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public ObservationMedia getObservationMedia() {
        return observationMedia;
    }

    public void setObservationMedia(ObservationMedia observationMedia) {
        this.observationMedia = observationMedia;
    }



    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
