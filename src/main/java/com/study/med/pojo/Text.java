
package com.study.med.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "paragraph",
    "list",
    "renderMultiMedia"
})
public class Text {

    @JsonProperty("paragraph")
    private java.util.List<Paragraph> paragraph = null;
    @JsonProperty("list")
    private java.util.List<List> list = null;
    @JsonProperty("renderMultiMedia")
    private java.util.List<RenderMultiMedium> renderMultiMedia = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paragraph")
    public java.util.List<Paragraph> getParagraph() {
        return paragraph;
    }

    @JsonProperty("paragraph")
    public void setParagraph(java.util.List<Paragraph> paragraph) {
        this.paragraph = paragraph;
    }

    @JsonProperty("list")
    public java.util.List<List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    @JsonProperty("renderMultiMedia")
    public java.util.List<RenderMultiMedium> getRenderMultiMedia() {
        return renderMultiMedia;
    }

    @JsonProperty("renderMultiMedia")
    public void setRenderMultiMedia(java.util.List<RenderMultiMedium> renderMultiMedia) {
        this.renderMultiMedia = renderMultiMedia;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
