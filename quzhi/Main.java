package quzhi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��7λ���϶���:");
		long l=sc.nextLong();
		if(l<=999999) {
			System.out.println("�������,����������!");
			System.exit(0);
		}
		String str=Long.toString(l);
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(i>=3 && i<=6) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
