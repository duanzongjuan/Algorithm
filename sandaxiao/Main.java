package sandaxiao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������������:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b) {
			int temp=a;
			a=b;
			b=temp;
		}
		if(a<c) {
			int temp=a;
			a=c;
			c=temp;
		}
		if(b<c) {
			int temp=b;
			b=c;
			c=temp;
		}
		System.out.print("�Ӵ�С���˳��Ϊ:"+a+" "+b+" "+c);
	}

}
