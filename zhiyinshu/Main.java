package zhiyinshu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������:");
		int n=sc.nextInt();
		System.out.println(n+"=");
		Zhishu zs=new Zhishu();
		zs.fenjie(n);
	}
}

class Zhishu {
	public void fenjie(int x) {
		int i;
		for(i=2;i<=x;i++) {
			if(x%i==0) { 
				System.out.print(i);
			if(i!=x) {
				System.out.print("*");
				}
			fenjie(x/i);
			}
		}
		System.exit(0);
	}
}
