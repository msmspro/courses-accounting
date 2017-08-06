package com.intelisoft.courses.accounting.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "courses")
public class Course extends Model {

	private static final long serialVersionUID = -3032038204901394998L;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "cost", nullable = false)
	private Double cost;

	@Column(name = "duration_hours", nullable = false)
	private Float durationHours;

	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lesson> lessons = new ArrayList<Lesson>();

	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.REFRESH }, orphanRemoval = true)
	private List<CurrentCourse> currentCourses = new ArrayList<CurrentCourse>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_directions_of_courses", referencedColumnName = "id")
	private DirectionOfCourses directionOfCourse;
}
