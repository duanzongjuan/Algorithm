package zifuchuanpaixu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ����ĸ���:");
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("�������"+(i+1)+"���ַ���:");
			str[i]=sc.next();
		}
		strSort(str);
		System.out.println("�ַ��������˳��Ϊ:");
		for(int i=0;i<n;i++) {
			System.out.print(str[i]+" ");
		}
	}
	
	public static void strSort(String[] s) {
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(compare(s[i],s[j])==false) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	
	public static boolean compare(String s1,String s2) {
		boolean result=true;
		for(int i=0;i<s1.length()&&i<s2.length();i++) {
			if(s1.charAt(i)>s2.charAt(i)) {
				result=false;
				break;
			} else if(s1.charAt(i)<s2.charAt(i)) {
				result=true;
				break;
			} else {
				if(s1.length()<s2.length()) {
					result=true;
				} else {
					result=false;
				}
			}
		}
		return result;
	}
	
}
