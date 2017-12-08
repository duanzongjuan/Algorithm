package charu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数组的长度");
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++) {
			System.out.print("请输入第"+(i+1)+"个信息:");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("排序后:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n请输入要插入的数:");
		int m=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>m) {
				for(int j=n-1;j>=i;j--) {
					arr[j+1]=arr[j];
				}	
				arr[i]=m;
				break;
			}
		}
		System.out.print("插入后:");
		for(int i=0;i<n+1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
