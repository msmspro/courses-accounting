package com.intelisoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "lessons")
public class Lesson extends Model {

	private static final long serialVersionUID = -1666874779326644816L;

	@Column(name = "sequence_number", nullable = false)
	private Short sequenceNumber;

	@Column(name = "name", nullable = false)
	private String name;

	@OneToMany(mappedBy = "lesson")
	private List<Topic> topics = new ArrayList<Topic>();

	@ManyToOne
	@JoinColumn(name = "id_courses", referencedColumnName = "id")
	private Course course;

	@OneToMany(mappedBy = "lesson")
	private List<CompleteLesson> completeLessons = new ArrayList<CompleteLesson>();

}
