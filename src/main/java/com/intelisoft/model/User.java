package com.intelisoft.model;

import java.sql.Date;
import java.util.List;

import com.intelisoft.model.enums.UserRole;

public class User extends Model{

	private static final long serialVersionUID = -6455789831431114570L;

	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
	
	private Integer phoneNumber;
	
	private String address;
	
	private String eMail;
	
	private UserRole userRole;
	
	private List<CurrentCourse> currentCourses;
	
	private List<CostCoefficient> costCoefficients;
	
	private List<CompleteLesson> completeLessons;
	
	private Notiffication notiffication;

	public User() {
	}
	
	public User(String firstName, String lastName, Date birthDate, Integer phoneNumber, String address, String eMail,
			UserRole userRole, List<CurrentCourse> currentCourses, List<CostCoefficient> costCoefficients,
			List<CompleteLesson> completeLessons, Notiffication notiffication) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.eMail = eMail;
		this.userRole = userRole;
		this.currentCourses = currentCourses;
		this.costCoefficients = costCoefficients;
		this.completeLessons = completeLessons;
		this.notiffication = notiffication;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public List<CurrentCourse> getCurrentCourses() {
		return currentCourses;
	}

	public void setCurrentCourses(List<CurrentCourse> currentCourses) {
		this.currentCourses = currentCourses;
	}

	public List<CostCoefficient> getCostCoefficients() {
		return costCoefficients;
	}

	public void setCostCoefficients(List<CostCoefficient> costCoefficients) {
		this.costCoefficients = costCoefficients;
	}

	public List<CompleteLesson> getCompleteLessons() {
		return completeLessons;
	}

	public void setCompleteLessons(List<CompleteLesson> completeLessons) {
		this.completeLessons = completeLessons;
	}

	public Notiffication getNotiffication() {
		return notiffication;
	}

	public void setNotiffication(Notiffication notiffication) {
		this.notiffication = notiffication;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", address=");
		builder.append(address);
		builder.append(", eMail=");
		builder.append(eMail);
		builder.append(", userRole=");
		builder.append(userRole);
		builder.append(", currentCourses=");
		builder.append(currentCourses);
		builder.append(", costCoefficients=");
		builder.append(costCoefficients);
		builder.append(", completeLessons=");
		builder.append(completeLessons);
		builder.append(", notiffication=");
		builder.append(notiffication);
		builder.append("]");
		return builder.toString();
	}

}