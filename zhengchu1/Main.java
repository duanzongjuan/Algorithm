package zhengchu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������:");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		for(int i=0;temp%9==0;) {
			temp=temp/9;
			count++;
		}
		System.out.println("�ܹ���"+count+"��9������");
	}

}
