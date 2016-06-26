// @SOURCE:/home/derdus/studentconnect/modules/admin/conf/admin.routes
// @HASH:d1d947c11670f648a6e3088b6f9cecf54b5d166b
// @DATE:Sat Jun 25 16:38:12 EAT 2016

import admin.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.admincontrollers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseCourseActions {


// @LINE:9
def editCourseField(course_field_id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/edit/" + implicitly[PathBindable[Long]].unbind("course_field_id", course_field_id))
}
                        

// @LINE:7
def newCourseField(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "course/field/new")
}
                        

// @LINE:10
def newCourseLevel(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "create/course/level")
}
                        

// @LINE:8
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
                  


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.admincontrollers.javascript {
import ReverseRouteContext.empty

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseCourseActions {


// @LINE:9
def editCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.editCourseField",
   """
      function(course_field_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("course_field_id", course_field_id)})
      }
   """
)
                        

// @LINE:7
def newCourseField : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseField",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/field/new"})
      }
   """
)
                        

// @LINE:10
def newCourseLevel : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.admincontrollers.CourseActions.newCourseLevel",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create/course/level"})
      }
   """
)
                        

// @LINE:8
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
        


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.admincontrollers.ref {


// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
class ReverseCourseActions {


// @LINE:9
def editCourseField(course_field_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.editCourseField(course_field_id), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "editCourseField", Seq(classOf[Long]), "GET", """""", _prefix + """course/field/edit/$course_field_id<[^/]+>""")
)
                      

// @LINE:7
def newCourseField(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseField(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseField", Seq(), "GET", """""", _prefix + """course/field/new""")
)
                      

// @LINE:10
def newCourseLevel(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.admincontrollers.CourseActions.newCourseLevel(), HandlerDef(this.getClass.getClassLoader, "", "controllers.admincontrollers.CourseActions", "newCourseLevel", Seq(), "GET", """""", _prefix + """create/course/level""")
)
                      

// @LINE:8
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
        
    