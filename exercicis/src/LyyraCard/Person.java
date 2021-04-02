package LyyraCard;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
	
	String name;
	int age;
	MyDate date;
	
	Calendar x=new GregorianCalendar();
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person (String name, int day, int month, int year) {
		this.name=name;
		this.date=new MyDate(day, month, year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		int year = x.get(Calendar.YEAR); 
		age = year-date.getYear();
		
		return age;
	}

	public void setAge(int age) {
		int year = x.get(Calendar.YEAR);
		this.age = year-date.getYear();
	}
	
	public MyDate getDate() {
		return date;
	}
	
	public void setDate(MyDate date) {	
		this.date=date;		
	}
	
	public String toString() {
		
		return "Name: " + name + ", and ages: " + getAge();
		
	}

}
