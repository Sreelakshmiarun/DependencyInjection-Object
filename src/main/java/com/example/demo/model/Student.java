package com.example.demo.model;

public class Student {

	private int id;
	private Exam exam;

	public void setId(int id) {
		this.id = id;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	void stu() {
		exam.exam();
		System.out.println("The ID of the Student is:"+ id);
	}
	

}
