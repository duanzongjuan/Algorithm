package swap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,min=0,temp1,temp2,j,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ĳ���:");
		int l=sc.nextInt();
		int[] arr=new int[l];
		System.out.println("��������������Ԫ��ֵ:");
		for(i=0;i<l;i++) {
			arr[i]=sc.nextInt();	
		}
			for(j=1;j<l;j++) {
				if(arr[j]>arr[max]) max=j;
			}
			temp1=arr[0];
			arr[0]=arr[max];
			arr[max]=temp1;
			for(j=1;j<l;j++) {
				if(arr[j]<arr[min]) min=j;
			}
			temp2=arr[l-1];
			arr[l-1]=arr[min];
			arr[min]=temp2;
			System.out.print("������˳��Ϊ:");
			for(i=0;i<l;i++) {
				System.out.print(arr[i]+" ");
				}
			}
	}
