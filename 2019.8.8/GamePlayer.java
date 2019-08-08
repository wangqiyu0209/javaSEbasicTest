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
	// 种族
	public int race;
	// 职业
	public String occupation;
	// 力量
	public int power;
	// 敏捷
	public int agile;
	// 体力
	public int physicalPower;
	// 智慧
	public int wisdom;
	// 生命值
	public int hp;
	// 魔法值
	public int mp;
	
	// 随机生成力量的方法
	public int getPower() {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		return nextInt;
	}
	// 随机生成敏捷的方法
		public int getAgile() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// 随机生成体力的方法
		public int getPhysicalPower() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// 随机生成智慧的方法
		public int getWisdom() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// 随机生成生命值的方法
		public int getHp() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
	// 随机生成魔法值的方法
		public int getMp() {
			Random random = new Random();
			int nextInt = random.nextInt(10000);
			return nextInt;
	}
}
