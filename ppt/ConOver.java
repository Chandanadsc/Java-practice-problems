package ppt;
import java.util.*;
class ConOver
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int number;
String sname;
System.out.println("Enter name");
sname=s.nextLine(); 
System.out.println("Enter ID");
number=s.nextInt();
Values v1=new Values();
Values v2=new Values(number,sname);
v1.display();
v2.display(); }}
