// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:4751fe6b258751a55ce2d458bb6306584e4c0ab4
// @DATE:Sun Jul 31 22:36:43 EAT 2016
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
        

// @LINE:38
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseCertification26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/certification/new"))))
private[this] lazy val controllers_admincontrollers_CourseActions_newCourseCertification26_invoker = createInvoker(
controllers.admincontrollers.CourseActions.newCourseCertification(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "newCourseCertification", Nil,"GET", """""", Routes.prefix + """course/certification/new"""))
        

// @LINE:39
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseCertification27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/certification/save"))))
private[this] lazy val controllers_admincontrollers_CourseActions_saveCourseCertification27_invoker = createInvoker(
controllers.admincontrollers.CourseActions.saveCourseCertification(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.CourseActions", "saveCourseCertification", Nil,"POST", """""", Routes.prefix + """course/certification/save"""))
        

// @LINE:42
private[this] lazy val controllers_admincontrollers_InstitutionActions_newInstitutionCategory28_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/category/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_newInstitutionCategory28_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.newInstitutionCategory(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "newInstitutionCategory", Nil,"GET", """Institutions""", Routes.prefix + """institution/category/new"""))
        

// @LINE:43
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveInstitutionCategory29_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/category/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveInstitutionCategory29_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveInstitutionCategory(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveInstitutionCategory", Nil,"POST", """""", Routes.prefix + """institution/category/save"""))
        

// @LINE:44
private[this] lazy val controllers_admincontrollers_InstitutionActions_allInstitutionCategory30_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/category/all"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_allInstitutionCategory30_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.allInstitutionCategory(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "allInstitutionCategory", Nil,"GET", """""", Routes.prefix + """institution/category/all"""))
        

// @LINE:45
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteInstitutionCategory31_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/category/delete/"),DynamicPart("institution_category_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteInstitutionCategory31_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.deleteInstitutionCategory(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "deleteInstitutionCategory", Seq(classOf[Long]),"GET", """""", Routes.prefix + """institution/category/delete/$institution_category_id<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_admincontrollers_InstitutionActions_editInstitutionCategory32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/category/edit/"),DynamicPart("institution_category_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_editInstitutionCategory32_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.editInstitutionCategory(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "editInstitutionCategory", Seq(classOf[Long]),"GET", """""", Routes.prefix + """institution/category/edit/$institution_category_id<[^/]+>"""))
        

// @LINE:47
private[this] lazy val controllers_admincontrollers_InstitutionActions_newInstitution33_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_newInstitution33_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.newInstitution(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "newInstitution", Nil,"GET", """""", Routes.prefix + """institution/new"""))
        

// @LINE:48
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveInstitution34_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveInstitution34_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveInstitution(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveInstitution", Nil,"POST", """""", Routes.prefix + """institution/save"""))
        

// @LINE:49
private[this] lazy val controllers_admincontrollers_InstitutionActions_editInstitution35_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/edit/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_editInstitution35_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.editInstitution(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "editInstitution", Seq(classOf[Long]),"GET", """""", Routes.prefix + """institution/edit/$id<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_admincontrollers_InstitutionActions_allInstitutions36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/all"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_allInstitutions36_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.allInstitutions(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "allInstitutions", Nil,"GET", """""", Routes.prefix + """institution/all"""))
        

// @LINE:51
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteInstitution37_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteInstitution37_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.deleteInstitution(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "deleteInstitution", Seq(classOf[Long]),"GET", """""", Routes.prefix + """institution/delete/$id<[^/]+>"""))
        

// @LINE:52
private[this] lazy val controllers_admincontrollers_InstitutionActions_viewInstitution38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/view/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_viewInstitution38_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.viewInstitution(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "viewInstitution", Seq(classOf[Long]),"GET", """""", Routes.prefix + """institution/view/$id<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_admincontrollers_InstitutionActions_fetchInstitutionCampuses39_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/fetchcampus/"),DynamicPart("institution_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_fetchInstitutionCampuses39_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.fetchInstitutionCampuses(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "fetchInstitutionCampuses", Seq(classOf[Long]),"POST", """""", Routes.prefix + """institution/fetchcampus/$institution_id<[^/]+>"""))
        

// @LINE:54
private[this] lazy val controllers_admincontrollers_InstitutionActions_addCourse40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/addcourse"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_addCourse40_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.addCourse(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "addCourse", Nil,"GET", """""", Routes.prefix + """institution/addcourse"""))
        

// @LINE:55
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCourseInstitution41_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/savecourseinstitution"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCourseInstitution41_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveCourseInstitution(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveCourseInstitution", Nil,"POST", """""", Routes.prefix + """institution/savecourseinstitution"""))
        

// @LINE:56
private[this] lazy val controllers_admincontrollers_InstitutionActions_fetchCampusSchools42_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/fetchschool/"),DynamicPart("campus_id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_fetchCampusSchools42_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.fetchCampusSchools(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "fetchCampusSchools", Seq(classOf[Long]),"POST", """""", Routes.prefix + """institution/fetchschool/$campus_id<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_admincontrollers_InstitutionActions_newCampus43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("campus/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_newCampus43_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.newCampus(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "newCampus", Nil,"GET", """Campuses""", Routes.prefix + """campus/new"""))
        

// @LINE:60
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCampus44_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("campus/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCampus44_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveCampus(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveCampus", Nil,"POST", """""", Routes.prefix + """campus/save"""))
        

// @LINE:61
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteCampus45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("campus/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_deleteCampus45_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.deleteCampus(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "deleteCampus", Seq(classOf[Long]),"GET", """""", Routes.prefix + """campus/delete/$id<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_admincontrollers_InstitutionActions_viewCampus46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("campus/view/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_viewCampus46_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.viewCampus(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "viewCampus", Seq(classOf[Long]),"GET", """""", Routes.prefix + """campus/view/$id<[^/]+>"""))
        

// @LINE:63
private[this] lazy val controllers_admincontrollers_InstitutionActions_editCampus47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("campus/edit/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_editCampus47_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.editCampus(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "editCampus", Seq(classOf[Long]),"GET", """""", Routes.prefix + """campus/edit/$id<[^/]+>"""))
        

// @LINE:64
private[this] lazy val controllers_admincontrollers_InstitutionActions_newSchool48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("school/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_newSchool48_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.newSchool(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "newSchool", Nil,"GET", """""", Routes.prefix + """school/new"""))
        

// @LINE:65
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveSchool49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("school/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveSchool49_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveSchool(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveSchool", Nil,"POST", """""", Routes.prefix + """school/save"""))
        

// @LINE:68
private[this] lazy val controllers_admincontrollers_InstitutionActions_addModeOfStudy50_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/course/modeofstudy/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_addModeOfStudy50_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.addModeOfStudy(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "addModeOfStudy", Nil,"GET", """Mode of study""", Routes.prefix + """institution/course/modeofstudy/new"""))
        

// @LINE:69
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveModeOfStudy51_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/course/modeofstudy/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveModeOfStudy51_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveModeOfStudy(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveModeOfStudy", Nil,"POST", """""", Routes.prefix + """institution/course/modeofstudy/save"""))
        

// @LINE:72
private[this] lazy val controllers_admincontrollers_InstitutionActions_addCourseFees52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/course/fees/new"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_addCourseFees52_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.addCourseFees(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "addCourseFees", Nil,"GET", """Course fees""", Routes.prefix + """institution/course/fees/new"""))
        

// @LINE:73
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCourseFees53_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institution/course/fees/save"))))
private[this] lazy val controllers_admincontrollers_InstitutionActions_saveCourseFees53_invoker = createInvoker(
controllers.admincontrollers.InstitutionActions.saveCourseFees(),
HandlerDef(this.getClass.getClassLoader, "admin", "controllers.admincontrollers.InstitutionActions", "saveCourseFees", Nil,"POST", """""", Routes.prefix + """institution/course/fees/save"""))
        

// @LINE:87
lazy val common_Routes54 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.admincontrollers.AdminActions.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/new""","""controllers.admincontrollers.CourseActions.newCourseField()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/save""","""controllers.admincontrollers.CourseActions.saveCourseField()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseFields()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/edit/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/field/delete/$course_field_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/new""","""controllers.admincontrollers.CourseActions.newCourseLevel()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/save""","""controllers.admincontrollers.CourseActions.saveCourseLevel()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/all""","""controllers.admincontrollers.CourseActions.fetchAllCourseLevels()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/edit/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/level/delete/$course_level_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/new""","""controllers.admincontrollers.CourseActions.newCourse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/save""","""controllers.admincontrollers.CourseActions.saveCourse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/excelfile/save""","""controllers.admincontrollers.CourseActions.saveCourseExcelFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/edit/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.editCourse(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/delete/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.deleteCourse(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/all""","""controllers.admincontrollers.CourseActions.fetchAllCourses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/view/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.viewCourseDetails(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/file/download""","""controllers.admincontrollers.CourseActions.downloadSampleCourseFile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/new""","""controllers.admincontrollers.CourseActions.courseNewJobPlacement()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/save/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.saveCourseJobPlacement(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/saved/""","""controllers.admincontrollers.CourseActions.saveCourseJobPlacemen()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/job/search/$key<[^/]+>""","""controllers.admincontrollers.CourseActions.searchJobTitlesByInput(key:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/new""","""controllers.admincontrollers.CourseActions.courseNewSpecialization()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/save/$course_id<[^/]+>""","""controllers.admincontrollers.CourseActions.saveCourseSpecialization(course_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/specialization/search/$key<[^/]+>""","""controllers.admincontrollers.CourseActions.SearchCourseSpecialization(key:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/certification/new""","""controllers.admincontrollers.CourseActions.newCourseCertification()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/certification/save""","""controllers.admincontrollers.CourseActions.saveCourseCertification()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/category/new""","""controllers.admincontrollers.InstitutionActions.newInstitutionCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/category/save""","""controllers.admincontrollers.InstitutionActions.saveInstitutionCategory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/category/all""","""controllers.admincontrollers.InstitutionActions.allInstitutionCategory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/category/delete/$institution_category_id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.deleteInstitutionCategory(institution_category_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/category/edit/$institution_category_id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.editInstitutionCategory(institution_category_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/new""","""controllers.admincontrollers.InstitutionActions.newInstitution()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/save""","""controllers.admincontrollers.InstitutionActions.saveInstitution()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/edit/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.editInstitution(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/all""","""controllers.admincontrollers.InstitutionActions.allInstitutions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/delete/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.deleteInstitution(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/view/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.viewInstitution(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/fetchcampus/$institution_id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.fetchInstitutionCampuses(institution_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/addcourse""","""controllers.admincontrollers.InstitutionActions.addCourse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/savecourseinstitution""","""controllers.admincontrollers.InstitutionActions.saveCourseInstitution()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/fetchschool/$campus_id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.fetchCampusSchools(campus_id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """campus/new""","""controllers.admincontrollers.InstitutionActions.newCampus()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """campus/save""","""controllers.admincontrollers.InstitutionActions.saveCampus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """campus/delete/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.deleteCampus(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """campus/view/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.viewCampus(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """campus/edit/$id<[^/]+>""","""controllers.admincontrollers.InstitutionActions.editCampus(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """school/new""","""controllers.admincontrollers.InstitutionActions.newSchool()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """school/save""","""controllers.admincontrollers.InstitutionActions.saveSchool()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/course/modeofstudy/new""","""controllers.admincontrollers.InstitutionActions.addModeOfStudy()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/course/modeofstudy/save""","""controllers.admincontrollers.InstitutionActions.saveModeOfStudy()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/course/fees/new""","""controllers.admincontrollers.InstitutionActions.addCourseFees()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institution/course/fees/save""","""controllers.admincontrollers.InstitutionActions.saveCourseFees()"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:38
case controllers_admincontrollers_CourseActions_newCourseCertification26_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_newCourseCertification26_invoker.call(controllers.admincontrollers.CourseActions.newCourseCertification())
   }
}
        

// @LINE:39
case controllers_admincontrollers_CourseActions_saveCourseCertification27_route(params) => {
   call { 
        controllers_admincontrollers_CourseActions_saveCourseCertification27_invoker.call(controllers.admincontrollers.CourseActions.saveCourseCertification())
   }
}
        

// @LINE:42
case controllers_admincontrollers_InstitutionActions_newInstitutionCategory28_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_newInstitutionCategory28_invoker.call(controllers.admincontrollers.InstitutionActions.newInstitutionCategory())
   }
}
        

// @LINE:43
case controllers_admincontrollers_InstitutionActions_saveInstitutionCategory29_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveInstitutionCategory29_invoker.call(controllers.admincontrollers.InstitutionActions.saveInstitutionCategory())
   }
}
        

// @LINE:44
case controllers_admincontrollers_InstitutionActions_allInstitutionCategory30_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_allInstitutionCategory30_invoker.call(controllers.admincontrollers.InstitutionActions.allInstitutionCategory())
   }
}
        

// @LINE:45
case controllers_admincontrollers_InstitutionActions_deleteInstitutionCategory31_route(params) => {
   call(params.fromPath[Long]("institution_category_id", None)) { (institution_category_id) =>
        controllers_admincontrollers_InstitutionActions_deleteInstitutionCategory31_invoker.call(controllers.admincontrollers.InstitutionActions.deleteInstitutionCategory(institution_category_id))
   }
}
        

// @LINE:46
case controllers_admincontrollers_InstitutionActions_editInstitutionCategory32_route(params) => {
   call(params.fromPath[Long]("institution_category_id", None)) { (institution_category_id) =>
        controllers_admincontrollers_InstitutionActions_editInstitutionCategory32_invoker.call(controllers.admincontrollers.InstitutionActions.editInstitutionCategory(institution_category_id))
   }
}
        

// @LINE:47
case controllers_admincontrollers_InstitutionActions_newInstitution33_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_newInstitution33_invoker.call(controllers.admincontrollers.InstitutionActions.newInstitution())
   }
}
        

// @LINE:48
case controllers_admincontrollers_InstitutionActions_saveInstitution34_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveInstitution34_invoker.call(controllers.admincontrollers.InstitutionActions.saveInstitution())
   }
}
        

// @LINE:49
case controllers_admincontrollers_InstitutionActions_editInstitution35_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_editInstitution35_invoker.call(controllers.admincontrollers.InstitutionActions.editInstitution(id))
   }
}
        

// @LINE:50
case controllers_admincontrollers_InstitutionActions_allInstitutions36_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_allInstitutions36_invoker.call(controllers.admincontrollers.InstitutionActions.allInstitutions())
   }
}
        

// @LINE:51
case controllers_admincontrollers_InstitutionActions_deleteInstitution37_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_deleteInstitution37_invoker.call(controllers.admincontrollers.InstitutionActions.deleteInstitution(id))
   }
}
        

// @LINE:52
case controllers_admincontrollers_InstitutionActions_viewInstitution38_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_viewInstitution38_invoker.call(controllers.admincontrollers.InstitutionActions.viewInstitution(id))
   }
}
        

// @LINE:53
case controllers_admincontrollers_InstitutionActions_fetchInstitutionCampuses39_route(params) => {
   call(params.fromPath[Long]("institution_id", None)) { (institution_id) =>
        controllers_admincontrollers_InstitutionActions_fetchInstitutionCampuses39_invoker.call(controllers.admincontrollers.InstitutionActions.fetchInstitutionCampuses(institution_id))
   }
}
        

// @LINE:54
case controllers_admincontrollers_InstitutionActions_addCourse40_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_addCourse40_invoker.call(controllers.admincontrollers.InstitutionActions.addCourse())
   }
}
        

// @LINE:55
case controllers_admincontrollers_InstitutionActions_saveCourseInstitution41_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveCourseInstitution41_invoker.call(controllers.admincontrollers.InstitutionActions.saveCourseInstitution())
   }
}
        

// @LINE:56
case controllers_admincontrollers_InstitutionActions_fetchCampusSchools42_route(params) => {
   call(params.fromPath[Long]("campus_id", None)) { (campus_id) =>
        controllers_admincontrollers_InstitutionActions_fetchCampusSchools42_invoker.call(controllers.admincontrollers.InstitutionActions.fetchCampusSchools(campus_id))
   }
}
        

// @LINE:59
case controllers_admincontrollers_InstitutionActions_newCampus43_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_newCampus43_invoker.call(controllers.admincontrollers.InstitutionActions.newCampus())
   }
}
        

// @LINE:60
case controllers_admincontrollers_InstitutionActions_saveCampus44_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveCampus44_invoker.call(controllers.admincontrollers.InstitutionActions.saveCampus())
   }
}
        

// @LINE:61
case controllers_admincontrollers_InstitutionActions_deleteCampus45_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_deleteCampus45_invoker.call(controllers.admincontrollers.InstitutionActions.deleteCampus(id))
   }
}
        

// @LINE:62
case controllers_admincontrollers_InstitutionActions_viewCampus46_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_viewCampus46_invoker.call(controllers.admincontrollers.InstitutionActions.viewCampus(id))
   }
}
        

// @LINE:63
case controllers_admincontrollers_InstitutionActions_editCampus47_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_admincontrollers_InstitutionActions_editCampus47_invoker.call(controllers.admincontrollers.InstitutionActions.editCampus(id))
   }
}
        

// @LINE:64
case controllers_admincontrollers_InstitutionActions_newSchool48_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_newSchool48_invoker.call(controllers.admincontrollers.InstitutionActions.newSchool())
   }
}
        

// @LINE:65
case controllers_admincontrollers_InstitutionActions_saveSchool49_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveSchool49_invoker.call(controllers.admincontrollers.InstitutionActions.saveSchool())
   }
}
        

// @LINE:68
case controllers_admincontrollers_InstitutionActions_addModeOfStudy50_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_addModeOfStudy50_invoker.call(controllers.admincontrollers.InstitutionActions.addModeOfStudy())
   }
}
        

// @LINE:69
case controllers_admincontrollers_InstitutionActions_saveModeOfStudy51_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveModeOfStudy51_invoker.call(controllers.admincontrollers.InstitutionActions.saveModeOfStudy())
   }
}
        

// @LINE:72
case controllers_admincontrollers_InstitutionActions_addCourseFees52_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_addCourseFees52_invoker.call(controllers.admincontrollers.InstitutionActions.addCourseFees())
   }
}
        

// @LINE:73
case controllers_admincontrollers_InstitutionActions_saveCourseFees53_route(params) => {
   call { 
        controllers_admincontrollers_InstitutionActions_saveCourseFees53_invoker.call(controllers.admincontrollers.InstitutionActions.saveCourseFees())
   }
}
        

// @LINE:87
case common_Routes54(handler) => handler
        
}

}
     