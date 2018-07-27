package day7demo;

import java.util.ArrayList;

public class ArrayListmethoddemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ß£º¬");
		list.add("¹ş¹ş");
		System.out.println(list);
		System.out.println(list.size());
		list.add("Âï¹ş¹ş");
		list.add("akjsd");
		System.out.println(list.size());
		System.out.println(list.get(2));
	}
}
