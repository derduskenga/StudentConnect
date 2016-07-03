
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
"""),_display_(/*5.2*/admin_main("New Course Fields | Admin")/*5.41*/{_display_(Seq[Any](format.raw/*5.42*/("""
    """),_display_(/*6.6*/helper/*6.12*/.form(action=controllers.admincontrollers.routes.CourseActions.saveCourseField(),
'id->"coursefieldform",'name->"coursefieldform", 'method->"post")/*7.66*/{_display_(Seq[Any](format.raw/*7.67*/("""
        """),_display_(/*8.10*/if(flash.containsKey("coursefieldformsuccess"))/*8.57*/{_display_(Seq[Any](format.raw/*8.58*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-success">
            """),_display_(/*10.14*/flash/*10.19*/.get("coursefieldformsuccess")),format.raw/*10.49*/("""
        """),format.raw/*11.9*/("""</div>
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""<fieldset>
            <legend>Add New Course Field</legend>
            <!--Used to differentiate new form or form editing-->
            <input type="hidden"  value=""""),_display_(/*16.43*/courseFieldForm("course_field_id")/*16.77*/.valueOr("")),format.raw/*16.89*/("""" name="course_field_id"/>

            """),_display_(/*18.14*/text(courseFieldForm("course_field_name"),
            label = "Course Field name",
            placeholder = "Course Field name (e.g. Engineering, Business etc..)",
            divClass="col-sm-9")),format.raw/*21.33*/("""

            """),_display_(/*23.14*/formfieldtemplates/*23.32*/.textarea(courseFieldForm("course_field_description"),
            label="Course field description",
            placeholder = "Type your course description here...... ",
            rows="4",
            divClass="col-sm-9")),format.raw/*27.33*/("""

        """),format.raw/*29.9*/("""</fieldset>

                    <p align="right"><input  type="submit" class="btn btn-primary" value="Save" id="course-field-submit-btn"></p>





    """)))}),format.raw/*37.6*/("""
""")))}),format.raw/*38.2*/("""
"""))}
  }

  def render(courseFieldForm:Form[models.web.CourseField]): play.twirl.api.HtmlFormat.Appendable = apply(courseFieldForm)

  def f:((Form[models.web.CourseField]) => play.twirl.api.HtmlFormat.Appendable) = (courseFieldForm) => apply(courseFieldForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 02 23:40:20 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/admin/app/views/admin/courseFieldFormView.scala.html
                  HASH: f8f98133f7504e0fde7009660cb7eb9b632b4b86
                  MATRIX: 765->1|943->48|970->95|997->97|1044->136|1082->137|1113->143|1127->149|1282->296|1320->297|1356->307|1411->354|1449->355|1484->364|1558->411|1572->416|1623->446|1659->455|1706->471|1742->480|1938->649|1981->683|2014->695|2082->736|2301->934|2343->949|2370->967|2616->1192|2653->1202|2836->1355|2868->1357
                  LINES: 26->1|30->1|31->4|32->5|32->5|32->5|33->6|33->6|34->7|34->7|35->8|35->8|35->8|36->9|37->10|37->10|37->10|38->11|39->12|40->13|43->16|43->16|43->16|45->18|48->21|50->23|50->23|54->27|56->29|64->37|65->38
                  -- GENERATED --
              */
          