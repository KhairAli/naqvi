package com.btrs.controller;

import java.io.Serializable;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import com.btrs.common.SessionUtil;
import com.btrs.model.User;
import com.btrs.service.UserService;

@ManagedBean
@RequestScoped
public class LoginController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User loginUser = new User();
	private User signupUser = new User();
	private UserService uService = new UserService();

	@PostConstruct
	public void init() {
		
		
	}
	
	public String authenticateUser() {
		try {
			loginUser = uService.authenticateUser(loginUser);
			String userType = null;
			if(loginUser != null){
				SessionUtil.getSession().setAttribute("currentUser", loginUser);
				if(loginUser.getUserType().equalsIgnoreCase("User")){
					 userType = "user/home.xhtml?faces-redirect=true";
				}else {
					
					userType =  "admin/home.xhtml?faces-redirect=true";
				}
			}else{
				
			}
			return userType ;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void registration() {
		try {
			uService.registerUser(signupUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

	public User getSignupUser() {
		return signupUser;
	}

	public void setSignupUser(User signupUser) {
		this.signupUser = signupUser;
	}





}
