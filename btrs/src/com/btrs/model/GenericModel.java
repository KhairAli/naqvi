package com.btrs.model;

import java.io.Serializable;

public abstract class GenericModel implements Serializable{

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	} 
	
}
