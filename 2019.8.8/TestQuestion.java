package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote �̳�
 * ������
 * */
public class TestQuestion {

	public static void main(String[] args) {
		String[] options = {"������" , "����˹̹", "�Ʊ�", "��"};
		SingleQuestion singleQuestion = new SingleQuestion(1,"��������ÿ�������˭",options,"��");
		String[] answers = {"������"};
		boolean checkAnswer = singleQuestion.checkAnswer(answers);
		System.out.println(checkAnswer);
	}
}
