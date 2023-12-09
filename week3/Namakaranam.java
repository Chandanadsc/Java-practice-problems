package week3;

 
import java.util.*;
public class Namakaranam {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if(ispallindrome(n))
    {
      System.out.println("is pallindrome");
    }
    else
    {
      System.out.println("not a pallindrome");
    }
    range(n);
  }
public static boolean ispallindrome(int n)
{
  int rev = 0;
      while (n > 0) 
      {
          rev = rev * 10 + n % 10;
          n /= 10;
      }
      return (n==rev);
}
  public static void range(int n)
  {
    for(int i=11;i<=n;i++)
    {
      if(ispallindrome(i))
      {
        System.out.println(i);
      }
    }
  }
}
