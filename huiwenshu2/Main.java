package huiwenshu2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ��:");
		String str=sc.next();
		int i=Integer.parseInt(str);
		if(i<10000 || i>99999) {
			System.out.println("�������,������һ����λ��!");
			System.exit(0);
		}
		boolean is=false;
		char[] arr=str.toCharArray();
		for(int j=0;j<arr.length/2;j++) {
			if(arr[j]!=arr[arr.length-1-j]) {	
				is=false;
			}  else  {
				is=true;
			}
		}
			if(is==true) {
				System.out.println(i+"�ǻ�����");
			} else {
				System.out.println(i+"���ǻ�����");
			}
	}
}
