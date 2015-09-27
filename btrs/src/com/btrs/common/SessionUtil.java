package com.btrs.common;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class SessionUtil {

	  public static HttpSession getSession() {
	        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	    }
}
