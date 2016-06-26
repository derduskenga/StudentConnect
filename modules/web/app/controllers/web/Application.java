package controllers.web;

import play.*;
import play.mvc.*;
import views.html.*;
import views.html.web.home;
import views.html.web.all_institutions;
import views.html.web.institution_detail;

public class Application extends Controller{
	public static Result index(){
		return ok(home.render());
	}
	public static Result allInstitutions(){
		return ok(all_institutions.render());
	}
	public static Result institutionDetail(){return ok(institution_detail.render());
	}
}