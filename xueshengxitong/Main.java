package xueshengxitong;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Student {
	private int num;
	private String name;
	private double[] score=new double[3];
	
	public double getAvg() {
		return (score[0]+score[1]+score[2])/3;
	}
	
	public Student(int num,String name,double []score) {
		super();
		this.num=num;
		this.name=name;
		this.score=score;
	}
	
	public String toString() {
		return "ѧ��:"+this.num+"����:"+this.name+"\r\n���Ƴɼ�:\r\n"+score[0]+"\t"+score[1]+"\t"+score[2]+"\r\nƽ���ɼ�\r\n"+this.getAvg();
	}
}

public class Main {
public static Student input() {
			Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ��ѧ��:");
		int num=sc.nextInt();
		System.out.println("������ѧ������:");
		String name=sc.next();
		System.out.println("��������Ƴɼ�:");
		double[] score=new double[3];
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextDouble();
		}
		return new Student(num,name,score);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student[] st=new Student[2];
		for(int i=0;i<st.length;i++) {
			st[i]=input();
		}
		File f=new File("d:"+File.separator+"123.txt");
		FileWriter output=new FileWriter(f);
		for(int i=0;i<st.length;i++) {
			output.write(st[i].toString()+"\r\n");
			output.write("\r\n");
		}
		output.close();
	}

}
