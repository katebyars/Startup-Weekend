import models.Event;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import javax.servlet.*;
import javax.servlet.http.*;

import java.lang.reflect.Array;
import java.util.*;

import static spark.Spark.*;
import static spark.route.HttpMethod.post;

public class App {

    public static void main(String[] args) {

        //show show a new event form
        get("/events/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());

        //process a new event form
        post("/events/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String description = request.queryParams("description");
            Event event = new Event(name, description);
            model.put("event", event);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //show all events
        get("/events", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Event> events = Event.getAllEvents();
            model.put("events", events);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //show an individual event
//        get("/posts/:id", (req, res) -> {
////            Map<String, Object> model = new HashMap<>();
////            int idOfEvent = Integer.parseInt(req.params("id"));
////            Event findEvent = Event.findById(idOfPostToFind); //use it to find post
////            model.put("post", foundPost); //add it to model for template to display
////            return new ModelAndView(model, "post-detail.hbs"); //individual post page.
////        }, new HandlebarsTemplateEngine());
//
//        //show a form to update an event
//        //process a form to update an event
//        //delete an event
//        }
    }
}
