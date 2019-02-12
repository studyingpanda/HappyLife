package com.maoge.hello;

public class FirstClass {
	public static void main(String[] args) {
		//顺序语句从前到后依次执行
		System.out.println("1");
		System.out.println("2");
		//选择语句根据条件判断是否成立执行
		int num=10;
		if(num>1) {
			//如果成立输出yes
			System.out.println("yes");
		}else {
			//如果不成立输出no
			System.out.println("no");
		}
		//循环语句
		for(int i=0;i<num;i++) {
			//i初始化为0，每当i小于num，执行一次大括号内部一次，然后i加1
			System.out.println(i);
		}
		
	}
}
