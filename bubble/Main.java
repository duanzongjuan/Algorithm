package bubble;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ĳ���:");
		int l=sc.nextInt();
		Random rand=new Random();
		int[] arr=new int[l];
		for(int i=0;i<l;i++) {
			arr[i]=rand.nextInt(100)+1;
		}
		
		System.out.println("����ǰ:");
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<l;i++) {
			for(int j=1;j<l-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("�����:");
		for(int i=0;i<l;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
