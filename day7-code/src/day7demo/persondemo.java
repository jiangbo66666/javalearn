package day7demo;

import java.util.ArrayList;

public class persondemo {
	public static void main(String[] args) {
		Person one = new Person("����",19);
		Person two = new Person("����",21);
		Person three = new Person("��ѧ",18);
		ArrayList<Person> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		for (int i = 0;i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println("���֣�"+per.getName()+"���䣺"+per.getAge());
		}
	}
}
