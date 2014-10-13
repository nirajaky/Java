class Frog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
//	public void getInfo(){
	//	getName();
	//	getAge();
	//}
}

public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		// frog1.name = "Bestia";
		// frog1.age = 15;
		System.out.println(frog1.getName() + " " + frog1.getAge());

		frog1.setName("Kamil");
		frog1.setAge(23);
		System.out.println(frog1.getName() + " " + frog1.getAge());
		frog1.setInfo("Lolek", 20);
		System.out.println(frog1.getName() + " " + frog1.getAge());
	//	System.out.print(frog1.getInfo());
	}

}
