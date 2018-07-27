package leicode;

public class Person {
	String name;
	int age;
	public Person() {
		System.out.println("不带参数函数执行");
	};
	public Person(int num) {
		System.out.println("不带参数函数执行"+num);
	}
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
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
