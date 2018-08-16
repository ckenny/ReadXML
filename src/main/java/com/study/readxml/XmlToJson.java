package com.study.readxml;

import com.study.readxml.pojo.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Arrays;

public class XmlToJson {
    public static void main(String[] args)
    {
        try
        {
            // Read the student.xml
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            File file = new File(classLoader.getResource("student.xml").getFile());

            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Student s = (Student) unmarshaller.unmarshal(file);

            System.out.println(s.getId());
            System.out.println(s.getAge());
            System.out.println(Arrays.toString(s.getResult().getSubject()));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
