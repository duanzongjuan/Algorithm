package jiami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ��:");
		String s=sc.next();
		if(!(s.matches("\\d{4}"))) {
			System.out.println("����Ĳ�����λ��");
			System.exit(0);
		}
		char[] c=s.toCharArray();
		int[] a=new int[4];
		for(int i=0;i<4;i++) {
			a[i]=(int)((c[i]-'0')+5)%10;
		}
		int temp;
		temp=a[0];
		a[0]=a[3];
		a[3]=temp;
		temp=a[1];
		a[1]=a[2];
		a[2]=temp;
		
		System.out.println("���ܺ���:"+a[0]+a[1]+a[2]+a[3]);
		
	}

}
