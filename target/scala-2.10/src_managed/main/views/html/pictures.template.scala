
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
object pictures extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Task],Array[String],Array[String],Int,String,Array[Boolean],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], got: Array[String], isimler: Array[String], sayi: Int, id: String, linkler: Array[Boolean]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Pictures 1.0")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
   <!DOCTYPE html>
<html lang="en"> 
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" type="text/css" 
                       href='"""),_display_(Seq[Any](/*14.31*/routes/*14.37*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*14.76*/("""'>
<link rel="stylesheet" type="text/css" 
                       href='"""),_display_(Seq[Any](/*16.31*/routes/*16.37*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*16.87*/("""'>
                        <style>
      body """),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
      """),format.raw/*20.7*/("""}"""),format.raw/*20.8*/("""
      . container-fluid """),format.raw/*21.25*/("""{"""),format.raw/*21.26*/("""
          /*padding-top: 60px;*/
          margin-top: 60px;
      """),format.raw/*24.7*/("""}"""),format.raw/*24.8*/("""
        . bokpsr """),format.raw/*25.18*/("""{"""),format.raw/*25.19*/("""
            /*padding-bottom: 60px;*/
            /*margin-bottom: 60px;*/
            background-color: #ccc;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
        .btn """),format.raw/*30.14*/("""{"""),format.raw/*30.15*/("""
        margin-top: 10px;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
        
    </style>
    </head>
    <body>
      <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">BWF-TR</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">About</a></li>
              <li><a href="#contact">Contact</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    <div class="bokpsr">
      
        
    <p></br><p>
    </div>
        <div class="container-fluid">
        
</div><!--/.fluid-container-->
    <div class="container">
<div class="row">
      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="span6">
        <h1>Arkadaşlarına bakmaya başla</h1>
        <p>Bunlar hep nasip kısmet işleri.<br> Haydi bileğine kuvvet.</p>
        <p><a href="#" class="btn btn-primary btn-large">Nasıl Çalışıyor? &raquo;</a></p>
      </div>
      <div class="span6">
        <h1>Arkadaşlarına bakmaya başla</h1>
        <p>Bunlar hep nasip kısmet işleri.<br> Haydi bileğine kuvvet.</p>
        <p><a href="#" class="btn btn-primary btn-large">Nasıl Çalışıyor? &raquo;</a></p>
      </div>
</div>
      <!-- Example row of columns -->
     
      """),_display_(Seq[Any](/*80.8*/for(b <- 0 to sayi) yield /*80.27*/ {_display_(Seq[Any](format.raw/*80.29*/("""
      <div class="row">
       """),_display_(Seq[Any](/*82.9*/for(a <- 0 to 3) yield /*82.25*/ {_display_(Seq[Any](format.raw/*82.27*/("""
           <div class="span3">
          <h2 id=""""),_display_(Seq[Any](/*84.20*/got(a+b*4))),format.raw/*84.30*/("""1">"""),_display_(Seq[Any](/*84.34*/isimler(a+b*4))),format.raw/*84.48*/("""</h2>
          <img src='http://graph.facebook.com/"""),_display_(Seq[Any](/*85.48*/got(a+b*4))),format.raw/*85.58*/("""/picture?type=large' alt="Smiley face" >
          """),_display_(Seq[Any](/*86.12*/if(linkler(a+b*4))/*86.30*/ {_display_(Seq[Any](format.raw/*86.32*/("""
          <p><a href="javascript:;" id=""""),_display_(Seq[Any](/*87.42*/got(a+b*4))),format.raw/*87.52*/("""" class="btn btn-primary ilike" data-para1=""""),_display_(Seq[Any](/*87.97*/got(a+b*4))),format.raw/*87.107*/("""" data-para2=""""),_display_(Seq[Any](/*87.122*/id)),format.raw/*87.124*/("""">Seni seçtim &raquo;</a><p>
        """)))})),format.raw/*88.10*/("""
        </div>
        """)))})),format.raw/*90.10*/("""
      </div>
      """)))})),format.raw/*92.8*/("""

     <script>

     $(function()"""),format.raw/*96.18*/("""{"""),format.raw/*96.19*/("""
         $('.ilike').click(function()"""),format.raw/*97.38*/("""{"""),format.raw/*97.39*/("""
                           var $this = $(this);
                           var p1 = $this.data('para1');
                           var p2 = $this.data('para2');
                           //alert(p2+" pic hamdi "+ p1);
                           $.get('/get',
                                   """),format.raw/*103.36*/("""{"""),format.raw/*103.37*/("""yazilan: p1, yazan: p2"""),format.raw/*103.59*/("""}"""),format.raw/*103.60*/(""",
                                  function(data) """),format.raw/*104.50*/("""{"""),format.raw/*104.51*/("""
                                	   //
                                    // window.alert(data);
                                    // document.getElementById(p1).enabled=false;
                                   //  document.getElementById(p1).className = "";
                                   //  document.getElementById(p1).className = "btn btn-success";
                                     document.getElementById(p1+"1").innerHTML="İstek alındı";
                                    // document.getElementById(p1).onclick = "function """),format.raw/*111.88*/("""{"""),format.raw/*111.89*/("""console.log('Uye kaydi.');"""),format.raw/*111.115*/("""}"""),format.raw/*111.116*/(""""
                                     element = document.getElementById(p1);
                                     element.parentNode.removeChild(element);
                                  """),format.raw/*114.35*/("""}"""),format.raw/*114.36*/(""");
                          
                           """),format.raw/*116.28*/("""}"""),format.raw/*116.29*/(""");
         """),format.raw/*117.10*/("""}"""),format.raw/*117.11*/(""");

                </script>
                <script>
                function denemeget(bok)
                """),format.raw/*122.17*/("""{"""),format.raw/*122.18*/("""
                	alert("pichamdi " + bok);
                	$.get('/post',
                			"""),format.raw/*125.20*/("""{"""),format.raw/*125.21*/("""id: '12345'"""),format.raw/*125.32*/("""}"""),format.raw/*125.33*/(""",
                    	      function(data) """),format.raw/*126.43*/("""{"""),format.raw/*126.44*/("""
                    	          window.alert(data);
                    	      """),format.raw/*128.28*/("""}"""),format.raw/*128.29*/(""");
                          
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/("""
                function pageReload() """),format.raw/*131.39*/("""{"""),format.raw/*131.40*/("""
                	window.location.replace('http://ec2-54-214-154-70.us-west-2.compute.amazonaws.com/bwftr/pick.html');
                """),format.raw/*133.17*/("""}"""),format.raw/*133.18*/("""
                </script>
            <p id="shuffle">URL Tavsiyesi gelecek buraya</p>
            
            <button type="button" class="btn btn-success" onclick="denemeget('bok')">Shuffle</button>
            
             <button type="button" class="btn btn-success" onclick="pageReload()">Page Reload</button>
                  <footer>
            <p></br></br></br>&copy; BWFTR 2013</p>
        </footer>
    </div> <!-- /container -->
    
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src='"""),_display_(Seq[Any](/*146.19*/routes/*146.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*146.67*/("""'></script>
    </body>
</html>

""")))})),format.raw/*150.2*/("""


"""))}
    }
    
    def render(tasks:List[Task],got:Array[String],isimler:Array[String],sayi:Int,id:String,linkler:Array[Boolean]): play.api.templates.Html = apply(tasks,got,isimler,sayi,id,linkler)
    
    def f:((List[Task],Array[String],Array[String],Int,String,Array[Boolean]) => play.api.templates.Html) = (tasks,got,isimler,sayi,id,linkler) => apply(tasks,got,isimler,sayi,id,linkler)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 11 18:02:49 EEST 2013
                    SOURCE: /Users/kirimgeraykirimli/Desktop/play-2.1.1/bwftr/app/views/pictures.scala.html
                    HASH: 46ab41dbe52a986c909e1d595ed247c80261c643
                    MATRIX: 784->1|989->112|1017->131|1053->133|1081->153|1120->155|1450->449|1465->455|1526->494|1635->567|1650->573|1722->623|1796->669|1825->670|1962->780|1990->781|2043->806|2072->807|2167->875|2195->876|2241->894|2270->895|2417->1015|2446->1016|2488->1030|2517->1031|2579->1066|2608->1067|4276->2700|4311->2719|4351->2721|4419->2754|4451->2770|4491->2772|4578->2823|4610->2833|4650->2837|4686->2851|4775->2904|4807->2914|4895->2966|4922->2984|4962->2986|5040->3028|5072->3038|5153->3083|5186->3093|5238->3108|5263->3110|5333->3148|5390->3173|5442->3194|5504->3228|5533->3229|5599->3267|5628->3268|5954->3565|5984->3566|6035->3588|6065->3589|6145->3640|6175->3641|6748->4185|6778->4186|6834->4212|6865->4213|7084->4403|7114->4404|7200->4461|7230->4462|7271->4474|7301->4475|7441->4586|7471->4587|7595->4682|7625->4683|7665->4694|7695->4695|7768->4739|7798->4740|7906->4819|7936->4820|8011->4866|8041->4867|8109->4906|8139->4907|8303->5042|8333->5043|8901->5574|8917->5580|8982->5622|9048->5656
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|48->20|48->20|49->21|49->21|52->24|52->24|53->25|53->25|57->29|57->29|58->30|58->30|60->32|60->32|108->80|108->80|108->80|110->82|110->82|110->82|112->84|112->84|112->84|112->84|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|115->87|115->87|115->87|116->88|118->90|120->92|124->96|124->96|125->97|125->97|131->103|131->103|131->103|131->103|132->104|132->104|139->111|139->111|139->111|139->111|142->114|142->114|144->116|144->116|145->117|145->117|150->122|150->122|153->125|153->125|153->125|153->125|154->126|154->126|156->128|156->128|158->130|158->130|159->131|159->131|161->133|161->133|174->146|174->146|174->146|178->150
                    -- GENERATED --
                */
            