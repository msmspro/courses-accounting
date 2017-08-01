package com.intelisoft.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "current_courses")
public class CurrentCourse extends Model {

	private static final long serialVersionUID = -8179107624184931157L;

	@Column(name = "start_date", nullable = true)
	private Date startDate;

	@Column(name = "end_date", nullable = true)
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "id_courses", referencedColumnName = "id")
	private Course course;

	@ManyToMany(mappedBy = "currentCourses")
	private List<User> users = new ArrayList<User>();

	@ManyToOne
	@JoinColumn(name = "id_cost_coefficients", referencedColumnName = "id")
	private CostCoefficient costCoefficient;

	@OneToMany(mappedBy = "currentCours")
	private List<CompleteLesson> completeLessons = new ArrayList<CompleteLesson>();

}