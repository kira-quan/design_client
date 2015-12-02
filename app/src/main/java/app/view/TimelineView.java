package app.view;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class TimelineView {
	
	public TimelineView() {
		super();
	}

	public void displayTimeline() {
		
		// TODO: Change in order to pull data from Timeline 
		Map<String, String> timelineViewMap = new HashMap<String, String>();
        timelineViewMap.put("first-name", "Sam");
        timelineViewMap.put("event-1", "Initial Client Meeting");
        timelineViewMap.put("event-2", "Creative Brief");
        timelineViewMap.put("event-3", "Rough Draft Designs");

        // hello.hbs file is in resources/templates directory
        get("/timeline", 
        		(rq, rs) -> new ModelAndView(timelineViewMap, "timelineView.hbs"), 
        		new HandlebarsTemplateEngine());
    }
}
