package nixu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�����벻����100000��һ��������:");
		String str=sc.next();
		if(str.matches("\\d+")) { // \\d+   ���ֳ���1�λ���
			System.out.println("�������"+str.length()+"λ��!");
			StringBuffer buf=new StringBuffer(str);
			System.out.println(buf.reverse());//�ַ�����ת
		}
	}
}
