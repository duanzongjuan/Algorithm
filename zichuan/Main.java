package zichuan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������:");
		String str1=sc.nextLine();
		System.out.println("�������Ӵ�:");
		String str2=sc.nextLine();
		
		String[] sa=new String[str1.length()-str2.length()+1]; //�����Ӵ����ȵ�n���ַ�������
		for(int i=0;i<sa.length;i++) {
			sa[i]=str1.substring(i, i+str2.length());
		}
		
		int sum=0;
		//�Ӵ���n�����Ӵ��Ա�
		for(int i=0;i<sa.length;i++) {
			if(sa[i].equals(str2)) {
				sum++; //�ɹ����,��1
				i=i+str2.length(); //�������ص����Ӵ�,�������֮��Ĳ��ֲ���Ӵ�
			}	
		}
		System.out.println("�Ӵ����ֵĴ���Ϊ:"+sum);
	}

}
