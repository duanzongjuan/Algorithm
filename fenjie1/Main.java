package fenjie1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������:");
		a=sc.nextInt();
		System.out.println("��������һ��������:");
		b=sc.nextInt();
		Fenjie fj=new Fenjie();
		m=fj.fenjie(a, b);
		n=a*b/m;
		System.out.println("�������Ϊ:"+m);
		System.out.println("��С������Ϊ:"+n);
	}
}

class Fenjie {
	public int fenjie(int x,int y) {
		if(x>y) {
		int temp=x;
			x=y;
			y=temp;
		}
		while(y!=0) {
			int k=x%y;
			x=y;
			y=k;
		}
		return x;
	}
}
