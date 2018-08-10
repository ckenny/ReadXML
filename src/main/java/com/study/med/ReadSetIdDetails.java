package com.study.med;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.study.med.pojo.Document;
import com.study.readxml.pojo.Student;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSetIdDetails {
    public static void main(String[] args) {
        try
        {
            // Read the student.xml
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(classLoader.getResource("setid_sample/3f3183df-3ecf-42a0-970d-f7b3669d9c74.xml").getFile());

            XMLInputFactory f = XMLInputFactory.newFactory();
            XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(file));

            // Create a new XmlMapper to read XML tags
            XmlMapper xmlMapper = new XmlMapper();

            Document document = xmlMapper.readValue(sr, Document.class);

            sr.close();

            System.out.println(document.getTitle());


        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
