package com.inetlisoft.courses.accounting.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "topics")
public class Topic extends Model {

	private static final long serialVersionUID = 5176041501520178093L;

	@Column(name = "name", nullable = false)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_lessons", referencedColumnName = "id")
	private Lesson lesson;

}