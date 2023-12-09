package nnew;

import java.io.*;  
public class FileWriterExample {
    public static void main(String[] args) {  
        try {  
            FileWriter w = new FileWriter("D:\\chtest.txt");  
            String content = "I love my country";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  