package com.intelisoft.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@OneToMany(mappedBy = "lesson", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Topic> topics = new ArrayList<Topic>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_courses", referencedColumnName = "id")
	private Course course;

	@OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.REFRESH }, orphanRemoval = true)
	private List<CompleteLesson> completeLessons = new ArrayList<CompleteLesson>();

}
