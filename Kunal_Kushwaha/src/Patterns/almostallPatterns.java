package Patterns;

public class almostallPatterns {
public static void main(String[] args)
{
	int n=5;
	pattern14(n);
}
static void pattern1(int n)
{
	/*
    *****
    *****
    *****
    *****
    *****
	 */
	for(int row=0;row<n;row++)// or for(int row=1;row<=n;row++)
	{
		for(int col=0;col<n;col++)// or for(int col=1;col<=row;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
static void pattern2(int n) {
	/*
	*
    **
    ***
    ****
    *****
	 */
	for(int row=0;row<n;row++)// or for(int row=1;row<=n;row++)
	{
		for(int col=0;col<=row;col++)//or for(int col=1;col<=row+1;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
static void pattern3(int n)
{
	/*
    *****
    ****
    ***
    **
    *
	 */
	for(int row=0;row<n;row++) {
		
		for(int col=0;col<n-row;col++) {
			
			System.out.print("* ");
		}
		System.out.println();
		
	}
}
static void pattern4(int n)
{
	/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
	 */
	for(int row=0;row<n;row++) {
		
		for(int col=0;col<=row;col++) {
			
			System.out.print(col+1+" ");
		}
		System.out.println();
		
	}
}

static void pattern5(int n)
{
	/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
	 */
//	for(int row=0;row<2*n-1;row++) {
//		int col=0;
//		int c=row > n ? 2*n-row+1:row;
//		for( col=0;col<=c;col++) {
//			
//			System.out.print("* ");
//		}
//		System.out.println();
//		
//	}
	for(int i=1;i<=2*n-1;i++)
	{
		if(i<=n)
		{
			for(int col=1;col<=i;col++)
			{
				System.out.print("* ");
			}
		}
		else
		{
			for(int col=2*n-i;col>0;col--)
			{
				System.out.print("* ");
			}
		}
		System.out.println();
	}
}
static void pattern6(int n)
{
	/*
	     *
        **
       ***
      ****
     ***** 
	 */
for(int row=1;row<=n;row++) {
		for(int space=1;space<=n-row;space++)
		{
			System.out.print(" ");
		}
	
		for(int col=1;col<=row;col++) {
			
			System.out.print("* ");
		}
		System.out.println();
		
	}
}
static void pattern7(int n)
{
	/*
	 * 
	 *****
      ****
       ***
        **
         *
	 */
for(int row=1;row<=n;row++) {
		for(int space=1;space<=row;space++)
		{
			System.out.print(" ");
		}
	
		for(int col=1;col<=n-row;col++) {
			
			System.out.print("*");
		}
		System.out.println();
		
	}
}

static void pattern8(int n) {
	/*
	 * 
	    *
       ***
      *****
     *******
    *********
	 */
	
	for(int row=1;row<=n;row++) {
		for(int space=1;space<=n-row;space++)
		{
			System.out.print(" ");
		}
	
		for(int col=1;col<=2*row-1;col=col+1) {
			
			System.out.print("*");
		}
		System.out.println();
		
	}
}
static void pattern9(int n) {
	/*
	*********
     *******
      *****
       ***
        *
	 */
	
	for(int row=n;row>0;row--)
	{
		for(int space=1;space<=n-row;space++)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=2*row-1;col++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}

static void pattern10(int n) {
	/*
	 * 
	     *
        * *
       * * *
      * * * *
     * * * * * 
	 */
	
	for(int row=1;row<=n;row++) {
		for(int space=1;space<=n-row;space++)
		{
			System.out.print(" ");
		}
	
		for(int col=1;col<=2*row-1;col=col+2) {
			
			System.out.print("* ");
		}
		System.out.println();
		
	}
}
static void pattern11(int n) {
	/*
	 * * * * *
      * * * *
       * * *
        * *
         *
        
	 */
	
	for(int row=n;row>0;row--)
	{
		for(int space=1;space<=n-row;space++)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
static void pattern12(int n) {
	/*
	 * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
        
	 */
	
	for(int row=1;row<=2*n-1;row++)
	{
		int s=row<=n?row-1:2*n-1-row;
		int c=row<=n?n-row+1:row-n+1;
		for(int space=1;space<=s;space++)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=c;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
static void pattern14(int n)
{
	/*
	 
	 *********
      *     *
       *   *
        * *
         *

	 */

	for(int row=n; row>=1; row--){//Print each row 
	for(int space=n; space>row; space--){//Print space for Pyramid shape 
	System.out.print(" "); 
	} 
	for(int col=1; col<2*row; col++){//print *
	if(row==n || (col==1 || col==2*row-1))
	 System.out.print("*"); 
	 else {
	 System.out.print(" "); 
	 }

	}
	 System.out.println(""); //move to next line
	}
}
//static void pattern16(int n)
//	{
///*
// *            1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1
// */
//	for(int i=n;i>1;i++)
//	{
//		System.out.println("  ");
//	}
//	for(int j=1;j<)
//	}
//	



}
/*
1.  *****
    *****
    *****
    *****
    *****


2.  *
    **
    ***
    ****
    *****


3.  *****
    ****
    ***
    **
    *


4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *


6.       *
        **
       ***
      ****
     *****


7.   *****
      ****
       ***
        **
         *


8.      *
       ***
      *****
     *******
    *********


9.  *********
     *******
      *****
       ***
        *


10.      *
        * *
       * * *
      * * * *
     * * * * *


11.  * * * * *
      * * * *
       * * *
        * *
         *


12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


13.      *
        * *
       *   *
      *     *
     *********


14.  *********
      *     *
       *   *
        * *
         *


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *


16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


 * */
