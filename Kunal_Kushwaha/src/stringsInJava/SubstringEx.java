package stringsInJava;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean a=halvesAreAlike("textbook");
System.out.print(a);
	}
	public static boolean halvesAreAlike(String s) {
		int n=s.length();
        String a=s.substring(0,n/2);
        String b= s.substring(n/2,n);
//        System.out.println(a+"\n"+b);
        int a1=0,b1=0;
       char[] x=a.toCharArray();
      for(int i=0;i<x.length;i++)
      {
    	 if(x[i]=='a'|| x[i]=='e'|| x[i]=='i' || x[i]=='o'|| x[i]=='u'|| x[i]=='A'|| x[i]=='E'|| x[i]=='I' || x[i]=='O'|| x[i]=='U')
    	 {
    		 a1=a1+1;
    	 }
      }
      char[] y=b.toCharArray();
      for(int i=0;i<y.length;i++)
      {
    	 if(y[i]=='a'|| y[i]=='e'|| y[i]=='i' || y[i]=='o'|| y[i]=='u'|| y[i]=='A'|| y[i]=='E'|| y[i]=='I' || y[i]=='O'|| y[i]=='U')
    	 {
    		 b1=b1+1;
    	 }
      }
      if(a1==b1)
      {
    	  System.out.println("YES");
    	  return true;
      }
      else 
      {
    	  System.out.println("NO");
      }
        
        return false;
    }
	public static int numOfStrings(String[] patterns, String word) {
      int count=0;
		for(int i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            {
            	count+=1;
            }
        }
        return count;
    }
}
