package com.intelisoft.model;

import java.io.Serializable;

public abstract class Model implements Serializable{
	
	private static final long serialVersionUID = -994772923747354993L;
	
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
