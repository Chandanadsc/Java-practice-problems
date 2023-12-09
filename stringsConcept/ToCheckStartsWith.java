package stringsConcept;

public class ToCheckStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s= {"Chandana","Chandini","Charity","saisree","Thribhu"};
int i,c=0,c1=0;
for(i=0;i<s.length;i++)
{
	if(s[i].startsWith("Ch"))
	{
		c++;
	}
	if((s[i].endsWith("n")))
	{
		c1++;
	}
}
System.out.println(c);
System.out.println(c1);
String x="Hello My name is Chandana";
//charAt
System.out.println(x.charAt(3));
//length
System.out.println("length of x is"+x.length());
//The String class valueOf() method coverts given type such as int, long, float,
//double, boolean, char and char array into String.
int a=10;
String s1= String.valueOf(a);
System.out.println(s1+a);
/*
 * The String class replace() method replaces all occurrence of first sequence of 
 * character with second sequence of character.
 */
String replaceString=x.replace("a","dum");
System.out.println(replaceString);
}
	
	
}
