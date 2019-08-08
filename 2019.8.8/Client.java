package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �ͻ���
 * @author wqy
 * @since 2019/8/7
 * */

public class Client {
	
	public static void main(String[] args) {
		// ���û�ӭ���淽��
		welcome();
	}
	// дһ�����������ӭ���� 
	public static void welcome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("============��ӭ��������Ͽ��==========");
		System.out.println("======================================");
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ");
		System.out.println("������������еĲ�����1-3��");
		int nextInt = sc.nextInt();
		
		switch(nextInt) {
		case 1:
			//ִ�п�ʼ��Ϸ�ķ���
			createNewGame();
			break;
		case 2:
			//ִ�������Ϸ����ķ���
			gameRules();
			welcome();
			break;
		case 3:
			//ִ����Ϸ�����ķ���
			gameOver();
			break;
		default:
			System.out.println("������������������");
			welcome();
			break;
		}
		
	}	
	// ������ʼ��Ϸ�ķ���
	public static void createNewGame() {
		
		// ����һ�������������Ϸ��ɫ����Ϣ
		// ����
		GamePlayer[] player = {};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ϸ��ɫ������:");
		String name = sc.next();
		System.out.println("����������Ϸ��ɫ�����壺��1.���� 2.���� 3.���� 4.���� 5.Ԫ�أ�");
		int race = sc.nextInt();
		
		// ����һ����Ϸ��ɫ
		GamePlayer gp = new GamePlayer(); 
		gp.name = name;
		gp.race = race;
		
		// ��Ϸ��ɫ��������+1 ��������
		GamePlayer[] player1 = Arrays.copyOf(player,player.length+1);
		player1[player1.length-1] = gp;
		// �ж��Ƿ񴴽��ɹ� �Ƿ���������ֵ
		if(player1 != null) {
			System.out.println("�����ɹ�");
			System.out.println("��ɫ��"+gp.name);
			System.out.println("���壺"+gp.race);
			int power = gp.getPower();
			System.out.println("����ֵ��"+power);
			int physicalPower = gp.getPhysicalPower();
			System.out.println("������"+physicalPower);
			int wisdom = gp.getWisdom();
			System.out.println("�ǻۣ�"+wisdom);
			
		}
		welcome();
	}
	
	// ������Ϸ����ķ��� 
	public static void gameRules() {
		System.out.println("������Ϸ���򡣡�����������������");
	}
	
	// ������Ϸ�����ķ���
	public static void gameOver() {
		System.exit(0);
	}
}
