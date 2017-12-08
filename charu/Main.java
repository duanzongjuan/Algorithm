package charu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组长度:");
		int l=sc.nextInt();
		int[] arr=new int[l+1];
		Random rand=new Random();
		for(int i=0;i<l;i++) {
			arr[i]=rand.nextInt(100);
		}
		System.out.println("排序前:");
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("排序后:");
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("请输入要插入的数:");
		int m=sc.nextInt();
		for(int i=0;i<l;i++) {
			if(arr[i]>m) {
				for(int j=l-1;j>=i;j--) {
					arr[j+1]=arr[j];
				}
				arr[i]=m;
				break;
			}
		}
		
		for(int i=0;i<l+1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
