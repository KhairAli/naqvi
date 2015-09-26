package com.btrs.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PageController {

	private String  url  = "welcome.xhtml";

	

	public  void  navigate(String path) {
		url = path+".xhtml";
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
