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
		
		// Using Object for this map because Handlebars expects different
		// object types for a single template (e.g. String and Array)
		Map<String, Object> timelineViewMap = new HashMap<String,Object>();
		
        timelineViewMap.put("first-name", "Sam");
        timelineViewMap.put("events", events);

        get("/timeline", 
        		(rq, rs) -> new ModelAndView(timelineViewMap, "timelineView.hbs"), 
        		new HandlebarsTemplateEngine());
    }
}
