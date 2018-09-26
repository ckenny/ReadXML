
package com.study.med.pojo;

public class Component {

    private StructuredBody structuredBody;
    private Section section;
    private ObservationMedia observationMedia;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(structuredBody != null) {
            sb.append("structuredBody:").append(structuredBody);
        }
        if(section != null) {
            if(sb.length() > 1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" section:").append(section);
        }
        if(observationMedia != null) {
            if(sb.length() > 1 && sb.charAt(sb.length()-1) != ',') {
                sb.append(',');
            }
            sb.append(" observationMedia:").append(observationMedia);
        }
        sb.append('}');
        return sb.toString();
    }
}
