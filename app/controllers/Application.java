package controllers;

import java.util.List;

import com.avaje.ebean.Model.Finder;

import play.*;
import play.mvc.*;

import views.html.*;

import models.Task;

public class Application extends Controller {

    public Result index() {
        //return ok(index.render("Your new application is ready."));
    	return ok("Hello world!");
    }
    public Result hoge() {
    	
    	Task task1 = new Task();
    	task1.name = "太郎";
    	task1.save();
    	
    	// Find all tasks
		List<Task> tasks = Task.find.all();
 
        StringBuilder msg = new StringBuilder();
        for (Task task : tasks) {
            msg.append(task.toString()).append("\n");
        }
        return ok(msg.toString());
    }
}
