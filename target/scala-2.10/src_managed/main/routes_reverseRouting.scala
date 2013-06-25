// @SOURCE:/Users/kirimgeraykirimli/Desktop/play-2.1.1/bwftr/conf/routes
// @HASH:b50819447e0b1ae83255d7851a56fae74413b810
// @DATE:Tue Jun 25 15:48:31 EEST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def denemeget(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "post")
}
                                                

// @LINE:17
def deleteUser(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:18
def getJayson(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getJay/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def newTask(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:14
def deleteTask(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:11
def pictures(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pictures")
}
                                                

// @LINE:21
def getAccess(code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getAccess/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:13
def newUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:16
def varMI(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "get")
}
                                                

// @LINE:19
def mobVarMI(yazan:String, yazilan:String, isim:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sendSelectedFriend" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("yazan", yazan)), Some(implicitly[QueryStringBindable[String]].unbind("yazilan", yazilan)), Some(implicitly[QueryStringBindable[String]].unbind("isim", isim)))))
}
                                                

// @LINE:10
def tasks(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def denemeget : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.denemeget",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
   """
)
                        

// @LINE:17
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUser",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:18
def getJayson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getJayson",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getJay/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def newTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:14
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:11
def pictures : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pictures",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pictures"})
      }
   """
)
                        

// @LINE:21
def getAccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getAccess",
   """
      function(code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAccess/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:13
def newUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:16
def varMI : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.varMI",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get"})
      }
   """
)
                        

// @LINE:19
def mobVarMI : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mobVarMI",
   """
      function(yazan,yazilan,isim) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendSelectedFriend" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("yazan", yazan), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("yazilan", yazilan), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("isim", isim)])})
      }
   """
)
                        

// @LINE:10
def tasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
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
        


// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:15
def denemeget(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.denemeget(), HandlerDef(this, "controllers.Application", "denemeget", Seq(), "GET", """""", _prefix + """post""")
)
                      

// @LINE:17
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUser(id), HandlerDef(this, "controllers.Application", "deleteUser", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:18
def getJayson(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getJayson(id), HandlerDef(this, "controllers.Application", "getJayson", Seq(classOf[Long]), "GET", """""", _prefix + """getJay/$id<[^/]+>""")
)
                      

// @LINE:12
def newTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq(), "POST", """""", _prefix + """tasks""")
)
                      

// @LINE:14
def deleteTask(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]), "POST", """""", _prefix + """tasks/$id<[^/]+>/delete""")
)
                      

// @LINE:11
def pictures(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pictures(), HandlerDef(this, "controllers.Application", "pictures", Seq(), "GET", """""", _prefix + """pictures""")
)
                      

// @LINE:21
def getAccess(code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getAccess(code), HandlerDef(this, "controllers.Application", "getAccess", Seq(classOf[String]), "GET", """""", _prefix + """getAccess/""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:13
def newUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newUser(), HandlerDef(this, "controllers.Application", "newUser", Seq(), "POST", """""", _prefix + """users""")
)
                      

// @LINE:16
def varMI(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.varMI(), HandlerDef(this, "controllers.Application", "varMI", Seq(), "GET", """""", _prefix + """get""")
)
                      

// @LINE:19
def mobVarMI(yazan:String, yazilan:String, isim:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mobVarMI(yazan, yazilan, isim), HandlerDef(this, "controllers.Application", "mobVarMI", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """sendSelectedFriend""")
)
                      

// @LINE:10
def tasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq(), "GET", """""", _prefix + """tasks""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      