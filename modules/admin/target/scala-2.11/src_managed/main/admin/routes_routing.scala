// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:d0f7273b2f7551c98cfd84e38e354e01fdfd1332
// @DATE:Wed Jun 29 18:00:58 EAT 2016
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
        

// @LINE:9
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseField1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseField1_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseField(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseField", Nil,"GET", """Other pages
course fields""", Routes.prefix + """course/field/new"""))
        

// @LINE:10
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseField2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseField2_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseField(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseField", Nil,"POST", """""", Routes.prefix + """course/field/save"""))
        

// @LINE:11
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseFields3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/all"))))
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseFields3_invoker = createInvoker(
controllers.admincontrollers.CourseActions.fetchAllCourseFields(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "fetchAllCourseFields", Nil,"GET", """""", Routes.prefix + """course/field/all"""))
        

// @LINE:12
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseField4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/edit/"),DynamicPart("course_field_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseField4_invoker = createInvoker(
controllers.admincontrollers.CourseActions.editCourseField(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "editCourseField", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/field/edit/$course_field_id<[^/]+>"""))
        

// @LINE:13
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseField5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/field/delete/"),DynamicPart("course_field_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseField5_invoker = createInvoker(
controllers.admincontrollers.CourseActions.deleteCourseField(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "deleteCourseField", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/field/delete/$course_field_id<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel6_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseLevel(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseLevel", Nil,"GET", """Course levels""", Routes.prefix + """course/level/new"""))
        

// @LINE:16
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseLevel7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseLevel7_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseLevel(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseLevel", Nil,"POST", """""", Routes.prefix + """course/level/save"""))
        

// @LINE:17
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/all"))))
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_invoker = createInvoker(
controllers.admincontrollers.CourseActions.fetchAllCourseLevels(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "fetchAllCourseLevels", Nil,"GET", """""", Routes.prefix + """course/level/all"""))
        

// @LINE:18
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseLevel9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/edit/"),DynamicPart("course_level_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseLevel9_invoker = createInvoker(
controllers.admincontrollers.CourseActions.editCourseLevel(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "editCourseLevel", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/level/edit/$course_level_id<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseLevel10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/delete/"),DynamicPart("course_level_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseLevel10_invoker = createInvoker(
controllers.admincontrollers.CourseActions.deleteCourseLevel(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "deleteCourseLevel", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/level/delete/$course_level_id<[^/]+>"""))
        

// @LINE:34
lazy val common_Routes11 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.admincontrollers.AdminActions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/new""","""controllers.admincontrollers.CourseActions.newCourseField()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/save""","""controllers.admincontrollers.CourseActions.saveCourseField()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseFields()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/edit/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/delete/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/new""","""controllers.admincontrollers.CourseActions.newCourseLevel()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/save""","""controllers.admincontrollers.CourseActions.saveCourseLevel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseLevels()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/edit/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/delete/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id:Long)"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_admincontrollers_CourseActions_newCourseField1_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseField1_invoker.call(controllers.admincontrollers.CourseActions.newCourseField())
   }
}
        

// @LINE:10
case controllers_admincontrollers_CourseActions_saveCourseField2_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseField2_invoker.call(controllers.admincontrollers.CourseActions.saveCourseField())
   }
}
        

// @LINE:11
case controllers_admincontrollers_CourseActions_fetchAllCourseFields3_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_fetchAllCourseFields3_invoker.call(controllers.admincontrollers.CourseActions.fetchAllCourseFields())
   }
}
        

// @LINE:12
case controllers_admincontrollers_CourseActions_editCourseField4_route(params) => {
   call(params.fromPath[Long]("course_field_id", None)) { (course_field_id) =>
        controllers_admincontrollers_CourseActions_editCourseField4_invoker.call(controllers.admincontrollers.CourseActions.editCourseField(course_field_id))
   }
}
        

// @LINE:13
case controllers_admincontrollers_CourseActions_deleteCourseField5_route(params) => {
   call(params.fromPath[Long]("course_field_id", None)) { (course_field_id) =>
        controllers_admincontrollers_CourseActions_deleteCourseField5_invoker.call(controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id))
   }
}
        

// @LINE:15
case controllers_admincontrollers_CourseActions_newCourseLevel6_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseLevel6_invoker.call(controllers.admincontrollers.CourseActions.newCourseLevel())
   }
}
        

// @LINE:16
case controllers_admincontrollers_CourseActions_saveCourseLevel7_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseLevel7_invoker.call(controllers.admincontrollers.CourseActions.saveCourseLevel())
   }
}
        

// @LINE:17
case controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_invoker.call(controllers.admincontrollers.CourseActions.fetchAllCourseLevels())
   }
}
        

// @LINE:18
case controllers_admincontrollers_CourseActions_editCourseLevel9_route(params) => {
   call(params.fromPath[Long]("course_level_id", None)) { (course_level_id) =>
        controllers_admincontrollers_CourseActions_editCourseLevel9_invoker.call(controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id))
   }
}
        

// @LINE:19
case controllers_admincontrollers_CourseActions_deleteCourseLevel10_route(params) => {
   call(params.fromPath[Long]("course_level_id", None)) { (course_level_id) =>
        controllers_admincontrollers_CourseActions_deleteCourseLevel10_invoker.call(controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id))
   }
}
        

// @LINE:34
case common_Routes11(handler) => handler
        
}

}
     