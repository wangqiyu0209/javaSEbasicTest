package com.neuedu.test1;
/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * @apiNote �̳�
 * */
public class SingleQuestion extends Question{

	// ��չ���� ��ȷ��
	String answer;
	
	// ������� ��� ѡ�����ȷ��
	public SingleQuestion(int id,String text,String[] options,String answer) {
		this.id = id;
		this.text = text;
		this.options = options;
		this.answer = answer;
	}

	// ��������д
	@Override
	public boolean checkAnswer(String[] answers) {
		
		//�����жϴ��Ƿ�Ϸ�
		if(answers == null || answers.length != 1) {
			return false;
		}
		return this.answer.equals(answers[0]);
		
		
	}
}
