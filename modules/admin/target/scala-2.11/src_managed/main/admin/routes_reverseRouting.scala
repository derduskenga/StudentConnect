// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:d0f7273b2f7551c98cfd84e38e354e01fdfd1332
// @DATE:Wed Jun 29 18:00:58 EAT 2016

import admin.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:19
def deleteCourseLevel(course_level_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/delete/" + implicitly[PathBindable[Long]].unbind("course_level_id", course_level_id))
}
                        

// @LINE:18
def editCourseLevel(course_level_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/edit/" + implicitly[PathBindable[Long]].unbind("course_level_id", course_level_id))
}
                        

// @LINE:13
def deleteCourseField(course_field_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/delete/" + implicitly[PathBindable[Long]].unbind("course_field_id", course_field_id))
}
                        

// @LINE:17
def fetchAllCourseLevels(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/all")
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
                        

// @LINE:16
def saveCourseLevel(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "course/level/save")
}
                        

// @LINE:15
def newCourseLevel(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/level/new")
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
                  


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers.javascript {
import ReverseRouteContext.empty

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:19
def deleteCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.deleteCourseLevel",
   """
      function(course_level_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_level_id", course_level_id)})
      }
   """
)
                        

// @LINE:18
def editCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.editCourseLevel",
   """
      function(course_level_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_level_id", course_level_id)})
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
                        

// @LINE:17
def fetchAllCourseLevels : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.fetchAllCourseLevels",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/all"})
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
                        

// @LINE:16
def saveCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.saveCourseLevel",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/save"})
      }
   """
)
                        

// @LINE:15
def newCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseLevel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/level/new"})
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
        


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.admincontrollers.ref {


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseCourseActions {


// @LINE:19
def deleteCourseLevel(course_level_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.deleteCourseLevel(course_level_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "deleteCourseLevel", Seq(classOf[Long]), "GET", """""", _prefix + """course/level/delete/$course_level_id<[^/]+>""")
)
                      

// @LINE:18
def editCourseLevel(course_level_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseLevel(course_level_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseLevel", Seq(classOf[Long]), "GET", """""", _prefix + """course/level/edit/$course_level_id<[^/]+>""")
)
                      

// @LINE:13
def deleteCourseField(course_field_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.deleteCourseField(course_field_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "deleteCourseField", Seq(classOf[Long]), "GET", """""", _prefix + """course/field/delete/$course_field_id<[^/]+>""")
)
                      

// @LINE:17
def fetchAllCourseLevels(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.fetchAllCourseLevels(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "fetchAllCourseLevels", Seq(), "GET", """""", _prefix + """course/level/all""")
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
                      

// @LINE:16
def saveCourseLevel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseLevel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseLevel", Seq(), "POST", """""", _prefix + """course/level/save""")
)
                      

// @LINE:15
def newCourseLevel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseLevel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseLevel", Seq(), "GET", """Course levels""", _prefix + """course/level/new""")
)
                      

// @LINE:11
def fetchAllCourseFields(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.fetchAllCourseFields(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "fetchAllCourseFields", Seq(), "GET", """""", _prefix + """course/field/all""")
)
                      

// @LINE:10
def saveCourseField(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.saveCourseField(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "saveCourseField", Seq(), "POST", """""", _prefix + """course/field/save""")
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
        
    