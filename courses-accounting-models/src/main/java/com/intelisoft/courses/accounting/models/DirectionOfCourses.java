package com.intelisoft.courses.accounting.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "courses")
@EqualsAndHashCode(callSuper = true, exclude = "courses")

@Entity
@Table(name = "directions_of_courses")
public class DirectionOfCourses extends Model {

	private static final long serialVersionUID = 1324268421228910139L;

	@Column(name = "direction", nullable = false)
	private String direction;

	@OneToMany(mappedBy = "directionOfCourse", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.REFRESH, CascadeType.REMOVE })
	private List<Course> courses = new ArrayList<Course>();
}
