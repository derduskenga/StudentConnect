// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:c3bfc63036da3286dddf1ac6487c3062253b7802
// @DATE:Sat Jul 02 14:19:47 EAT 2016

import admin.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:33
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

// @LINE:33
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
                        

// @LINE:33
def UploadCourseSampleFile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/file/upload")
}
                        

// @LINE:23
def newCourse(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/new")
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
                  


// @LINE:33
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

// @LINE:33
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
                        

// @LINE:33
def UploadCourseSampleFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.UploadCourseSampleFile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/file/upload"})
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
        


// @LINE:33
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


// @LINE:33
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
                      

// @LINE:25
def saveCourseExcelFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseExcelFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseExcelFile", Seq(), "POST", """""", _prefix + """course/excelfile/save""")
)
                      

// @LINE:19
def editCourseLevel(course_level_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseLevel", Seq(classOf[Long]), "GET", """""", _prefix + """course/level/edit/$course_level_id<[^/]+>""")
)
                      

// @LINE:33
def UploadCourseSampleFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.UploadCourseSampleFile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "UploadCourseSampleFile", Seq(), "GET", """""", _prefix + """course/file/upload""")
)
                      

// @LINE:23
def newCourse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourse(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourse", Seq(), "GET", """Courses""", _prefix + """course/new""")
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
                      

// @LINE:26
def editCourse(course_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourse(course_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourse", Seq(classOf[Long]), "GET", """""", _prefix + """course/edit/$course_id<[^/]+>""")
)
                      

// @LINE:12
def editCourseField(course_field_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseField(course_field_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseField", Seq(classOf[Long]), "GET", """""", _prefix + """course/field/edit/$course_field_id<[^/]+>""")
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
                      

}
                          

// @LINE:6
class ReverseAdminActions {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.AdminActions.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.AdminActions", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    