package com.intelisoft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cost_coefficients")
public class CostCoefficient extends Model{

	private static final long serialVersionUID = 4477981143410388861L;
	
	@Column(name = "coefficient", nullable = false)
	private Float coefficient;
	
	private User user;
	
	private List<CurrentCourse> currentCourses;

	public CostCoefficient() {
	}

	public CostCoefficient(Float coefficient, User user, List<CurrentCourse> currentCourses) {
		this.coefficient = coefficient;
		this.user = user;
		this.currentCourses = currentCourses;
	}

	public Float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(Float coefficient) {
		this.coefficient = coefficient;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		builder.append("CostCoefficient [id=");
		builder.append(id);
		builder.append(", coefficient=");
		builder.append(coefficient);
		builder.append(", user=");
		builder.append(user);
		builder.append(", currentCourses=");
		builder.append(currentCourses);
		builder.append("]");
		return builder.toString();
	}
	
}
