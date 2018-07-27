package day5codedemo;

public class Person {
	String name;
	private int age;
	public void eat() {
		System.out.println("我叫"+name+"今年"+age+"岁了");
	}
	public void setAge(int num) {
		if(num<0||num>150) {
			System.out.println("数据错误");
		}else {
			age = num;
		}
	}
	public int getAge() {
		return age;
	}
}
