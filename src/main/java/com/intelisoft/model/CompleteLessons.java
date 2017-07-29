package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

public class CompleteLessons extends Model{

	private static final long serialVersionUID = 7516951076959772739L;

	private Date date;
	private CurrentCourses currentCours;
	private Lessons lesson;
	private List<Users> users;
	
}
