package day6democode;

public class Person {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void say (String who ) {
		System.out.println(this.name+"对"+ who +"说" + "你好，我今年"+this.age+"岁");
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
