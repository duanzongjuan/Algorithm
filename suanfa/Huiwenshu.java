package suanfa;

import java.util.Scanner;

public class Huiwenshu {
	public static void main(String[] args) {
		int a,b,c,d,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ��:");
		if(i>100000 && i<10000)
			System.out.println("������һ����λ��!");
		i=sc.nextInt();
			a=i/10000;
			b=i/1000%10;
			c=i%100/10;
			d=i%10;
			if(a==d && b==c)
				System.out.print(i+":�ǻ�����!");
			else 
				System.out.println(i+":���ǻ�����!");
		}
	}

