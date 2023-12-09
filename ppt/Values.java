package ppt;
import java.util.*;
class Values{
int id;
String name;
Values() {
id=10;
name="Arun"; 
}
Values(int n, String str) {
id=n;
name=str;
}
void display(){
System.out.println("Id is :"+ id+"\nName is:"+name); } 
}