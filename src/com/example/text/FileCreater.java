package com.example.text;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * This File writes the object from java objects to Local Text File.
 */
public class FileCreater {

     class TestClass {
        String test1;
        String test2;
        int i;

         @Override
         public String toString() {
             return "TestClass{" +
                     "test1='" + test1 + '\'' +
                     ", test2='" + test2 + '\'' +
                     ", i=" + i +
                     '}';
         }
     }

    public static String getLines(TestClass data) {
        return data.toString();
    }

    public TestClass createTestClass(String test1, String test2, int i) {
        FileCreater.TestClass testClass = new FileCreater.TestClass();
        testClass.test1 = test1;
        testClass.test2 = test2;
        testClass.i =i;
        return testClass;
    }

    public static void main(String args[]) throws IOException {
         FileCreater creater = new FileCreater();
        List<String> lines = Arrays.asList(getLines(creater.createTestClass("Test1", "Is", 1)), getLines(creater.createTestClass("Test2", "Is", 2)));
        Path file = Paths.get("the-file-name.txt");
        Files.write(file, lines, StandardCharsets.UTF_8);


        List<String> lines2 = Arrays.asList(getLines(creater.createTestClass("Test11", "Is", 11)), getLines(creater.createTestClass("Test2", "Is", 2)));
        Path file2 = Paths.get("the-file-name-1.txt");
        Files.write(file2, lines2, StandardCharsets.UTF_8);


    }




}
