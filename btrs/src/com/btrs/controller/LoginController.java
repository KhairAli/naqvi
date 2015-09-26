package com.btrs.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class LoginController implements Serializable{

	private String  url  = null;
	
	
	public String navigate() {
		
		return "/welcome.xhtml";
	}
}
