package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote 继承
 * */
public class Question {

	// 题号
	public int id;
	// 题干
	public String text;
	// 选项
	public String[] options;
	
	// 检查答案的方法
	public boolean checkAnswer(String[] args) {
		return false;
	}
	
	// 打印题目到控制台
	public void printText() {
		System.out.println("题号:"+id+"---题干----"+"text");
		for(int i = 0; i<options.length;i++) {
			System.out.println(options[i]);
		}
		
	}
}
