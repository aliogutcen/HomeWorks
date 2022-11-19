package oopHomework;

import java.util.Scanner;

public class Employee {

	
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	private int tax;
	private int bonus;
	private int salaryRaise;
	
	//CONST BİLGİLER
	public Employee(String name, int salary, int hireYear) {
		this.name = name;
		this.salary=salary;
		this.hireYear = hireYear;
	}
	// BİLGİLER BİTTİ

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalaryRaise() {
		return salaryRaise;
	}

	public void setSalaryRaise(int salaryRaise) {
		this.salaryRaise = salaryRaise;
	}

	public String getName() {
		return name;
	}

	public int getHireYear() {
		return hireYear;
	}
	
	
	//---
			
	
	public void taxBonus() {
		if(this.salary>2000) {
			this.tax= (this.salary*5)/100;
			System.out.println("Since you earned more than $2000, 5% tax was deducted from your salary.!!"+" "+"Deducted amount="+this.tax);
		}
	
	}
	public void bonusWorkedHours() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many hours did you work this week?");
		int getHours=sc.nextInt();
		this.workHours=getHours;
		if(this.workHours>40) {
			this.bonus=(this.workHours-40)*30;
			System.out.println("For working more than 40 hours, we give you a bonus in return for your work="+this.bonus);
		}
		
	}
	
	public void raiseBonus() {
		int year=2022;
		if(year-this.hireYear<10) {
			this.salaryRaise= (this.salary*5)/100;
			System.out.println("As you have been working in our company for less than 10 years, you will be paid an additional salary="+this.salaryRaise);
		}else if(year-this.hireYear>10 && year-this.hireYear<20) {
			this.salaryRaise= (this.salary*10)/100;
			System.out.println("A bonus has been added to your salary for working for our company for more than 10 years= "+this.salaryRaise);
		}else {
			this.salaryRaise= (this.salary*15)/100;
			System.out.println("For working in our company for more than 20 years, a bonus has been added to your salary= "+this.salaryRaise);
		}
		
	}
		public void getInfo() {
			bonusWorkedHours();
			taxBonus();
			raiseBonus();
		}
		public int salaryBonus() {
			this.salary=this.salary+this.tax+this.bonus+this.salaryRaise;
			return this.salary;
		}
	
		public void employyeInfo() {
		System.out.println("Name= "+this.name);
		System.out.println("Hire Year= "+this.hireYear);
		System.out.println("*******");
		System.out.println("Salary= "+salary);
		System.out.println("Tax="+this.tax);
		System.out.println("Bonus= "+this.bonus);
		System.out.println("Salary Raise="+this.salaryRaise);
		System.out.println("Your salary after bonuses= "+salaryBonus());
	}

}
