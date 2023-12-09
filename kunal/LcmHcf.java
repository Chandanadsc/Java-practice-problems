package kunal;
import java.util.Scanner;
public class LcmHcf {

	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input the two numbers
	        System.out.print("Enter first number: ");
	        int num1 = input.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = input.nextInt();

	        // Calculate HCF
	        int hcf = findHCF(num1, num2);

	        // Calculate LCM
	        int lcm = (num1 * num2) / hcf;

	        // Display the results
	        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
	        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
	    }

	    // Function to find the HCF using Euclid's algorithm
	    public static int findHCF(int a, int b) {
	        if (b == 0) {
	            return a;
	        } else {
	            return findHCF(b, a % b);
	        }
	    }
}