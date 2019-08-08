package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 客户端
 * @author wqy
 * @since 2019/8/7
 * */

public class Client {
	
	public static void main(String[] args) {
		// 调用欢迎界面方法
		welcome();
	}
	// 写一个方法输出欢迎界面 
	public static void welcome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("============欢迎来到王者峡谷==========");
		System.out.println("======================================");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏");
		System.out.println("请输入您想进行的操作（1-3）");
		int nextInt = sc.nextInt();
		
		switch(nextInt) {
		case 1:
			//执行开始游戏的方法
			createNewGame();
			break;
		case 2:
			//执行输出游戏规则的方法
			gameRules();
			welcome();
			break;
		case 3:
			//执行游戏结束的方法
			gameOver();
			break;
		default:
			System.out.println("输入有误，请重新输入");
			welcome();
			break;
		}
		
	}	
	// 创建开始游戏的方法
	public static void createNewGame() {
		
		// 创建一个容器来存放游戏角色的信息
		// 数组
		GamePlayer[] player = {};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您游戏角色的姓名:");
		String name = sc.next();
		System.out.println("请输入您游戏角色的种族：（1.人类 2.精灵 3.兽人 4.矮人 5.元素）");
		int race = sc.nextInt();
		
		// 构建一个游戏角色
		GamePlayer gp = new GamePlayer(); 
		gp.name = name;
		gp.race = race;
		
		// 游戏角色容器长度+1 数组扩容
		GamePlayer[] player1 = Arrays.copyOf(player,player.length+1);
		player1[player1.length-1] = gp;
		// 判断是否创建成功 是否容器里有值
		if(player1 != null) {
			System.out.println("创建成功");
			System.out.println("角色："+gp.name);
			System.out.println("种族："+gp.race);
			int power = gp.getPower();
			System.out.println("力量值："+power);
			int physicalPower = gp.getPhysicalPower();
			System.out.println("体力："+physicalPower);
			int wisdom = gp.getWisdom();
			System.out.println("智慧："+wisdom);
			
		}
		welcome();
	}
	
	// 创建游戏规则的方法 
	public static void gameRules() {
		System.out.println("这是游戏规则。。。。。。。。。。");
	}
	
	// 创建游戏结束的方法
	public static void gameOver() {
		System.exit(0);
	}
}
