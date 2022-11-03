package com.spring.entity;

public class Student {
	
	private int sid;
	private String sname;
	private String semail;
	private double sfees;
	
	private Course course;    // has a relationship
	
	public Student(int sid, String sname, double sfees, String semail, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
		this.semail = semail;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Student details: "+sid+" "+sname+" "+sfees+" "+semail);
		System.out.println(course.toString());
	}
	
}
