package com.neuedu.test;

import java.util.Random;

/***
 * 
 * @author wqy
 * @since 2019/8/7
 * 
 * */

public class GamePlayer {

	public String name;
	
	public char sex;
	// ����
	public int race;
	// ְҵ
	public String occupation;
	// ����
	public int power;
	// ����
	public int agile;
	// ����
	public int physicalPower;
	// �ǻ�
	public int wisdom;
	// ����ֵ
	public int hp;
	// ħ��ֵ
	public int mp;
	
	// ������������ķ���
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// ����������ݵķ���
		public int getAgile() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// ������������ķ���
		public int getPhysicalPower() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// ��������ǻ۵ķ���
		public int getWisdom() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// �����������ֵ�ķ���
		public int getHp() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// �������ħ��ֵ�ķ���
		public int getMp() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
}
