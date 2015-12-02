package app.timeline;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timeline {
	private List<Phase> phases;
	private LocalDate startDate;
	private LocalDate endDate;
	private Phase activePhase;
	
	//----------------------- Constructors -------------------------------------
	
	public Timeline() {
		super();
		this.phases = new ArrayList<Phase>();
		this.startDate = null;
		this.endDate = null;
		this.activePhase = null;
	}
	
	//----------------------- Getters and Setters ------------------------------
	
	public List<String> getPhaseNames(){
		
		Iterator<Phase> it = phases.iterator();
		List<String> names = new ArrayList<String>(phases.size());
		
		while(it.hasNext()){
			names.add(it.next().getName());
		}
		
		System.out.println(names.toString());
		
		return names;
	}
	
	public List<Phase> getPhases() {
		return phases;
	}
	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Phase getActivePhase() {
		return activePhase;
	}
	public void setActivePhase(Phase activePhase) {
		this.activePhase = activePhase;
	}
	
	

}
