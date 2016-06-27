// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:d1d947c11670f648a6e3088b6f9cecf54b5d166b
// @DATE:Sun Jun 26 14:31:10 EAT 2016
package admin

import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("",common.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_admincontrollers_AdminActions_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_admincontrollers_AdminActions_index0_invoker = createInvoker(
controllers.admincontrollers.AdminActions.index(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.AdminActions", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseField1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseField1_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseField(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseField", Nil,"GET", """""", Routes.prefix + """course/field/new"""))
        

// @LINE:8
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseField2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseField2_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseField(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseField", Nil,"POST", """""", Routes.prefix + """course/field/save"""))
        

// @LINE:9
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseField3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/edit/"),DynamicPart("course_field_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseField3_invoker = createInvoker(
controllers.admincontrollers.CourseActions.editCourseField(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "editCourseField", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/field/edit/$course_field_id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create/course/level"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel4_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseLevel(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseLevel", Nil,"GET", """""", Routes.prefix + """create/course/level"""))
        

// @LINE:16
lazy val common_Routes5 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.admincontrollers.AdminActions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/new""","""controllers.admincontrollers.CourseActions.newCourseField()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/save""","""controllers.admincontrollers.CourseActions.saveCourseField()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/edit/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create/course/level""","""controllers.admincontrollers.CourseActions.newCourseLevel()"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_admincontrollers_AdminActions_index0_route(params) => {
   call { 
        controllers_admincontrollers_AdminActions_index0_invoker.call(controllers.admincontrollers.AdminActions.index())
   }
}
        

// @LINE:7
case controllers_admincontrollers_CourseActions_newCourseField1_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseField1_invoker.call(controllers.admincontrollers.CourseActions.newCourseField())
   }
}
        

// @LINE:8
case controllers_admincontrollers_CourseActions_saveCourseField2_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseField2_invoker.call(controllers.admincontrollers.CourseActions.saveCourseField())
   }
}
        

// @LINE:9
case controllers_admincontrollers_CourseActions_editCourseField3_route(params) => {
   call(params.fromPath[Long]("course_field_id", None)) { (course_field_id) =>
        controllers_admincontrollers_CourseActions_editCourseField3_invoker.call(controllers.admincontrollers.CourseActions.editCourseField(course_field_id))
   }
}
        

// @LINE:10
case controllers_admincontrollers_CourseActions_newCourseLevel4_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseLevel4_invoker.call(controllers.admincontrollers.CourseActions.newCourseLevel())
   }
}
        

// @LINE:16
case common_Routes5(handler) => handler
        
}

}
     