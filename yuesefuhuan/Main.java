package yuesefuhuan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������n��ֵ:");
		int n=sc.nextInt();
		boolean[] arr=new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=true;  //�±�Ϊtrue˵������Ȧ��
		}
		
		int leftCount=n;  //����Ȧ�ڵ���
		int countNum=0; //��ȡ�������
		int index=0; 
		
		while(leftCount>1) {
			if(arr[index]==true) {  //������Ȧ��ʱ
				countNum++; //��������
			}
			if(countNum==3) {
				countNum=0; //���㿪ʼ��������
				arr[index]=false; //�����˳�Ȧ��
				leftCount--; //ʣ��������һ
			}
			index++; //ÿ��һ����,�±��1
			if(index==n) {//index��ѭ����,���±����nʱ,˵���Ѿ�����һȦ��
				index=0; //�±�����,���¿�ʼ
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==true) {
				System.out.println("ʣ�µ����ǵ�:"+(i+1)+"����");
			}
		}
	}
}
