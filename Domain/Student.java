package com.example.studentmanagement.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String stname;
    private int course;
    private int fee;
    
  //  @OneToMany(mappedBy = "course")
  //  private List<Student> student;

    
    //@OneToMany(fetch = FetchType.LAZY,
   //         cascade = CascadeType.ALL,mappedBy = "student")
    //private List<Course> courses;
    
    
    
    
    
    public Student() {
    	
		
	}
   
	public Student(Long id, String stname, int course, int fee) {
	
		this.id = id;
		this.stname = stname;
		this.course = course;
		this.fee = fee;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}






	@Override
	public String toString() {
		return "Student [id=" + id + ", stname=" + stname + ", course=" + course + ", fee=" + fee + "]";
	}
    
	
    
    
    
    
    
    
    
    
	

}
