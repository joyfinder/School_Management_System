package application;

public class Student {
	
	private int iD;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/*
	 * Initializing fees for student is $60,000.
	 * Initializing payment for student is 0.
	 * 
	 */
	
	public Student(int id, int grade, String name)
	{
		this.feesPaid = 0;
		this.feesTotal = 60000;
		this.iD = id;
		this.name = name;
		this.grade = grade;
	}
	
	/*
	 * Update student's grade
	 */
	
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	
	/*
	 * Adding fees to feesPaid
	 * & school gains the fees payment
	 */
	
	public void payFees(int fees)
	{
		feesPaid += fees;
		School.updateTotalMoneyGained(feesPaid);
	}

	
	public int getId()
	{
		return iD;
	}
	
	public String getStudentName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public int getFeesTotal()
	{
		return feesTotal;
	}
	
	
	public int getRemainingFees()
	{
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString()
	{
		return "Student name : " + name + "\nTotal fees paid so far $" + feesPaid;
	}
	
}
