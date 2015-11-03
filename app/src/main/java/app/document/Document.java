package app.document;

import java.util.ArrayList;
import java.util.List;

import app.user.User;

public class Document {
	
	private String name;
	private String type;
	private String location;
	private List<User> permittedUsers;
	private List<Tag> tags;
	
	//----------------------- Constructors -------------------------------------
	
	public Document(String location) {
		super();
		this.location = location;
		this.name = "";
		this.type = "";
		this.permittedUsers = new ArrayList<User>();
		this.tags = new ArrayList<Tag>();
	}

	//----------------------- Getters and Setters ------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<User> getPermittedUsers() {
		return permittedUsers;
	}

	public void setPermittedUsers(List<User> permittedUsers) {
		this.permittedUsers = permittedUsers;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	
	
}
