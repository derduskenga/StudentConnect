
package views.html.admin

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
object courseFieldFormView extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.web.CourseField],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courseFieldForm: Form[models.web.CourseField]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import formfieldtemplates._

Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/admin_main("New Course Fiels | Admin")/*5.40*/{_display_(Seq[Any](format.raw/*5.41*/("""
    """),_display_(/*6.6*/helper/*6.12*/.form(action=controllers.admincontrollers.routes.CourseActions.saveCourseField(), 'id->"coursefieldform",'name->"coursefieldform", 'method->"post")/*6.159*/{_display_(Seq[Any](format.raw/*6.160*/("""
        """),_display_(/*7.10*/if(flash.containsKey("coursefieldformsuccess"))/*7.57*/{_display_(Seq[Any](format.raw/*7.58*/("""
        """),format.raw/*8.9*/("""<div class="alert alert-success">
            """),_display_(/*9.14*/flash/*9.19*/.get("coursefieldformsuccess")),format.raw/*9.49*/("""
        """),format.raw/*10.9*/("""</div>
        """)))}),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""<fieldset>
            <legend>Add New Course Field</legend>
            <!--Used to differentiate new form or form editing-->
            <input type="hidden"  value=""""),_display_(/*15.43*/courseFieldForm("course_field_id")/*15.77*/.valueOr("")),format.raw/*15.89*/("""" name="course_field_id"/>

            """),_display_(/*17.14*/text(courseFieldForm("course_field_name"),
            label = "Course Field name",
            placeholder = "Course Field name (e.g. Engineering, Business etc..)",
            divClass="col-sm-9")),format.raw/*20.33*/("""

            """),_display_(/*22.14*/formfieldtemplates/*22.32*/.textarea(courseFieldForm("course_field_description"),
            label="Course field description",
            placeholder = "Type your course description here...... ",
            rows="4",
            divClass="col-sm-9")),format.raw/*26.33*/("""

        """),format.raw/*28.9*/("""</fieldset>

                    <p align="right"><input  type="submit" class="btn btn-primary" value="Save" id="course-field-submit-btn"></p>





    """)))}),format.raw/*36.6*/("""
""")))}),format.raw/*37.2*/("""
"""))}
  }

  def render(courseFieldForm:Form[models.web.CourseField]): play.twirl.api.HtmlFormat.Appendable = apply(courseFieldForm)

  def f:((Form[models.web.CourseField]) => play.twirl.api.HtmlFormat.Appendable) = (courseFieldForm) => apply(courseFieldForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 29 01:43:19 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/admin/app/views/admin/courseFieldFormView.scala.html
                  HASH: e6d8912a3db94c2755945500ffabf5d6953dc2bd
                  MATRIX: 765->1|943->48|970->95|997->97|1043->135|1081->136|1112->142|1126->148|1282->295|1321->296|1357->306|1412->353|1450->354|1485->363|1558->410|1571->415|1621->445|1657->454|1704->470|1740->479|1936->648|1979->682|2012->694|2080->735|2299->933|2341->948|2368->966|2614->1191|2651->1201|2834->1354|2866->1356
                  LINES: 26->1|30->1|31->4|32->5|32->5|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|36->9|36->9|36->9|37->10|38->11|39->12|42->15|42->15|42->15|44->17|47->20|49->22|49->22|53->26|55->28|63->36|64->37
                  -- GENERATED --
              */
          