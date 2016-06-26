// @SOURCE:/home/derdus/studentconnect/modules/common/conf/common.routes
// @HASH:8e2702944896a93aa335fcd091a7ae12ecf3df6b
// @DATE:Sat Jun 25 16:38:11 EAT 2016

import common.Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:11
package controllers {

// @LINE:11
class ReverseAssets {


// @LINE:11
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  

// @LINE:6
package controllers.common {

// @LINE:6
class ReverseApplication {


// @LINE:6
def status(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "status")
}
                        

}
                          
}
                  


// @LINE:11
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:11
class ReverseAssets {


// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        

// @LINE:6
package controllers.common.javascript {
import ReverseRouteContext.empty

// @LINE:6
class ReverseApplication {


// @LINE:6
def status : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.common.Application.status",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "status"})
      }
   """
)
                        

}
              
}
        


// @LINE:11
package controllers.ref {


// @LINE:11
class ReverseAssets {


// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """These are the common assets""", _prefix + """assets/$file<.+>""")
)
                      

}
                          
}
        

// @LINE:6
package controllers.common.ref {


// @LINE:6
class ReverseApplication {


// @LINE:6
def status(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.common.Application.status(), HandlerDef(this.getClass.getClassLoader, "", "controllers.common.Application", "status", Seq(), "GET", """ These are common routes that you may want all services to respond to.""", _prefix + """status""")
)
                      

}
                          
}
        
    