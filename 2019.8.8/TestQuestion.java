package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote 继承
 * 测试类
 * */
public class TestQuestion {

	public static void main(String[] args) {
		String[] options = {"爱迪生" , "爱恩斯坦", "科比", "我"};
		SingleQuestion singleQuestion = new SingleQuestion(1,"世界上最好看的人是谁",options,"我");
		String[] answers = {"爱迪生"};
		boolean checkAnswer = singleQuestion.checkAnswer(answers);
		System.out.println(checkAnswer);
	}
}
