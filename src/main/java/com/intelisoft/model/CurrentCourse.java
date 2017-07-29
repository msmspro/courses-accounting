package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "current_courses")
public class CurrentCourse extends Model{

	private static final long serialVersionUID = -8179107624184931157L;

	@Column(name = "start_date", nullable = true)
	private Date startDate;
	
	@Column(name = "end_date", nullable = true)
	private Date endDate;
	
	private Course course;
	
	private List<User> users;
	
	private CostCoefficient costCoefficient;
	
	private List<CompleteLesson> completeLessons;
	
	public CurrentCourse() {
	}

	public CurrentCourse(Date startDate, Date endDate, Course course, List<User> users, CostCoefficient costCoefficient,
			List<CompleteLesson> completeLessons) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.users = users;
		this.costCoefficient = costCoefficient;
		this.completeLessons = completeLessons;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public CostCoefficient getCostCoefficient() {
		return costCoefficient;
	}

	public void setCostCoefficient(CostCoefficient costCoefficient) {
		this.costCoefficient = costCoefficient;
	}

	public List<CompleteLesson> getCompleteLessons() {
		return completeLessons;
	}

	public void setCompleteLessons(List<CompleteLesson> completeLessons) {
		this.completeLessons = completeLessons;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrentCourse [id=");
		builder.append(id);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", course=");
		builder.append(course);
		builder.append(", users=");
		builder.append(users);
		builder.append(", costCoefficient=");
		builder.append(costCoefficient);
		builder.append(", completeLessons=");
		builder.append(completeLessons);
		builder.append("]");
		return builder.toString();
	}
		
}
