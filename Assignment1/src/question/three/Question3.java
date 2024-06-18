package question.three;
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	static int comp = 0;
	public static int LinearSearch(int []array , int key) {
		int lastIndex = -1;
		
		for(int i = 0 ; i< array.length; i++) {
			comp++ ;				
			if(key == array[i]) {
				lastIndex = i;
				break;
			}
		}
		System.out.println("comp: "  +comp);
		return comp;				
	}
	
	public static int binarySearch(int arr[], int N, int key) {
		Arrays.sort(arr);
		int lastIndex =-1;
		int left=0, right=N-1, mid;
		while(left<=right) {
			comp++;
			mid = (left + right)/2;
			if(key==arr[mid]) {
				lastIndex = mid;
				break;
			}
			else if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		System.out.println("comp: "  +comp);
		return comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {33,66,22,55,11,88,77,44,99 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key:");
		int key = sc.nextInt();
		
		int lin = LinearSearch(arr ,key);
		if (lin!= -1)
			System.out.println("with Linear no of comparisons :" +lin );
		else
			System.out.println("key is not found");	
		
		int bin = binarySearch(arr, arr.length, key);
		if (bin!= -1)
			System.out.println("with binary no of comparisons :" +bin  );
		else
			System.out.println("key is not found");
		
		sc.close();
	}

}
