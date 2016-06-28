package controllers.admincontrollers;

//import play.*;
import play.mvc.*;
import views.html.admin.admin_landing;
public class AdminActions extends Controller{
	
	public static Result index(){
		//return redirect("http://mycloudcode.com"); redirect to external URL
		return ok(admin_landing.render());
	}
	

}