package com.intelisoft.model;

import java.util.List;

public class Courses extends Model{

	private static final long serialVersionUID = -3032038204901394998L;

	private String name;
	private Double cost;
	private Float durationHours;
	private List<Lessons> lessons;
	private List<CurrentCourses> currentCourses;

}
