package com.neuedu.test;
/**
 * @author wqy
 * @since 2019/8/7
 * */
import java.util.Random;
import java.util.Scanner;

	public class GameCharacter {
	
		public static void main(String[] args) {
			System.out.println("����һ��RPG��Ϸ��");
			System.out.println("1.��ʼ��Ϸ");
			System.out.println("2.��Ϸ����");
			System.out.println("3.������Ϸ");
			System.out.println("������������еĲ�����1-3����");
			Scanner num = new Scanner(System.in);
			int i = num.nextInt();
			choose(i);
			gamePerson();
		}
			
		public static void choose(int i) {		
			if(i==1) {
				System.out.println("��ʼ��Ϸ");
				Scanner scanner = new Scanner(System.in);
				System.out.println("����������Ϸ��ɫ��������");
				String name1 = scanner.next();
				System.out.println(name1);
				
				Scanner gameRace = new Scanner(System.in);
				System.out.println("��������Ϸ��ɫ�����壺��1.���� 2.���� 3.���� 4.���� 5.Ԫ�أ�");
				int a = gameRace.nextInt();
				chooseRace(a);
				gamePerson();
				
			}else if(i==2) {
				System.out.print("��Ϸ����:");
				System.out.println("xxxxxxxxxxxxxxxxxxxxx");
				
			}else if(i==3){
				System.out.print("������Ϸ:");
				System.out.print("ϵͳ�˳�");
			}
		}
		
		public static void chooseRace(int a) {
			if(a==1) {
				System.out.println("����");
			}else if(a==2) {
				System.out.println("����");
			}
			else if(a==3) {
				System.out.println("����");
			}
			else if(a==4) {
				System.out.println("����");
			}
			else if(a==5) {
				System.out.println("Ԫ��");
			}
			System.out.println("�����ɹ�");
		}
		
		// ��������
		String name;
		char sex;
		String race;// ����
		String occupation; // ְҵ
		int strength;// ����
		int quick; //����
		int power;// ����
		int intellect; // ����
		int wisdom; // �ǻ�
		int Life; // ����ֵ
		int Magic ; // ħ��ֵ		
				
		public static void gamePerson() {
			
			GameCharacter libai = new GameCharacter();
			Random random = new Random();
			
			libai.name = "���";
			libai.sex = '��';
			libai.race ="����";
			libai.occupation = "ʫ��";

			libai.strength = random.nextInt(10000);
			libai.quick = random.nextInt(10000);
			libai.power = random.nextInt(10000);
			libai.intellect = random.nextInt(10000);
			libai.wisdom = random.nextInt(10000);
			libai.Life = random.nextInt(10000);
			libai.Magic = random.nextInt(10000);
			
			
			System.out.println("******************");
			System.out.println("*�� ��--"+libai.name);
			System.out.println("*�� ��--"+libai.sex);
			System.out.println("*�� ��--"+libai.race);
			System.out.println("*ְ ҵ--"+libai.occupation);
			System.out.println("*�� ��--"+libai.strength);
			System.out.println("*�� ��--"+libai.quick);
			System.out.println("*�� ��--"+libai.power);
			System.out.println("*�� ��--"+libai.wisdom);
			System.out.println("*����ֵ--"+libai.Life);
			System.out.println("*ħ��ֵ--"+libai.Magic);
			System.out.println("*******************");
		}
		
	
}
			
