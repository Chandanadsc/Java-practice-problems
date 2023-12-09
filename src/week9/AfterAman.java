package week9;
import java.util.*;

//public class AfterAman {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner sc=new Scanner (System.in);
//
//ArrayList<StudentforTEST> a1 =new ArrayList<StudentforTEST>();
//a1.add(new StudentforTEST(214,"chandana",30,45,60,70));
//a1.add(new StudentforTEST(213,"Thribhuvana",50,45,30,80));
//a1.add(new StudentforTEST(045,"Sai Sree",20,45,90,100));
//
//for(int i=0;i<a1.size();i++) {
//	System.out.println("Student "+i+1);
//	System.out.println(a1.get(i));
//	System.out.println("\t\t\tTest-1\t\t\tTest-2\t\t\t ALM\t\t\t HA");
//	
//	float test1Total =(float) (a1.get(i).test1/50*7.5);
//	float test2Total =(float) (a1.get(i).test2/50*7.5);
//	float almTotal = (float)a1.get(i).alm/100*10;
//	float haTotal =(float)a1.get(i).ha/100*10;
//   if(test1Total>7.5*0.5)
//   {
//	   System.out.print("\t\t\tPass");
//   }
//   else
//   {
//	   System.out.print("\t\t\tFail");
//   }
//   if(test2Total>7.5*0.5)
//   {
//	   System.out.print("\t\t\tPass");
//   }
//   else
//   {
//	   System.out.print("\t\t\tFail");
//   }
//   if(almTotal>5)
//   {
//	   System.out.print("\t\t\tPass");
//   }
//   else
//   {
//	   System.out.print("\t\t\tFail");
//   }
//   if(haTotal>5)
//   {
//	   System.out.print("\t\t\tPass");
//   }
//   else
//   {
//	   System.out.print("\t\t\tFail");
//   }
//   System.out.println();
//    
//   if(test1Total+test2Total+almTotal+haTotal>0.5*35)
//   {
//	   System.out.println("PASS");
//   }
//   else
//   {
//	   System.out.println("Eligible for Remidial");
//   }
//}
//
//	}
//
//}
//




import java.util.ArrayList;

public class AfterAman {

    public static void main(String[] args) {
        ArrayList<StudentforTEST> students = new ArrayList<>();
        students.add(new StudentforTEST(214, "Chandana", 30, 45, 60, 70));
        students.add(new StudentforTEST(213, "Thribhuvana", 50, 45, 30, 80));
        students.add(new StudentforTEST(45, "Sai Sree", 20, 45, 90, 100));

        for (int i = 0; i < students.size(); i++) {
            StudentforTEST student = students.get(i);
            System.out.println("Student " + (i + 1));
            System.out.println(student);
            printTestResults(student);

            System.out.println();
        }
    }

    private static void printTestResults(StudentforTEST student) {
        System.out.println("\t\t\tTest-1\t\t\tTest-2\t\t\t ALM\t\t\t HA");
        printPassFail("Test-1", student.test1, 50, 7.5 * 0.5);
        printPassFail("Test-2", student.test2, 50, 7.5 * 0.5);
        printPassFail("ALM", student.alm, 100, 5);
        printPassFail("HA", student.ha, 100, 5);
        printFinalResult(student);
    }

    private static void printPassFail(String subject, int marks, int maxMarks, double passThreshold) {
        float total = (float) (marks / maxMarks * passThreshold);
        System.out.print("\t\t\t" + (total > passThreshold ? "Pass" : "Fail"));
    }

    private static void printFinalResult(StudentforTEST student) {
        float totalMarks = student.test1 + student.test2 + student.alm + student.ha;
        if (totalMarks > 0.5 * 35) {
            System.out.println("PASS");
        } else {
            System.out.println("Eligible for Remedial");
        }
    }
}
