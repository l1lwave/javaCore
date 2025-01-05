package lesson3firstex;

import java.util.Objects;

public class Human {
	private String name;
	private String lastName;
	private Gender gender;
	private int age;
	
	public Human(String name, String lastName, Gender gender, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public Human() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, lastName, name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return gender == other.gender && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name) && age == other.age;
	}
	
	
	
}
