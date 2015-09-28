package com.btrs.common;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class SessionUtil implements Serializable {

	  public static HttpSession getSession() {
	        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	    }
}
