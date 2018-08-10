package com.study.readxml.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JacksonXmlRootElement(localName = "result")
public class Result {

    @JacksonXmlElementWrapper(localName = "subject", useWrapping = false)
    private Subject [] subject = null;

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }
}