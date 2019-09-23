package com.example.text.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestClass {
    @Getter
    @Setter
    private String test1;
    @Getter
    @Setter
    private String test2;
    @Getter
    @Setter
    private int i;

    public TestClass(String test1, String test2, int i) {
        this.test1 = test1;
        this.test2 = test2;
        this.i = i;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                ", i=" + i +
                '}';
    }
}
