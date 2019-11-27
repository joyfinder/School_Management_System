package application;
	
import java.util.ArrayList;
import java.util.List;

/*
 * Created by Ta-Liang Lu 14/Nov/2019
 */

public class Main {
	public static void main(String[] args)
	{
		Teacher annie = new Teacher(1, 2600, "Annie");
		Teacher steven = new Teacher(2, 4500, "Steven");
		Teacher martina = new Teacher(3, 5700, "Martina");
		
		List<Teacher> teacherList = new ArrayList<>();
		List<Student> studentList = new ArrayList<>();
		School taoyuan = new School(teacherList, studentList);
		taoyuan.addTeacher(annie);
		taoyuan.addTeacher(steven);
		taoyuan.addTeacher(martina);
		
		Student chris = new Student(1, 2, "Chris");
		chris.payFees(30000);
		Student sven = new Student(2, 4, "Sven");
		sven.payFees(40000);
		Student harry = new Student(3, 1, "Harry");
		harry.payFees(20000);
		taoyuan.addStudent(chris);
		taoyuan.addStudent(sven);
		taoyuan.addStudent(harry);
		
		
		System.out.println("Taoyuan school recruited " + studentList.size() + " students.\n");
		
		// For loop for iterating student ArrayList
		for(int i = 0, j = 1; i < studentList.size(); i++)
		{
			System.out.print(j + ". ");
			System.out.println(studentList.get(i));
			j++;
		}
		
		System.out.println("\n------Taoyuan school staff Salary List------\n");
		
		System.out.println("Also, Taoyuan school recruited " + teacherList.size() + " teachers.\n");
		
		for(int i = 0, j = 1; i < teacherList.size(); i++)
		{
			System.out.print(j + ". ");
			System.out.println(teacherList.get(i));
			j++;
		}
		
		System.out.println("\nTaoyuan school total spent on staff is: " + taoyuan.getTotalMoneySpent());
		System.out.println("Taoyuan school's balance is: " + taoyuan.getTotalMoneyGained());
		
	}
}
