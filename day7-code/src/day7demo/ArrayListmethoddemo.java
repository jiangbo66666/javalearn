package day7demo;

import java.util.ArrayList;

public class ArrayListmethoddemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ߣ��");
		list.add("����");
		System.out.println(list);
		System.out.println(list.size());
		list.add("�����");
		list.add("akjsd");
		System.out.println(list.size());
		System.out.println(list.get(2));
	}
}
