package javaiw.io;

import java.io.Serializable;

public class Student implements Serializable {

	private int rollno;
	private String sname;
	private int age, marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, String sname, int age, int marks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", age=" + age + ", marks=" + marks + "]";
	}
		
}
