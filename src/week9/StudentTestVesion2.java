package week9;



import java.util.*;
public class StudentTestVesion2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number of students");
	int n = sc.nextInt();
	ArrayList<StudentforTEST> a1= new ArrayList<StudentforTEST>();
	ArrayList<StudentforTEST> remidial = new ArrayList<StudentforTEST>();
	ArrayList<Integer> test1Marks = new ArrayList<Integer>();
	ArrayList<Integer> test2Marks = new ArrayList<Integer>();
	ArrayList<Integer> almMarks = new ArrayList<Integer>();
	ArrayList<Integer> haMarks = new ArrayList<Integer>();
	ArrayList<Double>test1TotalList  = new ArrayList<Double>();
	ArrayList<Double>test2TotalList  = new ArrayList<Double>();
	ArrayList<Double>almTotalList  = new ArrayList<Double>();
	ArrayList<Double>haTotalList  = new ArrayList<Double>();
	ArrayList<Double>TotalTotalList  = new ArrayList<Double>();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the details of Student "+(i+1));
		int test1,test2,alm,ha,rollno;
		String name;
		
		System.out.println("Enter the rollno ");
	    rollno=sc.nextInt();
	    System.out.println("Enter the name ");
	    name= sc.next();
	    System.out.println("Enter the test1 marks ");
	    test1= sc.nextInt();
	    System.out.println("Enter the test2 marks ");
	    test2= sc.nextInt();
	    System.out.println("Enter the alm marks ");
	    alm= sc.nextInt();
	    System.out.println("Enter the Home assignment marks ");
	    ha= sc.nextInt();
	    test1Marks.add(test1);
	    test2Marks.add(test2);
	    almMarks.add(alm);
	    haMarks.add(ha);
	    
	    
	    a1.add(new StudentforTEST(rollno,name,test1,test2,alm,ha));
	    
	  double test1Total=  (float) (test1/50.0)*7.5;
	  test1TotalList.add(test1Total);
	  
	  double test2Total=(float)(test2/50.0)*7.5;
	  test2TotalList.add(test2Total);
	  
	  double almTotal = (float)(alm/100)*10;
	  almTotalList.add(almTotal);
	  
	  double haTotal = (float)(ha/100)*10;
	  haTotalList.add(haTotal);
	 
	 double total = test1Total+test2Total+almTotal+haTotal;
	 TotalTotalList.add(total);
	 System.out.println("The total score obtained by the student"+i+1+" is "+total);
		if(total< 0.5*35)
		{
			
			remidial.add(new StudentforTEST(rollno,name,test1,test2,alm,ha));
		}
		
		
	    
	}
	
//	for(StudentforTEST i:a1)
//	{
//		System.out.println(i);
//	}
	for(int i=0;i<n;i++)
	{ StudentforTEST x= a1.get(i);
		System.out.println(x);
		
	 if(test1TotalList.get(i)<3.75)
	 {
		 System.out.println("Student "+i+1+"Failed in TEST-1");
	 }
	 if(test2TotalList.get(i)<3.75)
	 {
		 System.out.println("Student "+i+1+"Failed in TEST-2");
	 }
	 if(almTotalList.get(i)<5)
	 {
		 System.out.println("Student "+i+1+"Failed in ALM");
	 }
	 if(haTotalList.get(i)<5)
	 {
		 System.out.println("Student "+i+1+"Failed in HA");
	 }
		
	}
	
	System.out.println("\n\n\nRemidial students list and their details");
	for(StudentforTEST y:remidial)
	{
		System.out.println(y);
	}
	
//	for(int i=0;i<n;i++)
//	{
//		System.out.print("Student"+i+1);
//		for (int j=0;j<n;j++)
//		{
//			System.out.println("Test-1\t\t\t\t\t Test-2\t\t\t\t ALM\t\t\t\t HA\t\t\t\t");
//			for(int k=0;k<n;k++)
//			{
//				System.out.print(test1TotalList.get(i)+"\t\t\t\t"+test2TotalList.get(i)+"\t\t\t\t"+almTotalList.get(i)+"\t\t\t\t"+haTotalList.get(i));
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
//	
	for (int i = 0; i < n; i++) {
	    System.out.println("Student " + (i + 1));
	    System.out.println("Test-1\t\t\t\t Test-2\t\t\t\t ALM\t\t\t\t HA");

	   
	        System.out.print(String.format("%.2f\t\t\t\t%.2f\t\t\t\t",test1TotalList.get(i),
	                test2TotalList.get(i)));
	        System.out.print(almTotalList.get(i)+"\t\t\t\t"+haTotalList.get(i));
	        
	               
	        
	    

	    System.out.println();
	}

	
		
		
		
		

	}

}
