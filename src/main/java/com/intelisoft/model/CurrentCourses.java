package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

public class CurrentCourses extends Model{

	private static final long serialVersionUID = -8179107624184931157L;

	private Date startDate;
	private Date endDate;
	private Courses course;
	private List<Users> users;
	private CostCoefficients costCoefficient;
	private List<CompleteLessons> completeLessons;
	
}
