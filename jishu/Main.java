package jishu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=4,sum=0;
		System.out.println("���1λ����������:"+s);
		s=7*s;
		System.out.println("���2λ����������:"+s);
		for(int j=3;j<9;j++) {
			s=s*8;
			System.out.println("���"+j+"λ����������:"+s);
			sum=sum+s;
		}
		System.out.println("�ܹ���"+(sum+4+28)+"������");
	}
}
