// @SOURCE:/home/derdus/studentconnect/conf/routes
// @HASH:5408eb4d3ffc5b5cdf921533bb06fc7ee979f0dc
// @DATE:Sat Jul 02 23:42:25 EAT 2016


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
  List[(String,Routes)](("",common.Routes),("",admin.Routes),("",web.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
lazy val common_Routes0 = Include(common.Routes)
        

// @LINE:9
lazy val admin_Routes1 = Include(admin.Routes)
        

// @LINE:11
lazy val web_Routes2 = Include(web.Routes)
        
def documentation = List(common.Routes.documentation,admin.Routes.documentation,web.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case common_Routes0(handler) => handler
        

// @LINE:9
case admin_Routes1(handler) => handler
        

// @LINE:11
case web_Routes2(handler) => handler
        
}

}
     