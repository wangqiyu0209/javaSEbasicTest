package com.neuedu.test;
/**
 * @author wqy
 * @since 2019/8/7
 * */
import java.util.Random;
import java.util.Scanner;

	public class GameCharacter {
	
		public static void main(String[] args) {
			System.out.println("这是一个RPG游戏：");
			System.out.println("1.开始游戏");
			System.out.println("2.游戏规则");
			System.out.println("3.结束游戏");
			System.out.println("请输入您想进行的操作（1-3）：");
			Scanner num = new Scanner(System.in);
			int i = num.nextInt();
			choose(i);
			gamePerson();
		}
			
		public static void choose(int i) {		
			if(i==1) {
				System.out.println("开始游戏");
				Scanner scanner = new Scanner(System.in);
				System.out.println("请输入您游戏角色的姓名：");
				String name1 = scanner.next();
				System.out.println(name1);
				
				Scanner gameRace = new Scanner(System.in);
				System.out.println("请输入游戏角色的种族：（1.人类 2.精灵 3.兽人 4.矮人 5.元素）");
				int a = gameRace.nextInt();
				chooseRace(a);
				gamePerson();
				
			}else if(i==2) {
				System.out.print("游戏规则:");
				System.out.println("xxxxxxxxxxxxxxxxxxxxx");
				
			}else if(i==3){
				System.out.print("结束游戏:");
				System.out.print("系统退出");
			}
		}
		
		public static void chooseRace(int a) {
			if(a==1) {
				System.out.println("人类");
			}else if(a==2) {
				System.out.println("精灵");
			}
			else if(a==3) {
				System.out.println("兽人");
			}
			else if(a==4) {
				System.out.println("矮人");
			}
			else if(a==5) {
				System.out.println("元素");
			}
			System.out.println("创建成功");
		}
		
		// 声明变量
		String name;
		char sex;
		String race;// 种族
		String occupation; // 职业
		int strength;// 力量
		int quick; //敏捷
		int power;// 体力
		int intellect; // 智力
		int wisdom; // 智慧
		int Life; // 生命值
		int Magic ; // 魔法值		
				
		public static void gamePerson() {
			
			GameCharacter libai = new GameCharacter();
			Random random = new Random();
			
			libai.name = "李白";
			libai.sex = '男';
			libai.race ="精灵";
			libai.occupation = "诗人";

			libai.strength = random.nextInt(10000);
			libai.quick = random.nextInt(10000);
			libai.power = random.nextInt(10000);
			libai.intellect = random.nextInt(10000);
			libai.wisdom = random.nextInt(10000);
			libai.Life = random.nextInt(10000);
			libai.Magic = random.nextInt(10000);
			
			
			System.out.println("******************");
			System.out.println("*姓 名--"+libai.name);
			System.out.println("*性 别--"+libai.sex);
			System.out.println("*种 族--"+libai.race);
			System.out.println("*职 业--"+libai.occupation);
			System.out.println("*力 量--"+libai.strength);
			System.out.println("*敏 捷--"+libai.quick);
			System.out.println("*体 力--"+libai.power);
			System.out.println("*智 力--"+libai.wisdom);
			System.out.println("*生命值--"+libai.Life);
			System.out.println("*魔法值--"+libai.Magic);
			System.out.println("*******************");
		}
		
	
}
			
