package com.intelisoft.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "complete_lessons")
public class CompleteLesson extends Model{

	private static final long serialVersionUID = 7516951076959772739L;

	@Column(name = "date", nullable = false)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "id_current_courses", referencedColumnName = "id")
	private CurrentCourse currentCours;
	
	@ManyToOne
	@JoinColumn(name = "id_lessons", referencedColumnName = "id")
	private Lesson lesson;
	
	@ManyToMany(mappedBy = "completeLessons")
	private List<User> users = new ArrayList<User>();

	public CompleteLesson() {
	}

	public CompleteLesson(Date date, CurrentCourse currentCours, Lesson lesson, List<User> users) {
		this.date = date;
		this.currentCours = currentCours;
		this.lesson = lesson;
		this.users = users;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CurrentCourse getCurrentCours() {
		return currentCours;
	}

	public void setCurrentCours(CurrentCourse currentCours) {
		this.currentCours = currentCours;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompleteLesson [id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", currentCours=");
		builder.append(currentCours);
		builder.append(", lesson=");
		builder.append(lesson);
		builder.append(", users=");
		builder.append(users);
		builder.append("]");
		return builder.toString();
	}
	
}