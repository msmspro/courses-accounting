package com.intelisoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.intelisoft.model.enums.NotifficationStatus;

@Entity
@Table(name = "statuses")
public class Status extends Model{

	private static final long serialVersionUID = -1644610084060724419L;

	@Column(name = "status", nullable = false)
	private NotifficationStatus status;
	
	@OneToMany(mappedBy = "status")
	private List<Notiffication> notiffications = new ArrayList<Notiffication>();

	public Status() {
	}

	public Status(NotifficationStatus status, List<Notiffication> notiffications) {
		this.status = status;
		this.notiffications = notiffications;
	}

	public NotifficationStatus getStatus() {
		return status;
	}

	public void setStatus(NotifficationStatus status) {
		this.status = status;
	}

	public List<Notiffication> getNotiffications() {
		return notiffications;
	}

	public void setNotiffications(List<Notiffication> notiffications) {
		this.notiffications = notiffications;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Status [id=");
		builder.append(id);
		builder.append(", status=");
		builder.append(status);
		builder.append(", notiffications=");
		builder.append(notiffications);
		builder.append("]");
		return builder.toString();
	}
	
}