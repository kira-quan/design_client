package app;

import java.util.ArrayList;
import java.util.List;

import app.timeline.Phase;
import app.timeline.Timeline;
import app.view.TimelineView;

public class Main {
	
	public static void main(String[] args) {
		
		// Keeping this here for now until other parts of the application are
		// fleshed out
		
		// Create Timeline
		Timeline timeline = new Timeline();
		Phase phase1 = new Phase("Initial Client Meeting");
		Phase phase2 = new Phase("Creative Brief");
		List<Phase> phases = new ArrayList<Phase>();
		
		phases.add(phase1);
		phases.add(phase2);
		timeline.setPhases(phases);
		
		// View Timeline
		TimelineView timelineView = new TimelineView();
		timelineView.displayTimeline(timeline);
    }
}
