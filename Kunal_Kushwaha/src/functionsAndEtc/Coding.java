package functionsAndEtc;

public class Coding {
public static void main(String [] args)
{
	System.out.println(romanToInt("IX"));
}
public static int romanToInt(String s) {
	int val1=0,val2=0,sum=0;
	String x;
	for(int i=0;i<s.length();i++)
	{
	
		
		 val1=Toretrival(s.charAt(i));
		 
	
if(((s.charAt(i)=='I')&&( s.charAt(i+1))=='V')||((s.charAt(i)=='I')&&( s.charAt(i+1))=='X')||(s.charAt(i)=='I')&&( s.charAt(i+1))=='X')
         
          
		 {
	sum=sum-val1;
}
          sum=sum+val1;
          return sum;
	}
	 return sum;
}
static int Toretrival(char a)
{
    if(a=='I')
    {
    	return 1;
    }
    if(a=='V')
    {
    	return 5;
    }
    if(a=='X')
    {
    	return 10;
    }
    if(a=='L')
    {
    	return 50;
    }
    if(a=='C')
    {
    	return 100;
    }
    if(a=='D')
    {
    	return 500;
    }
    if(a=='M')
    {
    	return 1000;
    }
	return 0;
    
    
}
}
