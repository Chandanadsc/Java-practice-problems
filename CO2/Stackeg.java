package CO2;
import java.util.Stack;
public class Stackeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<Integer> sp =new Stack<>();
   sp.push(62);
   sp.push(22);
   sp.push(2);
   sp.push(61);
   sp.push(64);
   System.out.print(sp);
   sp.pop();
   sp.pop();
   System.out.print(sp);
	}

}
