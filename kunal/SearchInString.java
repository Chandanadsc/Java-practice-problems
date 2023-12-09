package kunal;

public class SearchInString {
public static void main()
{
	
	System.out.print("Enter the String");
	String s="chandana";
	char target='d';
	int x=Strings(s,target);
	if(x==-1)
			{
		System.out.println("Not found");
			}
	else 
	{
		System.out.println("Element found at "+x);
	}

}
static int Strings(String s,char target)
{
	int i;
	for( i=0;i<s.toCharArray().length;i++)
	{
		if(target==s.charAt(i))
		{
			System.out.println("target found at"+i);
			return i;
		}
	}
return -1;
}

}
