package nnew;
import java.io.*;  
public class FileOutputStreamExample {

	
	    public static void main(String args[]){    
	          /* try{    
	             FileWriter fout=new FileWriter("D:\\chtest.txt");
	             String s="Welcome to javaTpoint.";    
	               //converting string into byte array    
	              fout.write("Welcome to javaTpoint.");
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	        */
	    try{    
            FileInputStream fin=new FileInputStream("D:\\chtest.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         
	  
}
}
