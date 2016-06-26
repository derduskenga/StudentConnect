
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

/**/
object institution_detail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Student Connect | Strathmore University")/*1.49*/{_display_(Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<div class="row" id="campus-title-row">

    <div class="col-md-2">

        <div class="thumbnail logo_thumb">

            <img src="images/jkuat_Logo.jpg" height="150" width="150" />
        </div>

    </div>

    <div class="col-md-10">

        <h3>Jomo Kenyatta University of Agriculture and Technology</h3>

    </div>
</div>
<div class="row about_campus_row">
    <div class="col-md-offset-1 col-md-10">

        <h4 align="center">About</h4>

        <hr class="intro-divider" width="40%"/>

        <p>Jomo Kenyatta University of Agriculture and Technology is situated in Juja,
            36 kilometres North East of Nairobi, along Nairobi-Thika Highway.</p>

        <p>It was started in 1981 as a Middle Level College (Jomo Kenyatta College of
            Agriculture and Technology (JKCAT)) by the Government of Kenya with the generous
            assistance from the Japanese Government. Plans for the establishment of JKCAT
            started in 1977. In early 1978, the founding father of the nation, Mzee Jomo
            Kenyatta donated two hundred hectares of farmland for the establishment of
            the college.</p>
    </div>


</div>

<div class="row">



    <div class="col-md-offset-1 col-md-7">

        <div class="row">

            <div class="col-md-12">

                <h3>Programmes</h3>

                <div class="panel-group" id="accordion">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
                                    Certification</a>
                            </h4>
                        </div>
                        <div id="collapse1" class="panel-collapse collapse">
                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                commodo consequat.</div>
                        </div>
                    </div>
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">
                                    Certificate Courses</a>
                            </h4>
                        </div>
                        <div id="collapse2" class="panel-collapse collapse">
                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                commodo consequat.</div>
                        </div>
                    </div>
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">
                                    Diploma</a>
                            </h4>
                        </div>
                        <div id="collapse3" class="panel-collapse collapse">
                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                commodo consequat.</div>
                        </div>
                    </div>

                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Undergraduate</a>
                            </h4>
                        </div>
                        <div id="collapse4" class="panel-collapse collapse in">
                            <div class="panel-body">

                                <div class="panel-group" id="undergraduate_accordion">
                                    <div class="panel">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#undergraduate_accordion" href="#eng">
                                                    Engineering</a>
                                            </h4>
                                        </div>
                                        <div id="eng" class="panel-collapse collapse in">
                                            <div class="panel-body">

                                                <ul style="list-style: none;">

                                                    <li><a href="university_details.php#" data-toggle="modal" data-target=".bs-example-modal-lg">Civil</a></li>


                                                </ul>



                                            </div>
                                        </div>
                                    </div>
                                    <div class="panels">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#undergraduate_accordion" href="#ag">
                                                    Agriculture</a>
                                            </h4>
                                        </div>
                                        <div id="ag" class="panel-collapse collapse">
                                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                                commodo consequat.</div>
                                        </div>
                                    </div>
                                    <div class="panel">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#undergraduate_accordion" href="#it">
                                                    IT</a>
                                            </h4>
                                        </div>
                                        <div id="it" class="panel-collapse collapse">
                                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                                commodo consequat.</div>
                                        </div>
                                    </div>

                                    <div class="panel">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#undergraduate_accordion" href="#ss">
                                                    Social Sciences</a>
                                            </h4>
                                        </div>
                                        <div id="ss" class="panel-collapse collapse">
                                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                                commodo consequat.</div>
                                        </div>
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapse5">
                                    Postgraduate (Masters/Doctorate/Postdoctoral)</a>
                            </h4>
                        </div>
                        <div id="collapse5" class="panel-collapse collapse">
                            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                commodo consequat.</div>
                        </div>
                    </div>
                </div>

            </div>

        </div><!-- end of programmes row -->

        <!-- start of ranking row -->

        <div class="row">

            <h4 align="center">Rankings</h4>

            <hr class="intro-divider" width="40%" />


            <div class="col-md-4">

                <div class="thumbnail rank_thumb">

                    <div class="caption">

                        <h1>1</h1>
                        <p>In Kenya</p>
                        <img src="images/kenya.jpg" height="50">
                    </div>


                </div>
            </div>

            <div class="col-md-4">

                <div class="thumbnail rank_thumb">

                    <div class="caption">

                        <h1>50</h1>
                        <p>In Africa</p>
                        <img src="images/africa.png" height="50" />
                    </div>


                </div>
            </div>

            <div class="col-md-4">

                <div class="thumbnail rank_thumb">

                    <div class="caption">

                        <h1>550</h1>
                        <p>Worldwide</p>
                        <i class="fa fa-globe fa-3x fa-fw" aria-hidden="true"></i>

                    </div>


                </div>
            </div>




        </div>



        <!-- end of ranking row -->

        <div class="row">

            <h4 align="center">Capacity</h4>

            <hr class="intro-divider" width="40%" />

            <div class="col-md-12">

                <h5 align="center">Total : 30000</h5>

                <ul class="list-group">
                    <li class="list-group-item">Engineering : 15000</li>
                    <li class="list-group-item">Bcom : 12000</li>
                    <li class="list-group-item">IT : 1000</li>
                    <li class="list-group-item">Social Sciences : 2000</li>
                </ul>
            </div>
        </div>

        <div class="row" id="famous_row">

            <div class="col-md-offset-2 col-md-8">

                <h3 align="center">Famous For</h3>

                <hr class="intro-divider" width="40%" />

                <h5>1. Engineering</h5>

                <p>JKUAT is famous for its top notch Engineering programmes</p>

                <br>

                <h5>2. Basketball</h5>

                <p>JKUAT Warriors are the current 3 time University champions</p>
            </div>
        </div>
        <!-- end of famous for for row -->

        <!-- start of Instititution VC/Manager or Principal for row -->

        <div class="row" id="famous_row">
            <div class="col-md-offset-2 col-md-8">
                <h3 align="center">Instititution VC/Manager/Principal</h3>
            </div>
        </div>

        <!-- end of Institution VC/Manager or Principal row -->

    </div>

    <div class="col-md-4">

        <div class="row">

            <div class="col-md-12">

                <h4>Map</h4>

                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15956.390143609227!2d37.010508!3d-1.0891064!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xbefd8e40071d3352!2sJomo+Kenyatta+University+of+Agriculture+and+Technology!5e0!3m2!1sen!2s!4v1465672804910" width="100%" height="400" frameborder="0" style="border:0" allowfullscreen></iframe>

            </div>

        </div>

        <div class="row">

            <div class="col-md-12">

                <h4 align="center">Campuses</h4>

                <ul class="list-group">
                    <li class="list-group-item">JUJA</li>
                    <li class="list-group-item">KAREN</li>
                    <li class="list-group-item">CBD</li>
                    <li class="list-group-item">NYERI</li>
                </ul>


            </div>

        </div>

        <div class="row">
            <div class="col-md-12">
                <h4 align="center">Constituent Colleges</h4>
                <ul class="list-group">
                    <li class="list-group-item">KISII</li>
                    <li class="list-group-item">ELDORET</li>
                    <li class="list-group-item">NAKURU</li>
                    <li class="list-group-item">ZETECH</li>
                </ul>
            </div>
        </div>

        <div class="row">

            <div class="col-md-12">

                <h4 align="center">Contact</h4>

                <ul class="list-group contact_info" >
                    <li class="list-group-item"><i class="fa fa-phone fa-2x fa-fw"></i>070012345</li>
                    <li class="list-group-item"><i class="fa fa-envelope fa-2x fa-fw"></i>info (at) jkuat.ca.ke</li>

                </ul>
            </div>


            <div class="row">
                <div class="col-md-12">
                    <h4 align="center">Research Centers/Labs</h4>
                    <ul class="list-group">
                        <li class="list-group-item">iLabAfrica</li>
                        <li class="list-group-item">Huawei Lab</li>

                    </ul>
                </div>
            </div>


            <div class="row">
                <div class="col-md-12">
                    <h4 align="center">Business Incubators</h4>
                    <ul class="list-group">
                        <li class="list-group-item">NaiLab</li>
                        <li class="list-group-item">iBiz</li>

                    </ul>
                </div>
            </div>



            <div class="row">
                <div class="col-md-12">
                    <h4 align="center">Partners</h4>
                    <ul class="list-group">
                        <li class="list-group-item">IBM</li>
                        <li class="list-group-item">Oracle</li>
                    </ul>
                </div>
            </div>


            <div class="row">
                <div class="col-md-12">
                    <h4 align="center">Location</h4>
                    <ul class="list-group">
                        <li class="list-group-item">Region: </li>
                        <li class="list-group-item">County: </li>

                    </ul>
                </div>
            </div>



            <div class="row">
                <div class="col-md-12">
                    <h4 align="center">Schools/Faculty</h4>
                    <ul class="list-group">
                        <li class="list-group-item">Law </li>
                        <li class="list-group-item">Business Engineering</li>

                    </ul>
                </div>
            </div>


        </div>

    </div>
</div>

""")))}/*439.2*/{_display_(Seq[Any](format.raw/*439.3*/("""
"""),format.raw/*440.1*/("""<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" data-backdrop="static" data-keyboard="false">

    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header" align="right">
                <button type="button" class="btn btn-default" data-dismiss="modal">X</button>

            </div>
            <div class="row">
                <div class="col-md-offset-2 col-md-8">

                    <h4 align="center">About</h4>
                    <hr class="intro-divider" width="40%"/>

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                        minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                        commodo consequat</p>


                </div>

                <div class="col-md-offset-2 col-md-8">

                    <h4 align="center">Description</h4>
                    <hr class="intro-divider" width="40%" />

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                        minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                        commodo consequat</p>


                </div>

                <div class="col-md-offset-2 col-md-8">

                    <h4 align="center">Other Campuses</h4>
                    <hr class="intro-divider" width="40%" />

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                        minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                        commodo consequat</p>


                </div>

                <div class="col-md-offset-2 col-md-8">

                    <h4 align="center">Specialisation</h4>
                    <hr class="intro-divider" width="40%" />

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                        minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                        commodo consequat</p>


                </div>

                <div class="col-md-offset-2 col-md-8">

                    <h4 align="center">Certifications</h4>
                    <hr class="intro-divider" width="40%" />

                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                        minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                        commodo consequat</p>
                </div>
            </div>

        </div>
    </div>
</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 25 21:06:59 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/web/app/views/web/institution_detail.scala.html
                  HASH: f2cb14735ddc5daeb1de3de14a5d46a052c31df9
                  MATRIX: 815->1|870->48|908->49|936->51|17733->16829|17772->16830|17801->16831
                  LINES: 29->1|29->1|29->1|31->3|467->439|467->439|468->440
                  -- GENERATED --
              */
          