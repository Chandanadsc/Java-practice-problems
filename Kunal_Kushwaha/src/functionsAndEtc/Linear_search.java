package functionsAndEtc;


public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,5,9,4,10,99,67,69,56,34};
 int target=45;
 int x=linearSearch(arr,target);
 if(x==-1)
 {
	 System.out.println("Element not found");
 }
 else 
 {
	 System.out.println("Element found at "+x);
 }
 
	}
	static int linearSearch(int arr[],int target)
	{
		for(int i=0;i< arr.length;i++) {
			if(arr[i]== target== true)
			{
				return i;
			}
		}
		return -1;
	}

}
