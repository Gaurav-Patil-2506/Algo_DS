package question.one;

import java.util.Scanner;

public class Question1 {
	
		public static int findLastOccurence(int []array , int key) {
			int lastIndex = -1;
			int comp = 0;
			for(int i = 0 ; i< array.length; i++) {
				comp++ ;				
			if(key == array[i]) {
				lastIndex = i;
				break;
				}
			}
			System.out.println("comp: "  +comp);
			return lastIndex;
					
		}

	
		


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {33,66,22,55,11,88,77,44,99 };
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter key:");
			int key = sc.nextInt();
			
			int index = findLastOccurence(arr ,key);
			if (index!= -1)
				System.out.println("last occurence of Key is at index :" +index  );
			else
				System.out.println("key is not found");
			
			
			sc.close();
		}





		private static int findLastOccurrence(int[] arr, int key) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
