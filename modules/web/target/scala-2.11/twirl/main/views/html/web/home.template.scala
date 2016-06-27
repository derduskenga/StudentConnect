
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Student Connect | Search All Institutions and Compare Courses and Fees")/*1.80*/{_display_(Seq[Any](format.raw/*1.81*/("""
    """),format.raw/*2.5*/("""<div class="col-md-12">
        <h2 align="center">Select an Area of Study</h2>
        <hr class="intro-divider" />

        <div class="row">

            <div class="col-md-2" data-toggle="tooltip" data-placement="left" title="Business">
                <div class="thumbnail service-thumb">
                    <i class="fa fa-briefcase fa-3x fa-fw"></i>
                    <div class="caption">
                        <h4></h4>
                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Law">
                    <i class="fa fa-balance-scale fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">
                        <h4></h4>
                    </div>
                </div>

            </div>
            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Medicine">
                    <i class="fa fa-user-md fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Engineering">
                    <i class="fa fa-wrench fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Hospitality">
                    <i class="fa fa-cutlery fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="IT">
                    <i class="fa fa-laptop fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Accounting">
                    <i class="fa fa-calculator fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">
                        <h4></h4>
                    </div>
                </div>
            </div>

            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Arts">
                    <i class="fa fa-paint-brush fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">
                        <h4></h4>
                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Massmedia">
                    <i class="fa fa-video-camera fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Music">
                    <i class="fa fa-music fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>


            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Eraly Childhood Education">
                    <i class="fa fa-child fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>



            <div class="col-md-2">
                <div class="thumbnail service-thumb" data-toggle="tooltip" data-placement="left" title="Sports">
                    <i class="fa fa-futbol-o fa-3x fa-fw" aria-hidden="true"></i>
                    <div class="caption">

                    </div>
                </div>
            </div>

        </div>

    </div>
""")))}/*129.2*/{_display_(Seq[Any](format.raw/*129.3*/("""<div></div>""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 26 14:31:13 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/web/app/views/web/home.scala.html
                  HASH: a8398e487ec4c43c9caf12d5974b4e31455a7d3c
                  MATRIX: 801->1|887->79|925->80|956->85|5420->4530|5459->4531
                  LINES: 29->1|29->1|29->1|30->2|157->129|157->129
                  -- GENERATED --
              */
          