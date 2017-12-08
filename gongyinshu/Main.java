package gongyinshu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入正整数m:");
		int m=sc.nextInt();
		System.out.println("请输入正整数n:");
		int n=sc.nextInt();
		Main main=new Main();
		int a=fenjie(m,n);
		System.out.println("最大公因数为:"+a);
		int b=m*n/a;
		System.out.println("最小公倍数为:"+b);
		}
	
	public static int fenjie(int x,int y) {
		if(x<y) {
			int temp=x;
			x=y;
			y=temp;
		}
		while(y!=0) {
			int temp=x%y;
			x=y;
			y=temp;
		}
		return x;
	}
}
