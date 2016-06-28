
package views.html.web

import play.twirl.api._
import play.twirl.api.TemplateMagic._

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
import helper._
import formfieldtemplates._
/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String)(content: Html)(extra_content: Html=null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.58*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- bootstrap -css -->
    <link rel="stylesheet" type="text/css" href='"""),_display_(/*13.51*/routes/*13.57*/.Assets.at("components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*13.118*/("""'>

    <!-- font awesome css -->

    <link rel="stylesheet" type="text/css" href='"""),_display_(/*17.51*/routes/*17.57*/.Assets.at("components/font-awesome/css/font-awesome.min.css")),format.raw/*17.119*/("""'>

    <!-- custom css -->

    <link rel="stylesheet" type="text/css" href='"""),_display_(/*21.51*/routes/*21.57*/.Assets.at("css/custom.css")),format.raw/*21.85*/("""'>

    <!-- subscription css -->

    <link rel="stylesheet" type="text/css" href='"""),_display_(/*25.51*/routes/*25.57*/.Assets.at("css/subscription.css")),format.raw/*25.91*/("""'>

    <!-- fonts -->

    <link href='https://fonts.googleapis.com/css?family=Raleway|Lobster' rel='stylesheet' type='text/css'>

    <!-- jquery js -->

    <script type="text/javascript" src='"""),_display_(/*33.42*/routes/*33.48*/.Assets.at("components/jquery/dist/jquery.min.js")),format.raw/*33.98*/("""'></script>

    <!-- bootstrap js -->

    <script type="text/javascript" src='"""),_display_(/*37.42*/routes/*37.48*/.Assets.at("components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*37.107*/("""'></script>



    <!-- custom js -->

    <script type="text/javascript" src='"""),_display_(/*43.42*/routes/*43.48*/.Assets.at("js/custom.js")),format.raw/*43.74*/("""'></script>



    <!----Navigation here ---->

    <nav class="navbar navbar-default navbar-fixed-top" id="campus_navbar">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*59.48*/controllers/*59.59*/.web.routes.Application.index()),format.raw/*59.90*/("""">Seeking</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav col-md-5">


                    <form  class="navbar-form" role="search" class="form-inline">
                        <div class="form-group" >

                            <input type="text" id="navbar_input" class="form-control" placeholder="Search">
                        </div>


                        <button class="btn btn-primary search_btn" stype="submit"><i class="fa fa-search"></i></button>

                    </form>

                </ul>
                <ul class="nav navbar-nav navbar-right">

                    <li><a href="index.php">Home</a></li>

                    <li class="dropdown mega-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Institutions<span class="caret"></span></a>
                        <ul class="dropdown-menu mega-dropdown-menu">


                            <li class="col-md-12" id="about_content">
                                <div class="row" id="section_company">

                                    <div class="col-md-2">


                                        <ul style="list-style: none;">
                                            <li><h5>Public</h5></li>
                                            <li><a href="university_details.php">JKUAT</a></li>
                                            <li><a href="university_details.php">KU</a></li>
                                            <li><a href="university_details.php">Nairobi</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>


                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Private</h5></li>
                                            <li><a href="university_details.php">Strathmore</a></li>
                                            <li><a href="university_details.php">MKU</a></li>
                                            <li><a href="university_details.php">CUEA</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>
                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Colleges</h5></li>
                                            <li><a href="university_details.php">Strathmore</a></li>
                                            <li><a href="university_details.php">MKU</a></li>
                                            <li><a href="university_details.php">CUEA</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>




                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Research Institutes</h5></li>
                                            <li><a href="university_details.php">KEMRI</a></li>
                                            <li><a href="university_details.php">AMREF</a></li>
                                            <li><a href="university_details.php">ILRI</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Special Schools</h5></li>
                                            <li><a href="university_details.php">KSMS</a></li>
                                            <li><a href="university_details.php">AMREF</a></li>
                                            <li><a href="university_details.php">ILRI</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Online Learning</h5></li>
                                            <li><a href="university_details.php">University of People</a></li>
                                            <li><a href="university_details.php">Coursera</a></li>
                                            <li><a href="university_details.php">Edx</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>
                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Business Incubators </h5></li>
                                            <li><a href="university_details.php">iHub</a></li>
                                            <li><a href="university_details.php">iBiz</a></li>
                                            <li><a href="university_details.php">NaiLab</a></li>
                                            <li><a href="universities.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>
                                    </div>

                                </div>

                            </li>

                        </ul>
                    </li>


                    <li class="dropdown mega-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Courses<span class="caret"></span></a>
                        <ul class="dropdown-menu mega-dropdown-menu">

                            <li class="col-md-12" id="about_content">
                                <div class="row" id="section_company">

                                    <div class="col-md-2">

                                        <ul style="list-style: none;">
                                            <li><h5>Engineering</h5></li>
                                            <li><a href="university_details.php">Civil</a></li>
                                            <li><a href="university_details.php">Mechanical</a></li>
                                            <li><a href="university_details.php">Electrical</a></li>
                                            <li><a href="university_details.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>IT & Technology</h5></li>
                                            <li><a href="university_details.php">Computer Science</a></li>
                                            <li><a href="university_details.php">Information Technology</a></li>
                                            <li><a href="university_details.php">Computer Technology</a></li>
                                            <li><a href="university_details.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>

                                    <div class="col-md-2">


                                        <ul style="list-style: none;">
                                            <li><h5>Business</h5></li>
                                            <li><a href="university_details.php">Business Commerce</a></li>
                                            <li><a href="university_details.php">Business Adminstration</a></li>
                                            <li><a href="university_details.php">Business IT</a></li>
                                            <li><a href="university_details.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>



                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Social Sciences</h5></li>
                                            <li><a href="university_details.php">Business Commerce</a></li>
                                            <li><a href="university_details.php">Business Adminstration</a></li>
                                            <li><a href="university_details.php">Business IT</a></li>
                                            <li><a href="university_details.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>

                                    <div class="col-md-2">
                                        <ul style="list-style: none;">
                                            <li><h5>Arts</h5></li>
                                            <li><a href="university_details.php">Business Commerce</a></li>
                                            <li><a href="university_details.php">Business Adminstration</a></li>
                                            <li><a href="university_details.php">Business IT</a></li>
                                            <li><a href="university_details.php"><i class="fa fa-plus"></i>See More</a></li>
                                        </ul>

                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li><a href="#">Blog</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <!----Navigation End ---->
</head>
<body>


    <div class="col-md-12 col-sm-12 col-lg-12" id="slider-row">

        <div id="main_slider" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#main_slider" data-slide-to="0" class="active"></li>
                <li data-target="#main_slider" data-slide-to="1"></li>
                <li data-target="#main_slider" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img src='"""),_display_(/*273.32*/routes/*273.38*/.Assets.at("images/1.jpg")),format.raw/*273.64*/("""' alt="...">
                    <div class="carousel-caption">
                        <div class="caption-container">
                            <h5 class="slider-caption">Search for Universities and Colleges</h5>
                            <p>his is a one stop portal where you will find most institutions of higher learning in Kenya.Get to know if the university
                                you are looking for has been accredited by the Commission of Higher Education(CHE) or wheather the college or
                                technical institute you want to study in is registered
                                by the Ministry of Higher Education Science and Technology (MOHEST).</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src='"""),_display_(/*285.32*/routes/*285.38*/.Assets.at("images/2.png")),format.raw/*285.64*/("""' alt="...">
                    <div class="carousel-caption">
                        <div class="caption-container">
                            <h5 class="slider-caption">Browse, search and compare Colleges</h5>
                            <p>The portal has listed all courses from top institutions in Kenya.This provides a good platform to search and compare
                                courses in terms of content and price in more than one institution.It also gives you an insight whether a course offered
                                in an institution is accredited by relevant bodies</p>
                        </div>

                    </div>
                </div>

                <div class="item">
                    <img src='"""),_display_(/*298.32*/routes/*298.38*/.Assets.at("images/3.jpg")),format.raw/*298.64*/("""' alt="...">
                    <div class="carousel-caption">
                        <div class="caption-container">
                            <h4 class="slider-caption">Find Scholarship Opportunities</h4>
                            <p>We will list scholarships opportunities from Kenya and outside Kenya as they come.We also inform you of the institutions
                                and individual who give regular scholarships</p>
                        </div>

                    </div>
                </div>

            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#main_slider" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#main_slider" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>


    <div class="container">
        """),_display_(/*325.10*/content),format.raw/*325.17*/("""
    """),format.raw/*326.5*/("""</div>
    """),_display_(/*327.6*/extra_content),format.raw/*327.19*/("""
    """),format.raw/*328.5*/("""<!---Footer here--->
    <div class="footer">
        <div class="container">
            <div class="col-md-3">
                <ul style="list-style: none;" class="footer_menu">


                    <li><h5>Institutions</h5></li>
                    <li><a href="#">Public</a></li>
                    <li><a href="#">Private</a></li>
                    <li><a href="#">Research Institutions</a></li>
                    <li><a href="#">Special Schools</a></li>

                </ul>
                <div class="clearfix"> </div>
            </div>
            <div class="col-md-3">
                <ul style="list-style: none;" class="footer_menu">


                    <li><h5>Courses</h5></li>
                    <li><a href="#">Enginnering</a></li>
                    <li><a href="#">IT</a></li>
                    <li><a href="#">Business</a></li>
                    <li><a href="#">Socail Sciences</a></li>

                </ul>

            </div>
            <div class="col-md-3">
                <ul style="list-style: none;" class="footer_menu">


                    <li><h5>About Us</h5></li>
                    <li><a href="#">Staff</a></li>
                    <li><a href="#">Success Stories</a></li>
                    <li><a href="#">Partners</a></li>
                    <li><a href="#">Sponsors</a></li>

                </ul>

            </div>
            <div class="col-md-3">
                <ul style="list-style: none;" class="footer_menu">


                    <li><h5>Find us On Social Media</h5></li>
                    <li><i class="fa fa-letter-B fa-2x fa-fw">B</i>Blog</li>
                    <li><i class="fa fa-facebook fa-2x fa-fw fb_link"></i>Facebook</li>
                    <li><i class="fa fa-twitter fa-fw fa-2x fa-fw twitter_link"></i>Twitter</li>
                    <li><i class="fa fa-linkedin fa-fw fa-2x fa-fw linked_ln"></i>likedin</li>


                </ul>

            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="footer_bottom">
        <div class="container">

            <div class="col-md-4 col-sm-4">
                <ul>

                </ul>
            </div>
            <div class="col-md-4 col-sm-4">
                <ul>

                </ul>
            </div>
            <div class="col-md-4 col-sm-4 footer_text">

            </div>
            <div class="clearfix"> </div>
            <div class="copy">
                <p>Copyright © 2015 Seeking . All Rights Reserved</p>
            </div>
        </div>
    </div>


    <!--Subscription End--->
    <div class="row subscribe-row">
        <div class="col-md-2">



        </div>
        <div class="col-md-10">

            <form class="form-inline">

                <div class="form-group">




                    <label for="subscribe_email">Subscribe</label>

                    <input type="text" placeholder="Email" id="subscribe_email" class="form-control"/>

                    <div class="btn btn-primary">Subscribe</div>



                </div>

                <a href="#" class="btn close_subscribe">X</a>

            </form>



        </div>

        <!--Subscription End--->

        <!------Ask question --->

        <div id="bit" class="loggedout-follow-normal" style="bottom: 0px; right: 0px; height:110px">

            <div id="bitsubscribe" class="open">
                <h3><label for="loggedout-follow-field">Have a Question?</h3>
                <p id="bsub-subscribe-button"><input type="submit" value="Ask"/></p>

            </div>
        </div>
        <!------ask question ends---->

    </div>

        <!--Footer ends here----->
</body>
</html>"""))}
  }

  def render(title:String,content:Html,extra_content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(extra_content)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (extra_content) => apply(title)(content)(extra_content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 28 20:58:42 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/web/app/views/web/main.scala.html
                  HASH: 1b9495b3deab1f459440c1870e0d2325a6c67247
                  MATRIX: 779->47|923->103|950->104|1018->146|1043->151|1316->397|1331->403|1414->464|1526->549|1541->555|1625->617|1731->696|1746->702|1795->730|1907->815|1922->821|1977->855|2201->1052|2216->1058|2287->1108|2395->1189|2410->1195|2491->1254|2598->1334|2613->1340|2660->1366|3418->2097|3438->2108|3490->2139|14882->13503|14898->13509|14946->13535|15824->14385|15840->14391|15888->14417|16669->15170|16685->15176|16733->15202|17919->16360|17948->16367|17981->16372|18020->16384|18055->16397|18088->16402
                  LINES: 27->3|30->3|31->4|34->7|34->7|40->13|40->13|40->13|44->17|44->17|44->17|48->21|48->21|48->21|52->25|52->25|52->25|60->33|60->33|60->33|64->37|64->37|64->37|70->43|70->43|70->43|86->59|86->59|86->59|300->273|300->273|300->273|312->285|312->285|312->285|325->298|325->298|325->298|352->325|352->325|353->326|354->327|354->327|355->328
                  -- GENERATED --
              */
          