package houzifentao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=6;;i++) { //���һֻ�������ٷ�6����
			sum=i;
			for(int j=0;j<5;j++) { //�ֵĴ���ѭ��
				if((sum-1)%5==0 && j<5) { //�����һ�����ܾ���,�����
					sum=(sum-1)/5*4; //ÿ��һ��ʣ��������
				if(j==4) { //����ѷ�5�����ܳ���,���,�˳�����
					System.out.println(i);
					System.exit(0);
					}
				}
			}
		}
	}

}
