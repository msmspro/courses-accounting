package com.intelisoft.courses.accounting.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.intelisoft.courses.accounting.models.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "currentCourses", "costCoefficients", "completeLessons", "notiffication" })
@EqualsAndHashCode(callSuper = true, exclude = { "currentCourses", "costCoefficients", "completeLessons",
		"notiffication" })

@Entity
@Table(name = "users")
public class User extends Model {

	private static final long serialVersionUID = -6455789831431114570L;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "phone_number", nullable = false)
	private Integer phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "email", nullable = false)
	private String eMail;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_role", nullable = false)
	private UserRole userRole;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_current_courses", joinColumns = { @JoinColumn(name = "id_users") }, inverseJoinColumns = {
			@JoinColumn(name = "id_current_courses") })
	private List<CurrentCourse> currentCourses = new ArrayList<CurrentCourse>();

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CostCoefficient> costCoefficients = new ArrayList<CostCoefficient>();

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_complete_lessons", joinColumns = { @JoinColumn(name = "id_users") }, inverseJoinColumns = {
			@JoinColumn(name = "id_complete_lessons") })
	private List<CompleteLesson> completeLessons = new ArrayList<CompleteLesson>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_notiffications", referencedColumnName = "id")
	private Notiffication notiffication;

}