package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote �̳�
 * */
public class Question {

	// ���
	public int id;
	// ���
	public String text;
	// ѡ��
	public String[] options;
	
	// ���𰸵ķ���
	public boolean checkAnswer(String[] args) {
		return false;
	}
	
	// ��ӡ��Ŀ������̨
	public void printText() {
		System.out.println("���:"+id+"---���----"+"text");
		for(int i = 0; i<options.length;i++) {
			System.out.println(options[i]);
		}
		
	}
}
