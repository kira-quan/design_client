package app.view;

import static spark.Spark.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import app.timeline.Timeline;

public class TimelineView {
	
	public TimelineView() {
		super();
	}

	public void displayTimeline(Timeline timeline) {
		
		List<String> events = timeline.getPhaseNames();
		
		// TODO: Change in order to pull data from Timeline 
		Map<String, List<String>> timelineViewMap = new HashMap<String, List<String>>();
		List<String> user = new ArrayList<String>(1);
		
		user.add("Sam");
		
        timelineViewMap.put("first-name", user);
        timelineViewMap.put("events", events);

        // hello.hbs file is in resources/templates directory
        get("/timeline", 
        		(rq, rs) -> new ModelAndView(timelineViewMap, "timelineView.hbs"), 
        		new HandlebarsTemplateEngine());
    }
}
