package day7demo;

import java.util.ArrayList;
	
public class herodemo {
	public static void main(String[] args) {
		Hero one = new Hero("�����",10);
		Hero two = new Hero("�����",10);
		Hero three = new Hero("��˴��",10);
		Hero four = new Hero("��˼Դ",100);
		ArrayList<Hero> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		float total = 0;
		for (int i = 0;i < list.size(); i++) {
			Hero hero = list.get(i);
			System.out.println("Ӣ��:"+hero.getName()+"ս����"+hero.getAttack());
			total +=hero.getAttack();
		}
		System.out.println(total/list.size());
	}
	
}
