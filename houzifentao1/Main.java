package houzifentao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().ft(0);
		}
	
	static int ts=0;
	static int fs=1;
	static int hs=5;
	static int tsscope=5000;
	public int ft(int t) {
		if(t==tsscope) {  //�����������ڷ�Χʱ,ȡ���ݹ�
			System.out.println("����");
			return 0;
			} else {
				if((t-1)%hs==0 && fs<=hs) {
					if(fs==hs) System.out.println("����Ϊ"+ts);
					fs=fs+1;
					return ft((t-1)/5*4); //����ʣ�µ���������
					} else {
						fs=1; //�ֵĴ�������Ϊ1
						return ft(ts+=1);  //��������1
						}
				}
		}
	}
