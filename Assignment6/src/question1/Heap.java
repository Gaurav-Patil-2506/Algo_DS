package question1;

//Implement heap sort using min heap.

public class Heap {

	private int size;

	public Heap() {
		size = 0;
	}

	public void addHeap(int arr[]) {

		size++;
		int ci = size;
		int pi = ci / 2;

		while (pi >= 1) {

			if (arr[ci] > arr[pi]) {
				break;
			}

			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;

			ci = pi;
			pi = ci / 2;

		}

	}

	public int deleteHeap(int arr[]) {
		
		int min = arr[1];
		arr[1] = arr[size];
		arr[size] = min;
		
		size--;
		
		int pi = 1;
		int ci = pi * 2;
		
		while(ci <= size) {

			if((ci + 1) <= size && arr[ci + 1] < arr[ci])
				ci = ci + 1;

			if(arr[pi] < arr[ci])
				break;

			int temp = arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;

			pi = ci;
			ci = pi * 2;
		}
		return min;
		
	}
	public void heapSort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			addHeap(arr);
		}
		
		for (int i = 1; i < arr.length; i++) {
			deleteHeap(arr);
		}
		
		
	}

}

