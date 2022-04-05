package com.cognizant.passvalueCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("DataFile.xml");
        StudentInfo studentInfo=(StudentInfo) context.getBean("stuInfo");
        studentInfo.printData();
    }


}
