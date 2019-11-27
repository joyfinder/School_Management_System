package application;

import java.util.List;

/*
 * Using arraylists to implement teachers & students
 */

public class School{
	
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyGained;
	private static int totalMoneySpent;
	
	/*
	 * School objects are created in School constructor.
	 */
	
	public School(List<Teacher> teachers, List<Student> students)
	{
		this.teachers = teachers;
		this.students = students;
		totalMoneyGained = 0;
		totalMoneySpent = 0;
	}
	
	/*
	 * Displaying list of teachers in the school.
	 */
	
	public List<Teacher> getTeachers()
	{
		return teachers;
	}
	
	/*
	 * Adding teachers.
	 */
	
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
		updateTotalMoneySpent(teacher.getSalary());
	}
	
	/*
	 * Displaying list of teachers in the school.
	 */
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	/*
	 * Adding students.
	 */
	
	public void addStudent(Student student)
	{
		students.add(student);
		updateTotalMoneyGained(student.getFeesTotal());
	}
	
	/*
	 * Displaying total money gained by school
	 */
	
	public int getTotalMoneyGained()
	{
		return totalMoneyGained;
	}
	
	/*
	 * Adding total money gained by school
	 */
	
	public static void updateTotalMoneyGained(int MoneyGained)
	{
		totalMoneyGained += MoneyGained;
	}
	
	/*
	 * Displaying total money spent by school
	 */
	
	public int getTotalMoneySpent()
	{
		return totalMoneySpent;
	}
	
	/*
	 * Adding total money spent by school
	 * Usually related to teacher's salary
	 */
	
	public static void updateTotalMoneySpent(int MoneySpent)
	{
		totalMoneySpent += MoneySpent;
	}
	
}
