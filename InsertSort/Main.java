package InsertSort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("���������鳤��:");
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
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
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

