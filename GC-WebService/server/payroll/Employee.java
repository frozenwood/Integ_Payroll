package payroll;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Employee{
	private String id;
	private String name;
	private String position;
	private int age;
	private double hourlyRate;
	private char gender;
	private String address;
	private HashMap<String, Double> insurance = new HashMap<String, Double>();

    public Employee() {

    }

	public Employee(String n, String p, int a, double hr, char g, String ad) {
		this.name = n;
		this.position = p;
		this.age = a;
		this.hourlyRate = hr;
		this.gender = g;
		this.address = ad;
	}

	public String getName() {
		return this.name;
	}

	public String getPosition() {
		return this.position;
	}

	public int getAge() {
		return this.age;
	}

	public double getHourlyRate() {
		return this.hourlyRate;
	}

	public char getGender() {
		return this.gender;
	}

	public String getAddress() {
		return this.address;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setPosition(String p) {
		this.position = p;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void setHourlyRate(double hr) {
		this.hourlyRate = hr;
	}

	public void setGender(char g) {
		this.gender = g;
	}

	public void setAddress(String a) {
		this.address = a;
	}

	public void setInsurance(String com, Double val) {
		this.insurance.put(com, val);
	}

	public HashMap getInsurance() {
		return this.insurance;
	}
}