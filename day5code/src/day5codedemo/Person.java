package day5codedemo;

public class Person {
	String name;
	private int age;
	public void eat() {
		System.out.println("�ҽ�"+name+"����"+age+"����");
	}
	public void setAge(int num) {
		if(num<0||num>150) {
			System.out.println("���ݴ���");
		}else {
			age = num;
		}
	}
	public int getAge() {
		return age;
	}
}
