package com.intelisoft.model;

import java.util.List;

public class Status extends Model{

	private static final long serialVersionUID = -1644610084060724419L;

	private String name;
	
	private List<Notiffication> notiffications;

	public Status() {
	}

	public Status(String name, List<Notiffication> notiffications) {
		this.name = name;
		this.notiffications = notiffications;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		builder.append(", name=");
		builder.append(name);
		builder.append(", notiffications=");
		builder.append(notiffications);
		builder.append("]");
		return builder.toString();
	}
	
}