package day7demo;

import java.util.ArrayList;

public class ArrayListfordemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("kasd");
		list.add("����˹����");
		list.add("���Ǵ�");
		list.add("ʮ����");
		for (int i = 0 ;i < list.size();i++) {
			String a = list.get(i);
			System.out.println(a);
		}
	}
}
