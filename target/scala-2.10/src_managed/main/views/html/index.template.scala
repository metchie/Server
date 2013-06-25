
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Task],Form[Task],List[User],Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task], users: List[User], userForm: Form[User]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.84*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/tasks/*7.15*/.size())),format.raw/*7.22*/(""" task(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/for(task <- tasks) yield /*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/task/*12.22*/.label)),format.raw/*12.28*/("""
                """),_display_(Seq[Any](/*13.18*/task/*13.22*/.id)),format.raw/*13.25*/("""
                """),_display_(Seq[Any](/*14.18*/form(routes.Application.deleteTask(task.id))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
    
    <h2>Add a new task</h2>
    
    """),_display_(Seq[Any](/*23.6*/form(routes.Application.newTask())/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        
        """),_display_(Seq[Any](/*25.10*/inputText(taskForm("label")))),format.raw/*25.38*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*29.6*/("""
    <h1>"""),_display_(Seq[Any](/*30.10*/users/*30.15*/.size())),format.raw/*30.22*/(""" User(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*33.10*/for(user <- users) yield /*33.28*/ {_display_(Seq[Any](format.raw/*33.30*/("""
            <li>
                """),_display_(Seq[Any](/*35.18*/user/*35.22*/.label)),format.raw/*35.28*/("""
                """),_display_(Seq[Any](/*36.18*/user/*36.22*/.id)),format.raw/*36.25*/("""
                """),_display_(Seq[Any](/*37.18*/user/*37.22*/.jayson)),format.raw/*37.29*/("""
                """),_display_(Seq[Any](/*38.18*/form(routes.Application.deleteUser(user.id))/*38.62*/ {_display_(Seq[Any](format.raw/*38.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*40.18*/("""
            </li>
        """)))})),format.raw/*42.10*/("""
    </ul>
    <h2>Add a new user</h2>
    
    """),_display_(Seq[Any](/*46.6*/form(routes.Application.newUser())/*46.40*/ {_display_(Seq[Any](format.raw/*46.42*/("""
        
        """),_display_(Seq[Any](/*48.10*/inputText(userForm("label")))),format.raw/*48.38*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*52.6*/("""
     <script>
                function denemeget()
                """),format.raw/*55.17*/("""{"""),format.raw/*55.18*/("""
                	$.get('/userVarMI',
                			"""),format.raw/*57.20*/("""{"""),format.raw/*57.21*/("""id: '12345'"""),format.raw/*57.32*/("""}"""),format.raw/*57.33*/(""",
                    	      function(data) """),format.raw/*58.43*/("""{"""),format.raw/*58.44*/("""
                    	       //   window.alert(data);
                    	          document.getElementById("shuffle").innerHTML=data;
                    	      """),format.raw/*61.28*/("""}"""),format.raw/*61.29*/(""");
                          
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/("""
                
                function pageReload() """),format.raw/*65.39*/("""{"""),format.raw/*65.40*/("""
                	window.location.replace('http://ec2-54-214-154-70.us-west-2.compute.amazonaws.com/bwftr/pick.html');
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
                </script>
            <p id="shuffle">URL Tavsiyesi gelecek buraya</p>
            
            <button type="button" class="btn btn-success" onclick="denemeget()">userVarMI</button>
            
             <button type="button" class="btn btn-success" onclick="pageReload()">Page Reload</button>
    
""")))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task],users:List[User],userForm:Form[User]): play.api.templates.Html = apply(tasks,taskForm,users,userForm)
    
    def f:((List[Task],Form[Task],List[User],Form[User]) => play.api.templates.Html) = (tasks,taskForm,users,userForm) => apply(tasks,taskForm,users,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 11 14:02:48 EEST 2013
                    SOURCE: /Users/kirimgeraykirimli/Desktop/play-2.1.1/bwftr/app/views/index.scala.html
                    HASH: b96cd0b767319d12698a67ba13b0248a6e53d4dd
                    MATRIX: 760->1|935->83|963->102|999->104|1024->121|1063->123|1113->138|1126->143|1154->150|1227->187|1261->205|1301->207|1372->242|1385->246|1413->252|1467->270|1480->274|1505->277|1559->295|1612->339|1652->341|1759->416|1819->444|1908->498|1951->532|1991->534|2046->553|2096->581|2197->651|2243->661|2257->666|2286->673|2359->710|2393->728|2433->730|2504->765|2517->769|2545->775|2599->793|2612->797|2637->800|2691->818|2704->822|2733->829|2787->847|2840->891|2880->893|2987->968|3047->996|3131->1045|3174->1079|3214->1081|3269->1100|3319->1128|3420->1198|3516->1266|3545->1267|3630->1324|3659->1325|3698->1336|3727->1337|3799->1381|3828->1382|4019->1545|4048->1546|4122->1592|4151->1593|4235->1649|4264->1650|4427->1785|4456->1786
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|46->18|51->23|51->23|51->23|53->25|53->25|57->29|58->30|58->30|58->30|61->33|61->33|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|68->40|70->42|74->46|74->46|74->46|76->48|76->48|80->52|83->55|83->55|85->57|85->57|85->57|85->57|86->58|86->58|89->61|89->61|91->63|91->63|93->65|93->65|95->67|95->67
                    -- GENERATED --
                */
            