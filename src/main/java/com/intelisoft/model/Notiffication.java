package com.intelisoft.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.intelisoft.model.enums.NotifficationType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "notiffications")
public class Notiffication extends Model {

	private static final long serialVersionUID = 5734793146922815304L;

	@Column(name = "notice_datetime", nullable = false)
	private Date noticeDateTime;

	@Column(name = "message", nullable = false)
	private String message;

	@Column(name = "type", nullable = false)
	private NotifficationType type;

	@OneToMany(mappedBy = "notiffication")
	private List<User> users = new ArrayList<User>();

	@ManyToOne
	@JoinColumn(name = "id_statuses", referencedColumnName = "id")
	private Status status;

}
