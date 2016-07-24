// @SOURCE:/home/derdus/studentconnect/modules/web/conf/web.routes
// @HASH:77431746f8138e55085fd542ef637faa0a670b1d
// @DATE:Thu Jul 21 23:46:19 EAT 2016
package web

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
private[this] lazy val controllers_web_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_web_Application_index0_invoker = createInvoker(
controllers.web.Application.index(),
HandlerDef(this.getClass.getClassLoader, "web", "controllers.web.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_web_Application_allInstitutions1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institutions/all"))))
private[this] lazy val controllers_web_Application_allInstitutions1_invoker = createInvoker(
controllers.web.Application.allInstitutions(),
HandlerDef(this.getClass.getClassLoader, "web", "controllers.web.Application", "allInstitutions", Nil,"GET", """""", Routes.prefix + """institutions/all"""))
        

// @LINE:8
private[this] lazy val controllers_web_Application_institutionDetail2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("institutions/detail"))))
private[this] lazy val controllers_web_Application_institutionDetail2_invoker = createInvoker(
controllers.web.Application.institutionDetail(),
HandlerDef(this.getClass.getClassLoader, "web", "controllers.web.Application", "institutionDetail", Nil,"GET", """""", Routes.prefix + """institutions/detail"""))
        

// @LINE:13
lazy val common_Routes3 = Include(common.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.web.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institutions/all""","""controllers.web.Application.allInstitutions()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """institutions/detail""","""controllers.web.Application.institutionDetail()"""),common.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_web_Application_index0_route(params) => {
   call { 
        controllers_web_Application_index0_invoker.call(controllers.web.Application.index())
   }
}
        

// @LINE:7
case controllers_web_Application_allInstitutions1_route(params) => {
   call { 
        controllers_web_Application_allInstitutions1_invoker.call(controllers.web.Application.allInstitutions())
   }
}
        

// @LINE:8
case controllers_web_Application_institutionDetail2_route(params) => {
   call { 
        controllers_web_Application_institutionDetail2_invoker.call(controllers.web.Application.institutionDetail())
   }
}
        

// @LINE:13
case common_Routes3(handler) => handler
        
}

}
     