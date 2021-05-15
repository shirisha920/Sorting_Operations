package Arrays;

import java.util.Scanner;

public class Heap_Sort {
		static int temp;    
		static void heapify(int arr[], int size, int i)  
		{  
		int largest = i;    
		int left = 2*i + 1;    
		int right = 2*i + 2;    
		  
		if (left < size && arr[left] >arr[largest])  
		largest = left;  
		  
		if (right < size && arr[right] > arr[largest])  
		largest = right;  
		  
		if (largest != i)  
		{  
		temp = arr[i];  
		    arr[i]= arr[largest];   
		    arr[largest] = temp;  
		heapify(arr, size, largest);  
		}  
		}  
		  
		static void heapSort(int arr[], int size)  
		{    
		for (int i = size / 2 - 1; i >= 0; i--) {  
		heapify(arr, size, i); 
		}
		for (int i=size-1; i>=0; i--)  
		{  
		temp = arr[0];  
		    arr[0]= arr[i];   
		    arr[i] = temp;  
		heapify(arr, i, 0);  
		}
		}  
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = new int[5];
			System.out.println("enter" + arr.length  + " the numbers :");
			for(int i = 0 ; i < arr.length ; i ++) {
				arr[i] =sc.nextInt();
			}
			heapSort(arr, arr.length);
			System.out.println("Sorted array is : ");
			for(int i = 0 ; i < arr.length ; ++ i ) {
				System.out.print(arr[i] + " ");
				//System.out.println();
			}


	}

}
