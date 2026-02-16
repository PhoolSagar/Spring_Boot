package in.scalive.beans;

public class Student {
	private int roll;
	private String name;
	
	public Student() {
		System.out.println("Student bean is created");
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("SetRoll called.....");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("SetName called.....");
		this.name = name;
	}
	
	

}
