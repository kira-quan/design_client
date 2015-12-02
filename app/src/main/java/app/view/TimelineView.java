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
		Map<String, String> map = new HashMap<String, String>();
        map.put("first-name", "Sam");
        map.put("event-1", "Initial Client Meeting");
        map.put("event-2", "Creative Brief");
        map.put("event-3", "Rough Draft Designs");

        // hello.hbs file is in resources/templates directory
        get("/timeline", (rq, rs) -> new ModelAndView(map, "timelineView.hbs"), new HandlebarsTemplateEngine());
    }
}
