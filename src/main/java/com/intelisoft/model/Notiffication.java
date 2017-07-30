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

@Entity
@Table(name = "notiffications")
public class Notiffication extends Model{

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
	
	public Notiffication() {
	}

	public Notiffication(Date noticeDateTime, String message, NotifficationType type, List<User> users, Status status) {
		this.noticeDateTime = noticeDateTime;
		this.message = message;
		this.type = type;
		this.users = users;
		this.status = status;
	}

	public Date getNoticeDateTime() {
		return noticeDateTime;
	}

	public void setNoticeDateTime(Date noticeDateTime) {
		this.noticeDateTime = noticeDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NotifficationType getType() {
		return type;
	}

	public void setType(NotifficationType type) {
		this.type = type;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Notiffication [id=");
		builder.append(id);
		builder.append(", noticeDateTime=");
		builder.append(noticeDateTime);
		builder.append(", message=");
		builder.append(message);
		builder.append(", type=");
		builder.append(type);
		builder.append(", users=");
		builder.append(users);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
}
