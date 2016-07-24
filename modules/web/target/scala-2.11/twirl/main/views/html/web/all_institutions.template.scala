
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
object all_institutions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/other_main("Student Connect | All Institutions")/*1.50*/{_display_(Seq[Any](format.raw/*1.51*/("""
        """),format.raw/*2.9*/("""<div class="row" id="content">
            <div class="col-md-offset-2 col-md-8">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="#">Universities</a></li>

                </ul>

                <div class="tab-content">
                    <br>
                    <div id="unis" class="tab-pane fade in active">

                        <div class="row">
                            <div class="col-md-12">

                                <div class="media uni-items">
                                    <div class="media-left">
                                        <a href="#">
                                            <img class="media-object" src='"""),_display_(/*19.77*/routes/*19.83*/.Assets.at("images/jkuat_Logo.jpg")),format.raw/*19.118*/("""' alt="Jkuat">
                                        </a>
                                    </div>
                                    <div class="media-body">
                                        <h4 class="media-heading campus_name">JKUAT</h4>
                                        <p>JKUAT values the need for transformational leadership to steer the University towards achieving her vision and mission and contribute towards the social and economic development of the country.</p>
                                        <p><a href="detail"><i class="fa fa-plus fa-fw"></i>Read More</a></p>
                                    </div>
                                </div>

                                <hr class="intro-divider" width="60%"/>

                            </div>



                            <div class="col-md-12">

                                <div class="media uni-items">
                                    <div class="media-left">
                                        <a href="#">
                                            <img class="media-object" src='"""),_display_(/*40.77*/routes/*40.83*/.Assets.at("images/ku_logo.png")),format.raw/*40.115*/("""' alt="KU">
                                        </a>
                                    </div>
                                    <div class="media-body">
                                        <h4 class="media-heading campus_name">KU</h4>
                                        <p>Kenyatta University is one of the leading universities in Kenya judging by the quality of our graduates. Our aim is not only to maintain this position, but to improve further and attain our vision of becoming a world-class university that is committed to quality and relevance.</p>
                                        <p><a href="university_details.php"><i class="fa fa-plus fa-fw"></i>Read More</a></p>
                                    </div>
                                </div>

                                <hr class="intro-divider" width="60%"/>

                            </div>

                            <div class="col-md-12">

                                <div class="media uni-items">
                                    <div class="media-left">
                                        <a href="#">
                                            <img class="media-object" src='"""),_display_(/*59.77*/routes/*59.83*/.Assets.at("images/mku_logo.jpg")),format.raw/*59.116*/("""' alt="KU">
                                        </a>
                                    </div>
                                    <div class="media-body">
                                        <h4 class="media-heading campus_name">MKU</h4>
                                        <p>Mount Kenya University (MKU) is a fully fledged chartered university committed to a broad-based, wholistic and inclusive system of education. It has an overall goal of promoting human resource development for society’s progressive good.</p>
                                        <p><a href="university_details.php"><i class="fa fa-plus fa-fw"></i>Read More</a></p>
                                    </div>
                                </div>

                                <hr class="intro-divider" />

                            </div>


                        </div>


                    </div>


                </div>

            </div>
        </div>
""")))}/*84.2*/{_display_(Seq[Any](format.raw/*84.3*/("""<div></div>""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 21 23:46:25 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/web/app/views/web/all_institutions.scala.html
                  HASH: 2dd56e90cbf227a791b17e2369bc2058ee0b2718
                  MATRIX: 813->1|869->49|907->50|942->59|1693->783|1708->789|1765->824|2895->1927|2910->1933|2964->1965|4186->3160|4201->3166|4256->3199|5235->4160|5273->4161
                  LINES: 29->1|29->1|29->1|30->2|47->19|47->19|47->19|68->40|68->40|68->40|87->59|87->59|87->59|112->84|112->84
                  -- GENERATED --
              */
          