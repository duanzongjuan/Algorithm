package charu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ĳ���");
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++) {
			System.out.print("�������"+(i+1)+"����Ϣ:");
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
		
		System.out.print("�����:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n������Ҫ�������:");
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
		System.out.print("�����:");
		for(int i=0;i<n+1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
