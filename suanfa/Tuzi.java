package suanfa;

public class Tuzi {
	public static void main(String[] args) {
		int[] F=new int[13];
		int i;
		F[0]=F[1]=1;
		System.out.println("1�·�������Ϊ:"+F[0]);
		System.out.println("2�·�������Ϊ:"+F[1]);
		for(i=2;i<=12;i++) {
			F[i]=F[i-1]+F[i-2];
			System.out.println(i+"���ӵ�ֻ��Ϊ:"+F[i]);
		}
	}
}
