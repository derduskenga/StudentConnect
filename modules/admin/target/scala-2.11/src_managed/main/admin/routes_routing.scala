// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:75ee8a06eb11865227fde85e8fc22354617c5b1a
// @DATE:Sun Jul 10 14:29:38 EAT 2016
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
        

// @LINE:16
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseLevel6_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseLevel(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseLevel", Nil,"GET", """Course levels""", Routes.prefix + """course/level/new"""))
        

// @LINE:17
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseLevel7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseLevel7_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseLevel(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseLevel", Nil,"POST", """""", Routes.prefix + """course/level/save"""))
        

// @LINE:18
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/all"))))
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_invoker = createInvoker(
controllers.admincontrollers.CourseActions.fetchAllCourseLevels(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "fetchAllCourseLevels", Nil,"GET", """""", Routes.prefix + """course/level/all"""))
        

// @LINE:19
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseLevel9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/edit/"),DynamicPart("course_level_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_editCourseLevel9_invoker = createInvoker(
controllers.admincontrollers.CourseActions.editCourseLevel(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "editCourseLevel", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/level/edit/$course_level_id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseLevel10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/level/delete/"),DynamicPart("course_level_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourseLevel10_invoker = createInvoker(
controllers.admincontrollers.CourseActions.deleteCourseLevel(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "deleteCourseLevel", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/level/delete/$course_level_id<[^/]+>"""))
        

// @LINE:23
private[this] lazy val controllers_admincontrollers_CourseActions_newCourse11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourse11_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourse(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourse", Nil,"GET", """Courses""", Routes.prefix + """course/new"""))
        

// @LINE:24
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourse12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourse12_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourse(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourse", Nil,"POST", """""", Routes.prefix + """course/save"""))
        

// @LINE:25
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseExcelFile13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/excelfile/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseExcelFile13_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseExcelFile(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseExcelFile", Nil,"POST", """""", Routes.prefix + """course/excelfile/save"""))
        

// @LINE:26
private[this] lazy val controllers_admincontrollers_CourseActions_editCourse14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/edit/"),DynamicPart("course_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_editCourse14_invoker = createInvoker(
controllers.admincontrollers.CourseActions.editCourse(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "editCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/edit/$course_id<[^/]+>"""))
        

// @LINE:27
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourse15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/delete/"),DynamicPart("course_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_deleteCourse15_invoker = createInvoker(
controllers.admincontrollers.CourseActions.deleteCourse(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "deleteCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/delete/$course_id<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourses16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/all"))))
private[this] lazy val controllers_admincontrollers_CourseActions_fetchAllCourses16_invoker = createInvoker(
controllers.admincontrollers.CourseActions.fetchAllCourses(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "fetchAllCourses", Nil,"GET", """""", Routes.prefix + """course/all"""))
        

// @LINE:29
private[this] lazy val controllers_admincontrollers_CourseActions_viewCourseDetails17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/view/"),DynamicPart("course_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_viewCourseDetails17_invoker = createInvoker(
controllers.admincontrollers.CourseActions.viewCourseDetails(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "viewCourseDetails", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/view/$course_id<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_admincontrollers_CourseActions_downloadSampleCourseFile18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/file/download"))))
private[this] lazy val controllers_admincontrollers_CourseActions_downloadSampleCourseFile18_invoker = createInvoker(
controllers.admincontrollers.CourseActions.downloadSampleCourseFile(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "downloadSampleCourseFile", Nil,"GET", """""", Routes.prefix + """course/file/download"""))
        

// @LINE:31
private[this] lazy val controllers_admincontrollers_CourseActions_courseNewJobPlacement19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/job/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_courseNewJobPlacement19_invoker = createInvoker(
controllers.admincontrollers.CourseActions.courseNewJobPlacement(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "courseNewJobPlacement", Nil,"GET", """""", Routes.prefix + """course/job/new"""))
        

// @LINE:32
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseJobPlacement20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/job/save/"),DynamicPart("course_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseJobPlacement20_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseJobPlacement(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseJobPlacement", Seq(classOf[Long]),"POST", """""", Routes.prefix + """course/job/save/$course_id<[^/]+>"""))
        

// @LINE:33
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseJobPlacemen21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/job/saved/"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseJobPlacemen21_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseJobPlacemen(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseJobPlacemen", Nil,"GET", """""", Routes.prefix + """course/job/saved/"""))
        

// @LINE:34
private[this] lazy val controllers_admincontrollers_CourseActions_searchJobTitlesByInput22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/job/search/"),DynamicPart("key", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_searchJobTitlesByInput22_invoker = createInvoker(
controllers.admincontrollers.CourseActions.searchJobTitlesByInput(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "searchJobTitlesByInput", Seq(classOf[String]),"GET", """""", Routes.prefix + """course/job/search/$key<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_admincontrollers_CourseActions_courseNewSpecialization23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/specialization/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_courseNewSpecialization23_invoker = createInvoker(
controllers.admincontrollers.CourseActions.courseNewSpecialization(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "courseNewSpecialization", Nil,"GET", """""", Routes.prefix + """course/specialization/new"""))
        

// @LINE:36
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseSpecialization24_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/specialization/save/"),DynamicPart("course_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseSpecialization24_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseSpecialization(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseSpecialization", Seq(classOf[Long]),"POST", """""", Routes.prefix + """course/specialization/save/$course_id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_admincontrollers_CourseActions_SearchCourseSpecialization25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/specialization/search/"),DynamicPart("key", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_CourseActions_SearchCourseSpecialization25_invoker = createInvoker(
controllers.admincontrollers.CourseActions.SearchCourseSpecialization(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "SearchCourseSpecialization", Seq(classOf[String]),"GET", """""", Routes.prefix + """course/specialization/search/$key<[^/]+>"""))
        

// @LINE:47
lazy val common_Routes26 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.admincontrollers.AdminActions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/new""","""controllers.admincontrollers.CourseActions.newCourseField()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/save""","""controllers.admincontrollers.CourseActions.saveCourseField()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseFields()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/edit/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/delete/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/new""","""controllers.admincontrollers.CourseActions.newCourseLevel()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/save""","""controllers.admincontrollers.CourseActions.saveCourseLevel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseLevels()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/edit/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/delete/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/new""","""controllers.admincontrollers.CourseActions.newCourse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/save""","""controllers.admincontrollers.CourseActions.saveCourse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/excelfile/save""","""controllers.admincontrollers.CourseActions.saveCourseExcelFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/edit/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourse(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/delete/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourse(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/all""","""controllers.admincontrollers.CourseActions.fetchAllCourses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/view/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.viewCourseDetails(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/file/download""","""controllers.admincontrollers.CourseActions.downloadSampleCourseFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/new""","""controllers.admincontrollers.CourseActions.courseNewJobPlacement()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/save/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.saveCourseJobPlacement(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/saved/""","""controllers.admincontrollers.CourseActions.saveCourseJobPlacemen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/search/$key<[^/]+>""","""controllers.admincontrollers.CourseActions.searchJobTitlesByInput(key:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/new""","""controllers.admincontrollers.CourseActions.courseNewSpecialization()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/save/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.saveCourseSpecialization(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/search/$key<[^/]+>""","""controllers.admincontrollers.CourseActions.SearchCourseSpecialization(key:String)"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:16
case controllers_admincontrollers_CourseActions_newCourseLevel6_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseLevel6_invoker.call(controllers.admincontrollers.CourseActions.newCourseLevel())
   }
}
        

// @LINE:17
case controllers_admincontrollers_CourseActions_saveCourseLevel7_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseLevel7_invoker.call(controllers.admincontrollers.CourseActions.saveCourseLevel())
   }
}
        

// @LINE:18
case controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_fetchAllCourseLevels8_invoker.call(controllers.admincontrollers.CourseActions.fetchAllCourseLevels())
   }
}
        

// @LINE:19
case controllers_admincontrollers_CourseActions_editCourseLevel9_route(params) => {
   call(params.fromPath[Long]("course_level_id", None)) { (course_level_id) =>
        controllers_admincontrollers_CourseActions_editCourseLevel9_invoker.call(controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id))
   }
}
        

// @LINE:20
case controllers_admincontrollers_CourseActions_deleteCourseLevel10_route(params) => {
   call(params.fromPath[Long]("course_level_id", None)) { (course_level_id) =>
        controllers_admincontrollers_CourseActions_deleteCourseLevel10_invoker.call(controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id))
   }
}
        

// @LINE:23
case controllers_admincontrollers_CourseActions_newCourse11_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourse11_invoker.call(controllers.admincontrollers.CourseActions.newCourse())
   }
}
        

// @LINE:24
case controllers_admincontrollers_CourseActions_saveCourse12_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourse12_invoker.call(controllers.admincontrollers.CourseActions.saveCourse())
   }
}
        

// @LINE:25
case controllers_admincontrollers_CourseActions_saveCourseExcelFile13_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseExcelFile13_invoker.call(controllers.admincontrollers.CourseActions.saveCourseExcelFile())
   }
}
        

// @LINE:26
case controllers_admincontrollers_CourseActions_editCourse14_route(params) => {
   call(params.fromPath[Long]("course_id", None)) { (course_id) =>
        controllers_admincontrollers_CourseActions_editCourse14_invoker.call(controllers.admincontrollers.CourseActions.editCourse(course_id))
   }
}
        

// @LINE:27
case controllers_admincontrollers_CourseActions_deleteCourse15_route(params) => {
   call(params.fromPath[Long]("course_id", None)) { (course_id) =>
        controllers_admincontrollers_CourseActions_deleteCourse15_invoker.call(controllers.admincontrollers.CourseActions.deleteCourse(course_id))
   }
}
        

// @LINE:28
case controllers_admincontrollers_CourseActions_fetchAllCourses16_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_fetchAllCourses16_invoker.call(controllers.admincontrollers.CourseActions.fetchAllCourses())
   }
}
        

// @LINE:29
case controllers_admincontrollers_CourseActions_viewCourseDetails17_route(params) => {
   call(params.fromPath[Long]("course_id", None)) { (course_id) =>
        controllers_admincontrollers_CourseActions_viewCourseDetails17_invoker.call(controllers.admincontrollers.CourseActions.viewCourseDetails(course_id))
   }
}
        

// @LINE:30
case controllers_admincontrollers_CourseActions_downloadSampleCourseFile18_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_downloadSampleCourseFile18_invoker.call(controllers.admincontrollers.CourseActions.downloadSampleCourseFile())
   }
}
        

// @LINE:31
case controllers_admincontrollers_CourseActions_courseNewJobPlacement19_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_courseNewJobPlacement19_invoker.call(controllers.admincontrollers.CourseActions.courseNewJobPlacement())
   }
}
        

// @LINE:32
case controllers_admincontrollers_CourseActions_saveCourseJobPlacement20_route(params) => {
   call(params.fromPath[Long]("course_id", None)) { (course_id) =>
        controllers_admincontrollers_CourseActions_saveCourseJobPlacement20_invoker.call(controllers.admincontrollers.CourseActions.saveCourseJobPlacement(course_id))
   }
}
        

// @LINE:33
case controllers_admincontrollers_CourseActions_saveCourseJobPlacemen21_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseJobPlacemen21_invoker.call(controllers.admincontrollers.CourseActions.saveCourseJobPlacemen())
   }
}
        

// @LINE:34
case controllers_admincontrollers_CourseActions_searchJobTitlesByInput22_route(params) => {
   call(params.fromPath[String]("key", None)) { (key) =>
        controllers_admincontrollers_CourseActions_searchJobTitlesByInput22_invoker.call(controllers.admincontrollers.CourseActions.searchJobTitlesByInput(key))
   }
}
        

// @LINE:35
case controllers_admincontrollers_CourseActions_courseNewSpecialization23_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_courseNewSpecialization23_invoker.call(controllers.admincontrollers.CourseActions.courseNewSpecialization())
   }
}
        

// @LINE:36
case controllers_admincontrollers_CourseActions_saveCourseSpecialization24_route(params) => {
   call(params.fromPath[Long]("course_id", None)) { (course_id) =>
        controllers_admincontrollers_CourseActions_saveCourseSpecialization24_invoker.call(controllers.admincontrollers.CourseActions.saveCourseSpecialization(course_id))
   }
}
        

// @LINE:37
case controllers_admincontrollers_CourseActions_SearchCourseSpecialization25_route(params) => {
   call(params.fromPath[String]("key", None)) { (key) =>
        controllers_admincontrollers_CourseActions_SearchCourseSpecialization25_invoker.call(controllers.admincontrollers.CourseActions.SearchCourseSpecialization(key))
   }
}
        

// @LINE:47
case common_Routes26(handler) => handler
        
}

}
     