package app.project;

import java.util.ArrayList;
import java.util.List;

import app.document.Tag;
import app.timeline.Timeline;
import app.user.User;

public class Project {

	private List<User> users;
	private List<Tag> tags;
	private Timeline timeline;
	
	
	//----------------------- Constructors -------------------------------------
	
	public Project() {
		super();
		this.users = new ArrayList<User>();
		this.tags = new ArrayList<Tag>();
		this.timeline = new Timeline();
	}


	//----------------------- Getters and Setters ------------------------------
	
	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}


	public Timeline getTimeline() {
		return timeline;
	}


	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}
	
}
