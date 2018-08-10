package com.study.readxml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.study.readxml.pojo.Student;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class XmlToJson {
    public static void main(String[] args)
    {
        String data;

        try
        {
            // Read the student.xml
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(classLoader.getResource("student.xml").getFile());

            XMLInputFactory f = XMLInputFactory.newFactory();
            XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(file));

            // Create a new XmlMapper to read XML tags
            XmlMapper xmlMapper = new XmlMapper();

            Student s = xmlMapper.readValue(sr, Student.class);

            sr.close();

            System.out.println(s);

        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
