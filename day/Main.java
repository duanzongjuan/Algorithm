package day;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char second;
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ڼ��ĵ�һ����ĸ:");
		String str=sc.next();
		if(str.length()==1) {
			char first=str.charAt(0);
			switch(first) {
			case 'm':
			case 'M':System.out.println("����һ");
			break;
			case 't':
			case 'T':System.out.println("������ڶ����ַ�:");
			str=sc.next();
			if(str.length()==1) {
				second=str.charAt(0);
				if(second=='u' || second=='U') { 
					System.out.println("���ڶ�");
				break;
				} else if(second=='h' || second=='H') {
				System.out.println("������");
				break;
				}
			} else System.out.println("�������,������һ����ĸ!");
			case 'w':
			case 'W':System.out.println("������"); break;
			case 'f':
			case 'F':System.out.println("������");break;
			case 's':
			case 'S':System.out.println("������ڶ����ַ�:");
			str=sc.next();
			if(str.length()==1) {
				second=str.charAt(0);
				if(second=='a' || second=='A') {
					System.out.println("������");
					break;
				} else if(second=='u'||second=='U') {
					System.out.println("������");
					break;
				}
			} else System.out.println("�������,������һ����ĸ");
			default:System.out.println("�������,���������ڼ��ĵ�һ����ĸ!");
			}
		} else System.out.println("�������,������һ����ĸ!");
	}

}
