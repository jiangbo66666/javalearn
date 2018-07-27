package day7demo;

import java.util.ArrayList;

public class persondemo {
	public static void main(String[] args) {
		Person one = new Person("体育",19);
		Person two = new Person("语文",21);
		Person three = new Person("数学",18);
		ArrayList<Person> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		for (int i = 0;i < list.size(); i++) {
			Person per = list.get(i);
			System.out.println("名字："+per.getName()+"年龄："+per.getAge());
		}
	}
}
