package fenjie;

import java.util.Scanner;

public class Main {
	static int z,n,m,a;
	public static void main(String[] args) {
		Fenjie fj=new Fenjie();
		Scanner sc=new Scanner(System.in);
		System.out.println("������������n��ֵ:");
		 n=sc.nextInt();
		 System.out.println("������������m��ֵ:");
		 m=sc.nextInt();
		z=fj.fenjie(n,m);
		a=n*m/z;
		System.out.println("�������Ϊ:"+z);
		System.out.println("��С������Ϊ:"+a);
	}
}

class Fenjie {
	public int  fenjie(int x,int y) {
		int temp;
		if(x<y) {
			temp=x;
			x=y;
			y=temp;
		}
		temp=x%y;
		while(temp!=0) {
			x=y;
			y=temp;
			temp=x%y;
		}
		return y;
	}
}
