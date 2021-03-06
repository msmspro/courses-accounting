package com.intelisoft.courses.accounting.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "currentCours", "lesson", "users" })
@EqualsAndHashCode(callSuper = true, exclude = { "currentCours", "lesson", "users" })

@Entity
@Table(name = "complete_lessons")
public class CompleteLesson extends Model {

	private static final long serialVersionUID = 7516951076959772739L;

	@Column(name = "date", nullable = false)
	private Date date;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_current_courses", referencedColumnName = "id")
	private CurrentCourse currentCours;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_lessons", referencedColumnName = "id")
	private Lesson lesson;

	@ManyToMany(mappedBy = "completeLessons", fetch = FetchType.LAZY)
	private List<User> users = new ArrayList<User>();

}