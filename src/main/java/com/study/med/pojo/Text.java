
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;




public class Text {

    private java.util.List<Paragraph> paragraph = null;
    private java.util.List<List> list = null;
    private java.util.List<RenderMultiMedium> renderMultiMedia = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public java.util.List<Paragraph> getParagraph() {
        return paragraph;
    }

    public void setParagraph(java.util.List<Paragraph> paragraph) {
        this.paragraph = paragraph;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    public java.util.List<RenderMultiMedium> getRenderMultiMedia() {
        return renderMultiMedia;
    }

    public void setRenderMultiMedia(java.util.List<RenderMultiMedium> renderMultiMedia) {
        this.renderMultiMedia = renderMultiMedia;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
