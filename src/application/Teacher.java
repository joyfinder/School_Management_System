package application;


/*
 * Created by Ta-Liang Lu 14/Nov/2019
 * This class is accountable for keeping track of teacher's name, id, salary.
 */

public class Teacher {
	
	private String name;
	private int id;
	private int salary;
	/*
	 * Create new teacher objects.
	 */
	
	public Teacher(int id, int salary, String name)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	/*
	 * return id, name, salary of teacher
	 */
	public int getId()
	{
		return id;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
//	public void receiveSalary(int salary)
//	{
//		salaryGained += salary;
//	}
	
	@Override
	public String toString()
	{
		return "Name of the Teacher: " + name + "\nTotal salary gained so far $" + salary;
	}
	
}
