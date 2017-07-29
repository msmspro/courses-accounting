package com.intelisoft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course extends Model{

	private static final long serialVersionUID = -3032038204901394998L;

	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "cost", nullable = false)
	private Double cost;
	
	@Column(name = "duration_hours", nullable = false)
	private Float durationHours;
	
	private List<Lesson> lessons;
	
	private List<CurrentCourse> currentCourses;

	public Course() {
	}

	public Course(String name, Double cost, Float durationHours, List<Lesson> lessons,
			List<CurrentCourse> currentCourses) {
		this.name = name;
		this.cost = cost;
		this.durationHours = durationHours;
		this.lessons = lessons;
		this.currentCourses = currentCourses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Float getDurationHours() {
		return durationHours;
	}

	public void setDurationHours(Float durationHours) {
		this.durationHours = durationHours;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	public List<CurrentCourse> getCurrentCourses() {
		return currentCourses;
	}

	public void setCurrentCourses(List<CurrentCourse> currentCourses) {
		this.currentCourses = currentCourses;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", durationHours=");
		builder.append(durationHours);
		builder.append(", lessons=");
		builder.append(lessons);
		builder.append(", currentCourses=");
		builder.append(currentCourses);
		builder.append("]");
		return builder.toString();
	}
	
}
