// @SOURCE:/Users/kirimgeraykirimli/Desktop/play-2.1.1/bwftr/conf/routes
// @HASH:b50819447e0b1ae83255d7851a56fae74413b810
// @DATE:Tue Jun 25 15:48:31 EEST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:10
private[this] lazy val controllers_Application_tasks2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
        

// @LINE:11
private[this] lazy val controllers_Application_pictures3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pictures"))))
        

// @LINE:12
private[this] lazy val controllers_Application_newTask4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
        

// @LINE:13
private[this] lazy val controllers_Application_newUser5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:14
private[this] lazy val controllers_Application_deleteTask6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:15
private[this] lazy val controllers_Application_denemeget7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post"))))
        

// @LINE:16
private[this] lazy val controllers_Application_varMI8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("get"))))
        

// @LINE:17
private[this] lazy val controllers_Application_deleteUser9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:18
private[this] lazy val controllers_Application_getJayson10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getJay/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Application_mobVarMI11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendSelectedFriend"))))
        

// @LINE:21
private[this] lazy val controllers_Application_getAccess12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getAccess/"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.tasks()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pictures""","""controllers.Application.pictures()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.newTask()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.newUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""controllers.Application.denemeget()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """get""","""controllers.Application.varMI()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/delete""","""controllers.Application.deleteUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getJay/$id<[^/]+>""","""controllers.Application.getJayson(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendSelectedFriend""","""controllers.Application.mobVarMI(yazan:String, yazilan:String, isim:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getAccess/""","""controllers.Application.getAccess(code:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:10
case controllers_Application_tasks2(params) => {
   call { 
        invokeHandler(controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Nil,"GET", """""", Routes.prefix + """tasks"""))
   }
}
        

// @LINE:11
case controllers_Application_pictures3(params) => {
   call { 
        invokeHandler(controllers.Application.pictures(), HandlerDef(this, "controllers.Application", "pictures", Nil,"GET", """""", Routes.prefix + """pictures"""))
   }
}
        

// @LINE:12
case controllers_Application_newTask4(params) => {
   call { 
        invokeHandler(controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Nil,"POST", """""", Routes.prefix + """tasks"""))
   }
}
        

// @LINE:13
case controllers_Application_newUser5(params) => {
   call { 
        invokeHandler(controllers.Application.newUser(), HandlerDef(this, "controllers.Application", "newUser", Nil,"POST", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:14
case controllers_Application_deleteTask6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tasks/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:15
case controllers_Application_denemeget7(params) => {
   call { 
        invokeHandler(controllers.Application.denemeget(), HandlerDef(this, "controllers.Application", "denemeget", Nil,"GET", """""", Routes.prefix + """post"""))
   }
}
        

// @LINE:16
case controllers_Application_varMI8(params) => {
   call { 
        invokeHandler(controllers.Application.varMI(), HandlerDef(this, "controllers.Application", "varMI", Nil,"GET", """""", Routes.prefix + """get"""))
   }
}
        

// @LINE:17
case controllers_Application_deleteUser9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteUser(id), HandlerDef(this, "controllers.Application", "deleteUser", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:18
case controllers_Application_getJayson10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.getJayson(id), HandlerDef(this, "controllers.Application", "getJayson", Seq(classOf[Long]),"GET", """""", Routes.prefix + """getJay/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_mobVarMI11(params) => {
   call(params.fromQuery[String]("yazan", None), params.fromQuery[String]("yazilan", None), params.fromQuery[String]("isim", None)) { (yazan, yazilan, isim) =>
        invokeHandler(controllers.Application.mobVarMI(yazan, yazilan, isim), HandlerDef(this, "controllers.Application", "mobVarMI", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """sendSelectedFriend"""))
   }
}
        

// @LINE:21
case controllers_Application_getAccess12(params) => {
   call(params.fromQuery[String]("code", None)) { (code) =>
        invokeHandler(controllers.Application.getAccess(code), HandlerDef(this, "controllers.Application", "getAccess", Seq(classOf[String]),"GET", """""", Routes.prefix + """getAccess/"""))
   }
}
        
}
    
}
        