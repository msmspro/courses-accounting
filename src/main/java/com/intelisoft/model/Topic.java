package com.intelisoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic extends Model{

	private static final long serialVersionUID = 5176041501520178093L;

	@Column(name = "name", nullable = false)
	private String name;
	
	private Lesson lesson;
	
	public Topic() {
	}

	public Topic(String name, Lesson lesson) {
		this.name = name;
		this.lesson = lesson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Topic [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", lesson=");
		builder.append(lesson);
		builder.append("]");
		return builder.toString();
	}
	
}