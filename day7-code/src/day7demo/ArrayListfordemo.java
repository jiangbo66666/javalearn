package day7demo;

import java.util.ArrayList;

public class ArrayListfordemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("kasd");
		list.add("可拉斯基的");
		list.add("啊是大");
		list.add("十多年");
		for (int i = 0 ;i < list.size();i++) {
			String a = list.get(i);
			System.out.println(a);
		}
	}
}
