package yiwei1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������Ԫ�ظ���n:");
		int n=sc.nextInt();
		System.out.println("������Ҫ�ƶ���λ��m:");
		int m=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			System.out.println("�������"+(i+1)+"��Ԫ��:");
			list.add(sc.nextInt());
		}
		
		System.out.println("����ǰ:");
		for(int i: list) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		List<Integer> temp1=list.subList(list.size()-m, list.size());
		List<Integer> temp2=list.subList(0, list.size()-m);
		temp2.addAll(0,temp1);
		
		System.out.println("�����:");
		for(int i: temp2) {
			System.out.print(i+" ");
		}
	}
}
