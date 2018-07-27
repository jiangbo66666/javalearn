package day7demo;

import java.util.ArrayList;
	
public class herodemo {
	public static void main(String[] args) {
		Hero one = new Hero("Ğì¹ÚĞÛ",10);
		Hero two = new Hero("¿×Áî·É",10);
		Hero three = new Hero("·¶Ë´Óí",10);
		Hero four = new Hero("ÕÅË¼Ô´",100);
		ArrayList<Hero> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		float total = 0;
		for (int i = 0;i < list.size(); i++) {
			Hero hero = list.get(i);
			System.out.println("Ó¢ĞÛ:"+hero.getName()+"Õ½¶·Á¦"+hero.getAttack());
			total +=hero.getAttack();
		}
		System.out.println(total/list.size());
	}
	
}
