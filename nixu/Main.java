package nixu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m =new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����:");
		long n=sc.nextInt();
		if(n<0 || n>100000) {
			System.out.println("�������!");
			System.exit(0);
		}
		if(0<=n && n<=9) {
			System.out.println(n+"��һλ��!");
			System.out.println("�����������"+n);
		}
		if(10<=n && n<=99) {
			System.out.println(n+"����λ��!");
			System.out.println("�����������");
			m.converse(n);
		}
		if(100<=n && n<=999) {
			System.out.println(n+"����λ��!");
			System.out.println("�����������");
			m.converse(n);
		}
		if(1000<=n && n<=9999) {
			System.out.println(n+"����λ��!");
			System.out.println("�����������");
			m.converse(n);
		}
		if(10000<=n && n<=99999) {
			System.out.println(n+"����λ��!");
			System.out.println("�����������");
			m.converse(n);
		}
	}
	
	public  void converse(long l) {
		String s=Long.toString(l);
		char[] arr=s.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}