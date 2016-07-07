// @SOURCE:/home/derdus/studentconnect/modules/web/conf/web.routes
// @HASH:77431746f8138e55085fd542ef637faa0a670b1d
// @DATE:Thu Jul 07 17:16:00 EAT 2016

import web.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:8
// @LINE:7
// @LINE:6
package controllers.web {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def institutionDetail(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institutions/detail")
}
                        

// @LINE:7
def allInstitutions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "institutions/all")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:8
// @LINE:7
// @LINE:6
package controllers.web.javascript {
import ReverseRouteContext.empty

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def institutionDetail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.web.Application.institutionDetail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institutions/detail"})
      }
   """
)
                        

// @LINE:7
def allInstitutions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.web.Application.allInstitutions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "institutions/all"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.web.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:8
// @LINE:7
// @LINE:6
package controllers.web.ref {


// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def institutionDetail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.web.Application.institutionDetail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.web.Application", "institutionDetail", Seq(), "GET", """""", _prefix + """institutions/detail""")
)
                      

// @LINE:7
def allInstitutions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.web.Application.allInstitutions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.web.Application", "allInstitutions", Seq(), "GET", """""", _prefix + """institutions/all""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.web.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.web.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    