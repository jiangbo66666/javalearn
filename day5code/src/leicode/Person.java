package leicode;

public class Person {
	String name;
	int age;
	public Person() {
		System.out.println("������������ִ��");
	};
	public Person(int num) {
		System.out.println("������������ִ��"+num);
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
