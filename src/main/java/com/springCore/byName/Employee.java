package com.springCore.byName;

public class Employee {

	private Answer Answer;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Answer Answer) {
		super();
		this.Answer = Answer;
	}

	public Answer getAnswer() {
		return Answer;
	}

	public void setAnswer(Answer Answer) {
		this.Answer = Answer;
	}

	@Override
	public String toString() {
		return "Employee [answer=" + Answer + "]";
	}
	
	
}
