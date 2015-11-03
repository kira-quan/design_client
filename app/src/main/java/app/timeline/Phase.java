package app.timeline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import app.document.Document;

public class Phase {
	
	private String name;
	private List<Document> documents;
	private Boolean isActive;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	
	//----------------------- Constructors -------------------------------------
	
	public Phase(String name) {
		super();
		this.name = name;
		this.documents = new ArrayList<Document>();
		this.isActive = false;
		this.startTime = null;
		this.endTime = null;
	}


	//----------------------- Getters and Setters ------------------------------
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public LocalDateTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}


	public LocalDateTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	
	

}
