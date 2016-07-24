// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:f95ffd13176ba4ae3b1b81b6a605506c3f45da6a
// @DATE:Sun Jul 24 14:18:05 EAT 2016

import admin.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers {

// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseInstitutionActions {


// @LINE:44
def allInstitutionCategory(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/category/all")
}
                        

// @LINE:57
def saveCampus(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "campus/save")
}
                        

// @LINE:52
def viewInstitution(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/view/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:46
def editInstitutionCategory(institution_category_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/category/edit/" + implicitly[PathBindable[Long]].unbind("institution_category_id", institution_category_id))
}
                        

// @LINE:51
def deleteInstitution(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:47
def newInstitution(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/new")
}
                        

// @LINE:62
def saveSchool(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "school/save")
}
                        

// @LINE:50
def allInstitutions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/all")
}
                        

// @LINE:49
def editInstitution(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:59
def viewCampus(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "campus/view/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:45
def deleteInstitutionCategory(institution_category_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/category/delete/" + implicitly[PathBindable[Long]].unbind("institution_category_id", institution_category_id))
}
                        

// @LINE:53
def fetchInstitutionCampuses(institution_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "institution/fetchcampus/" + implicitly[PathBindable[Long]].unbind("institution_id", institution_id))
}
                        

// @LINE:60
def editCampus(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "campus/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:61
def newSchool(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "school/new")
}
                        

// @LINE:58
def deleteCampus(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "campus/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:56
def newCampus(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "campus/new")
}
                        

// @LINE:48
def saveInstitution(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "institution/save")
}
                        

// @LINE:43
def saveInstitutionCategory(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "institution/category/save")
}
                        

// @LINE:42
def newInstitutionCategory(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institution/category/new")
}
                        

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:20
def deleteCourseLevel(course_level_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/delete/" + implicitly[PathBindable[Long]].unbind("course_level_id", course_level_id))
}
                        

// @LINE:29
def viewCourseDetails(course_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/view/" + implicitly[PathBindable[Long]].unbind("course_id", course_id))
}
                        

// @LINE:25
def saveCourseExcelFile(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/excelfile/save")
}
                        

// @LINE:19
def editCourseLevel(course_level_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/edit/" + implicitly[PathBindable[Long]].unbind("course_level_id", course_level_id))
}
                        

// @LINE:37
def SearchCourseSpecialization(key:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/specialization/search/" + implicitly[PathBindable[String]].unbind("key", dynamicString(key)))
}
                        

// @LINE:38
def newCourseCertification(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/certification/new")
}
                        

// @LINE:35
def courseNewSpecialization(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/specialization/new")
}
                        

// @LINE:23
def newCourse(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/new")
}
                        

// @LINE:39
def saveCourseCertification(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/certification/save")
}
                        

// @LINE:13
def deleteCourseField(course_field_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/delete/" + implicitly[PathBindable[Long]].unbind("course_field_id", course_field_id))
}
                        

// @LINE:27
def deleteCourse(course_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/delete/" + implicitly[PathBindable[Long]].unbind("course_id", course_id))
}
                        

// @LINE:18
def fetchAllCourseLevels(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/all")
}
                        

// @LINE:31
def courseNewJobPlacement(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/job/new")
}
                        

// @LINE:36
def saveCourseSpecialization(course_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/specialization/save/" + implicitly[PathBindable[Long]].unbind("course_id", course_id))
}
                        

// @LINE:33
def saveCourseJobPlacemen(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/job/saved/")
}
                        

// @LINE:26
def editCourse(course_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/edit/" + implicitly[PathBindable[Long]].unbind("course_id", course_id))
}
                        

// @LINE:12
def editCourseField(course_field_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/edit/" + implicitly[PathBindable[Long]].unbind("course_field_id", course_field_id))
}
                        

// @LINE:32
def saveCourseJobPlacement(course_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/job/save/" + implicitly[PathBindable[Long]].unbind("course_id", course_id))
}
                        

// @LINE:9
def newCourseField(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/new")
}
                        

// @LINE:17
def saveCourseLevel(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/level/save")
}
                        

// @LINE:16
def newCourseLevel(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/new")
}
                        

// @LINE:24
def saveCourse(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/save")
}
                        

// @LINE:11
def fetchAllCourseFields(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/all")
}
                        

// @LINE:10
def saveCourseField(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/field/save")
}
                        

// @LINE:28
def fetchAllCourses(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/all")
}
                        

// @LINE:30
def downloadSampleCourseFile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/file/download")
}
                        

// @LINE:34
def searchJobTitlesByInput(key:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/job/search/" + implicitly[PathBindable[String]].unbind("key", dynamicString(key)))
}
                        

}
                          

// @LINE:6
class ReverseAdminActions {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers.javascript {
import ReverseRouteContext.empty

// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseInstitutionActions {


// @LINE:44
def allInstitutionCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.allInstitutionCategory",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/category/all"})
      }
   """
)
                        

// @LINE:57
def saveCampus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.saveCampus",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "campus/save"})
      }
   """
)
                        

// @LINE:52
def viewInstitution : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.viewInstitution",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def editInstitutionCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.editInstitutionCategory",
   """
      function(institution_category_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/category/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("institution_category_id", institution_category_id)})
      }
   """
)
                        

// @LINE:51
def deleteInstitution : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.deleteInstitution",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:47
def newInstitution : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.newInstitution",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/new"})
      }
   """
)
                        

// @LINE:62
def saveSchool : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.saveSchool",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "school/save"})
      }
   """
)
                        

// @LINE:50
def allInstitutions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.allInstitutions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/all"})
      }
   """
)
                        

// @LINE:49
def editInstitution : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.editInstitution",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def viewCampus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.viewCampus",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "campus/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:45
def deleteInstitutionCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.deleteInstitutionCategory",
   """
      function(institution_category_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/category/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("institution_category_id", institution_category_id)})
      }
   """
)
                        

// @LINE:53
def fetchInstitutionCampuses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.fetchInstitutionCampuses",
   """
      function(institution_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/fetchcampus/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("institution_id", institution_id)})
      }
   """
)
                        

// @LINE:60
def editCampus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.editCampus",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "campus/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:61
def newSchool : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.newSchool",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "school/new"})
      }
   """
)
                        

// @LINE:58
def deleteCampus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.deleteCampus",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "campus/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:56
def newCampus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.newCampus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "campus/new"})
      }
   """
)
                        

// @LINE:48
def saveInstitution : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.saveInstitution",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/save"})
      }
   """
)
                        

// @LINE:43
def saveInstitutionCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.saveInstitutionCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/category/save"})
      }
   """
)
                        

// @LINE:42
def newInstitutionCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.InstitutionActions.newInstitutionCategory",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institution/category/new"})
      }
   """
)
                        

}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:20
def deleteCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.deleteCourseLevel",
   """
      function(course_level_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_level_id", course_level_id)})
      }
   """
)
                        

// @LINE:29
def viewCourseDetails : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.viewCourseDetails",
   """
      function(course_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/view/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_id", course_id)})
      }
   """
)
                        

// @LINE:25
def saveCourseExcelFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseExcelFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/excelfile/save"})
      }
   """
)
                        

// @LINE:19
def editCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.editCourseLevel",
   """
      function(course_level_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_level_id", course_level_id)})
      }
   """
)
                        

// @LINE:37
def SearchCourseSpecialization : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.SearchCourseSpecialization",
   """
      function(key) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/specialization/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("key", encodeURIComponent(key))})
      }
   """
)
                        

// @LINE:38
def newCourseCertification : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseCertification",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/certification/new"})
      }
   """
)
                        

// @LINE:35
def courseNewSpecialization : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.courseNewSpecialization",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/specialization/new"})
      }
   """
)
                        

// @LINE:23
def newCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/new"})
      }
   """
)
                        

// @LINE:39
def saveCourseCertification : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseCertification",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/certification/save"})
      }
   """
)
                        

// @LINE:13
def deleteCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.deleteCourseField",
   """
      function(course_field_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_field_id", course_field_id)})
      }
   """
)
                        

// @LINE:27
def deleteCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.deleteCourse",
   """
      function(course_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_id", course_id)})
      }
   """
)
                        

// @LINE:18
def fetchAllCourseLevels : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.fetchAllCourseLevels",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/all"})
      }
   """
)
                        

// @LINE:31
def courseNewJobPlacement : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.courseNewJobPlacement",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/job/new"})
      }
   """
)
                        

// @LINE:36
def saveCourseSpecialization : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseSpecialization",
   """
      function(course_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/specialization/save/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_id", course_id)})
      }
   """
)
                        

// @LINE:33
def saveCourseJobPlacemen : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseJobPlacemen",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/job/saved/"})
      }
   """
)
                        

// @LINE:26
def editCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.editCourse",
   """
      function(course_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_id", course_id)})
      }
   """
)
                        

// @LINE:12
def editCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.editCourseField",
   """
      function(course_field_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_field_id", course_field_id)})
      }
   """
)
                        

// @LINE:32
def saveCourseJobPlacement : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseJobPlacement",
   """
      function(course_id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/job/save/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_id", course_id)})
      }
   """
)
                        

// @LINE:9
def newCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseField",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/new"})
      }
   """
)
                        

// @LINE:17
def saveCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseLevel",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/save"})
      }
   """
)
                        

// @LINE:16
def newCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseLevel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/new"})
      }
   """
)
                        

// @LINE:24
def saveCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourse",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/save"})
      }
   """
)
                        

// @LINE:11
def fetchAllCourseFields : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.fetchAllCourseFields",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/all"})
      }
   """
)
                        

// @LINE:10
def saveCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseField",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/save"})
      }
   """
)
                        

// @LINE:28
def fetchAllCourses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.fetchAllCourses",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/all"})
      }
   """
)
                        

// @LINE:30
def downloadSampleCourseFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.downloadSampleCourseFile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/file/download"})
      }
   """
)
                        

// @LINE:34
def searchJobTitlesByInput : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.searchJobTitlesByInput",
   """
      function(key) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/job/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("key", encodeURIComponent(key))})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseAdminActions {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.AdminActions.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers.ref {


// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseInstitutionActions {


// @LINE:44
def allInstitutionCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.allInstitutionCategory(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "allInstitutionCategory", Seq(), "GET", """""", _prefix + """institution/category/all""")
)
                      

// @LINE:57
def saveCampus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.saveCampus(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "saveCampus", Seq(), "POST", """""", _prefix + """campus/save""")
)
                      

// @LINE:52
def viewInstitution(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.viewInstitution(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "viewInstitution", Seq(classOf[Long]), "GET", """""", _prefix + """institution/view/$id<[^/]+>""")
)
                      

// @LINE:46
def editInstitutionCategory(institution_category_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.editInstitutionCategory(institution_category_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "editInstitutionCategory", Seq(classOf[Long]), "GET", """""", _prefix + """institution/category/edit/$institution_category_id<[^/]+>""")
)
                      

// @LINE:51
def deleteInstitution(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.deleteInstitution(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "deleteInstitution", Seq(classOf[Long]), "GET", """""", _prefix + """institution/delete/$id<[^/]+>""")
)
                      

// @LINE:47
def newInstitution(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.newInstitution(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "newInstitution", Seq(), "GET", """""", _prefix + """institution/new""")
)
                      

// @LINE:62
def saveSchool(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.saveSchool(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "saveSchool", Seq(), "POST", """""", _prefix + """school/save""")
)
                      

// @LINE:50
def allInstitutions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.allInstitutions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "allInstitutions", Seq(), "GET", """""", _prefix + """institution/all""")
)
                      

// @LINE:49
def editInstitution(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.editInstitution(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "editInstitution", Seq(classOf[Long]), "GET", """""", _prefix + """institution/edit/$id<[^/]+>""")
)
                      

// @LINE:59
def viewCampus(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.viewCampus(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "viewCampus", Seq(classOf[Long]), "GET", """""", _prefix + """campus/view/$id<[^/]+>""")
)
                      

// @LINE:45
def deleteInstitutionCategory(institution_category_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.deleteInstitutionCategory(institution_category_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "deleteInstitutionCategory", Seq(classOf[Long]), "GET", """""", _prefix + """institution/category/delete/$institution_category_id<[^/]+>""")
)
                      

// @LINE:53
def fetchInstitutionCampuses(institution_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.fetchInstitutionCampuses(institution_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "fetchInstitutionCampuses", Seq(classOf[Long]), "POST", """""", _prefix + """institution/fetchcampus/$institution_id<[^/]+>""")
)
                      

// @LINE:60
def editCampus(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.editCampus(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "editCampus", Seq(classOf[Long]), "GET", """""", _prefix + """campus/edit/$id<[^/]+>""")
)
                      

// @LINE:61
def newSchool(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.newSchool(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "newSchool", Seq(), "GET", """""", _prefix + """school/new""")
)
                      

// @LINE:58
def deleteCampus(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.deleteCampus(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "deleteCampus", Seq(classOf[Long]), "GET", """""", _prefix + """campus/delete/$id<[^/]+>""")
)
                      

// @LINE:56
def newCampus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.newCampus(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "newCampus", Seq(), "GET", """Campuses""", _prefix + """campus/new""")
)
                      

// @LINE:48
def saveInstitution(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.saveInstitution(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "saveInstitution", Seq(), "POST", """""", _prefix + """institution/save""")
)
                      

// @LINE:43
def saveInstitutionCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.saveInstitutionCategory(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "saveInstitutionCategory", Seq(), "POST", """""", _prefix + """institution/category/save""")
)
                      

// @LINE:42
def newInstitutionCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.InstitutionActions.newInstitutionCategory(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.InstitutionActions", "newInstitutionCategory", Seq(), "GET", """Institutions""", _prefix + """institution/category/new""")
)
                      

}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:20
def deleteCourseLevel(course_level_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "deleteCourseLevel", Seq(classOf[Long]), "GET", """""", _prefix + """course/level/delete/$course_level_id<[^/]+>""")
)
                      

// @LINE:29
def viewCourseDetails(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.viewCourseDetails(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "viewCourseDetails", Seq(classOf[Long]), "GET", """""", _prefix + """course/view/$course_id<[^/]+>""")
)
                      

// @LINE:25
def saveCourseExcelFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseExcelFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseExcelFile", Seq(), "POST", """""", _prefix + """course/excelfile/save""")
)
                      

// @LINE:19
def editCourseLevel(course_level_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseLevel", Seq(classOf[Long]), "GET", """""", _prefix + """course/level/edit/$course_level_id<[^/]+>""")
)
                      

// @LINE:37
def SearchCourseSpecialization(key:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.SearchCourseSpecialization(key), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "SearchCourseSpecialization", Seq(classOf[String]), "GET", """""", _prefix + """course/specialization/search/$key<[^/]+>""")
)
                      

// @LINE:38
def newCourseCertification(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseCertification(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseCertification", Seq(), "GET", """""", _prefix + """course/certification/new""")
)
                      

// @LINE:35
def courseNewSpecialization(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.courseNewSpecialization(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "courseNewSpecialization", Seq(), "GET", """""", _prefix + """course/specialization/new""")
)
                      

// @LINE:23
def newCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourse(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourse", Seq(), "GET", """Courses""", _prefix + """course/new""")
)
                      

// @LINE:39
def saveCourseCertification(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseCertification(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseCertification", Seq(), "POST", """""", _prefix + """course/certification/save""")
)
                      

// @LINE:13
def deleteCourseField(course_field_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "deleteCourseField", Seq(classOf[Long]), "GET", """""", _prefix + """course/field/delete/$course_field_id<[^/]+>""")
)
                      

// @LINE:27
def deleteCourse(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.deleteCourse(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "deleteCourse", Seq(classOf[Long]), "GET", """""", _prefix + """course/delete/$course_id<[^/]+>""")
)
                      

// @LINE:18
def fetchAllCourseLevels(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.fetchAllCourseLevels(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "fetchAllCourseLevels", Seq(), "GET", """""", _prefix + """course/level/all""")
)
                      

// @LINE:31
def courseNewJobPlacement(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.courseNewJobPlacement(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "courseNewJobPlacement", Seq(), "GET", """""", _prefix + """course/job/new""")
)
                      

// @LINE:36
def saveCourseSpecialization(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseSpecialization(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseSpecialization", Seq(classOf[Long]), "POST", """""", _prefix + """course/specialization/save/$course_id<[^/]+>""")
)
                      

// @LINE:33
def saveCourseJobPlacemen(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseJobPlacemen(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseJobPlacemen", Seq(), "GET", """""", _prefix + """course/job/saved/""")
)
                      

// @LINE:26
def editCourse(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourse(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourse", Seq(classOf[Long]), "GET", """""", _prefix + """course/edit/$course_id<[^/]+>""")
)
                      

// @LINE:12
def editCourseField(course_field_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseField(course_field_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseField", Seq(classOf[Long]), "GET", """""", _prefix + """course/field/edit/$course_field_id<[^/]+>""")
)
                      

// @LINE:32
def saveCourseJobPlacement(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseJobPlacement(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseJobPlacement", Seq(classOf[Long]), "POST", """""", _prefix + """course/job/save/$course_id<[^/]+>""")
)
                      

// @LINE:9
def newCourseField(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseField(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseField", Seq(), "GET", """Other pages
course fields""", _prefix + """course/field/new""")
)
                      

// @LINE:17
def saveCourseLevel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseLevel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseLevel", Seq(), "POST", """""", _prefix + """course/level/save""")
)
                      

// @LINE:16
def newCourseLevel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseLevel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseLevel", Seq(), "GET", """Course levels""", _prefix + """course/level/new""")
)
                      

// @LINE:24
def saveCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourse(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourse", Seq(), "POST", """""", _prefix + """course/save""")
)
                      

// @LINE:11
def fetchAllCourseFields(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.fetchAllCourseFields(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "fetchAllCourseFields", Seq(), "GET", """""", _prefix + """course/field/all""")
)
                      

// @LINE:10
def saveCourseField(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseField(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseField", Seq(), "POST", """""", _prefix + """course/field/save""")
)
                      

// @LINE:28
def fetchAllCourses(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.fetchAllCourses(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "fetchAllCourses", Seq(), "GET", """""", _prefix + """course/all""")
)
                      

// @LINE:30
def downloadSampleCourseFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.downloadSampleCourseFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "downloadSampleCourseFile", Seq(), "GET", """""", _prefix + """course/file/download""")
)
                      

// @LINE:34
def searchJobTitlesByInput(key:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.searchJobTitlesByInput(key), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "searchJobTitlesByInput", Seq(classOf[String]), "GET", """""", _prefix + """course/job/search/$key<[^/]+>""")
)
                      

}
                          

// @LINE:6
class ReverseAdminActions {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.AdminActions.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.AdminActions", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    