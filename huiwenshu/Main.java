package huiwenshu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ��:");
		int n=sc.nextInt();
		if(n<10000 || n>99999) {
			System.out.println("�������!");
			System.exit(0);
		}
		m.panduan(n);
	}
	public void panduan(int x) {
		int a=x/10000;
		int b=x/1000%10;
		int c=x%100/10;
		int d=x%10;
		if(a==d && b==c) {
			System.out.println(x+"�ǻ�����!");
		}
		else System.out.println(x+"���ǻ�����!");
	}
}
