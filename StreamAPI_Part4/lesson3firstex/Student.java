package lesson3firstex;

import java.util.Objects;

public class Student extends Human{
	private int id;
	private String groupName;
	
	public Student(String name, String lastName, Gender gender, int age, int id, String groupName) {
		super(name, lastName, gender, age);
		this.id = id;
		this.groupName = groupName;
	}
	
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String proupName) {
		this.groupName = proupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName + " " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(groupName, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(groupName, other.groupName) && id == other.id;
	}	
	
	
}
