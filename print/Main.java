package print;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=1,num = 0;
		while(n<=7) {
			do {
				System.out.println("������һ��1-50֮�����:");
				num=sc.nextInt();
			}while(num<1 ||num>50);
			for(int i=1;i<num;i++) {
				System.out.print("*");
			}
			System.out.println();
			n++;
		}
	}

}
