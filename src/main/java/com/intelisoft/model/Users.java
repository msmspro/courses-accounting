package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

public class Users extends Model{

	private static final long serialVersionUID = -6455789831431114570L;

	private String firstName;
	private String lastName;
	private Date birthDate;
	private Integer phoneNumber;
	private String address;
	private String eMail;
	private UserRole userRole;
	private List<CurrentCourses> currentCourses;
	private List<CostCoefficients> costCoefficients;
	private List<CompleteLessons> completeLessons;
	private Notiffications notiffication;

}
