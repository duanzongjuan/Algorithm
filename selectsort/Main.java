package selectsort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度:");
		int l=sc.nextInt();
		int[] arr=new int[l];
		for(int i=0;i<l;i++) {
			arr[i]=rand.nextInt(100)+1;
		}
		
		System.out.println("排序前:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		SelectSort.sort(arr);
		
		System.out.println();
		System.out.println("排序后:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

class SelectSort {
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) min=j;	
			}
			swap(arr,i,min);
		}
	}
	
	private static void swap(int[] arr,int i,int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
}
