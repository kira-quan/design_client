package app.user;

import java.util.List;

import app.project.Project;

public class User {
	
	String email;
	String role;
	String username;
	List<Project> projects;
	
	//----------------------- Constructors -------------------------------------
	public User(String email, String role, String username) {
		super();
		this.email = email;
		this.role = role;
		this.username = username;
	}


	//----------------------- Getters and Setters ------------------------------
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

}
