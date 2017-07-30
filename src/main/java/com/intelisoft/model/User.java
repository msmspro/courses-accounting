package com.intelisoft.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.intelisoft.model.enums.UserRole;

@Entity
@Table(name = "users")
public class User extends Model{

	private static final long serialVersionUID = -6455789831431114570L;

	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "birth_date", nullable = true)
	private Date birthDate;
	
	@Column(name = "phone_number", nullable = false)
	private Integer phoneNumber;
	
	@Column(name = "address", nullable = true)
	private String address;
	
	@Column(name = "e-mail", nullable = false)
	private String eMail;
	
	@Column(name = "user_role", nullable = false)
	private UserRole userRole;
	
	@ManyToMany
	@JoinTable(name = "users_current_courses",
	joinColumns = {@JoinColumn(name = "id_users")},
	inverseJoinColumns = {@JoinColumn(name = "id_current_courses")})
	private List<CurrentCourse> currentCourses = new ArrayList<CurrentCourse>();
	
	@OneToMany(mappedBy = "user")
	private List<CostCoefficient> costCoefficients = new ArrayList<CostCoefficient>();
	
	@ManyToMany
	@JoinTable(name = "users_complete_lessons",
	joinColumns = {@JoinColumn(name = "id_users")},
	inverseJoinColumns = {@JoinColumn(name = "id_complete_lessons")})
	private List<CompleteLesson> completeLessons = new ArrayList<CompleteLesson>();
	
	@ManyToOne
	@JoinColumn(name = "id_notiffications", referencedColumnName = "id")
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