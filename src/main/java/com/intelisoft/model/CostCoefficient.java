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
@Table(name = "cost_coefficients")
public class CostCoefficient extends Model {

	private static final long serialVersionUID = 4477981143410388861L;

	@Column(name = "coefficient", nullable = false)
	private Float coefficient;

	@ManyToOne
	@JoinColumn(name = "id_users", referencedColumnName = "id")
	private User user;

	@OneToMany(mappedBy = "costCoefficient")
	private List<CurrentCourse> currentCourses = new ArrayList<CurrentCourse>();

}
