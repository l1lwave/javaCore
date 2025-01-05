package lesson3firstex;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Group group = new Group();
		group.setGroupName("IP-22-4");
		try {
			group.addStudent(new Student("Alex", "Petrov", Gender.MAN, 18,  1, group.getGroupName()));
			group.addStudent(new Student("Max", "Ivanov", Gender.MAN, 18, 2, group.getGroupName()));
			group.addStudent(new Student("Anna", "Smirno", Gender.WOMAN, 19,  3, group.getGroupName()));
			group.addStudent(new Student("Olya", "Krot", Gender.WOMAN, 20, 4, group.getGroupName()));
			group.addStudent(new Student("katya", "Kashalot", Gender.WOMAN, 25, 5, group.getGroupName()));
			group.addStudent(new Student("Alex", "Novikov", Gender.MAN, 26, 6, group.getGroupName()));
			group.addStudent(new Student("Max", "Azarov", Gender.MAN, 22, 7, group.getGroupName()));
			group.addStudent(new Student("Anna", "Puchkova", Gender.WOMAN, 24, 8, group.getGroupName()));
			group.addStudent(new Student("Olya", "Masya", Gender.WOMAN, 23, 9, group.getGroupName()));
			group.addStudent(new Student("katya", "Kilipa", Gender.WOMAN, 19, 10, group.getGroupName()));
		} catch(GroupOverflowException e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println();

		System.out.println();
		System.out.println(group.toString());

		List<Student> students = group.getStudents();

		List<Student> result = students.stream()
				.filter(a -> a.getAge() > 20)
				.sorted((a,b) -> a.getLastName().compareTo(b.getLastName()))
				.toList();

		for(Student s : result){
			System.out.println(s);
		}
    	sc.close();
    	
	}

}
