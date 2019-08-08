package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote 继承
 * */
public class SingleQuestion extends Question{

	// 扩展功能 正确答案
	String answer;
	
	// 构建题号 题干 选项和正确答案
	public SingleQuestion(int id,String text,String[] options,String answer) {
		this.id = id;
		this.text = text;
		this.options = options;
		this.answer = answer;
	}

	// 方法的重写
	@Override
	public boolean checkAnswer(String[] answers) {
		
		//首先判断答案是否合法
		if(answers == null || answers.length != 1) {
			return false;
		}
		return this.answer.equals(answers[0]);
		
		
	}
}
