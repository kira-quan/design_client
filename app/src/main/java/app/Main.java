package app;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Sam");

        // hello.hbs file is in resources/templates directory
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello.hbs"), new HandlebarsTemplateEngine());
    }
}
