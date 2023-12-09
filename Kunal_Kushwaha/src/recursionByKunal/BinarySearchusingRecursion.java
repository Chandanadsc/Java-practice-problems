package recursionByKunal;

public class BinarySearchusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,4,7,19,89,112,134};
int target=1;
System.out.print(search(arr,target,0,arr.length-1));
	}
	static int search(int[] arr,int target,int s,int e)
	{
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==target)
		{
			return m;
		}
		if(target < arr[m])
		{
			search(arr,target,s,m-1);
		}
		return	search(arr,target,m+1,e);
		
		
	}

}
