package com.maoge.hello;

public class FirstClass {
	public static void main(String[] args) {
		//˳������ǰ��������ִ��
		System.out.println("1");
		System.out.println("2");
		//ѡ�������������ж��Ƿ����ִ��
		int num=10;
		if(num>1) {
			//����������yes
			System.out.println("yes");
		}else {
			//������������no
			System.out.println("no");
		}
		//ѭ�����
		for(int i=0;i<num;i++) {
			//i��ʼ��Ϊ0��ÿ��iС��num��ִ��һ�δ������ڲ�һ�Σ�Ȼ��i��1
			System.out.println(i);
		}
		
	}
}
