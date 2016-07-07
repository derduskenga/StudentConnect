
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
"""),format.raw/*6.1*/("""<script>tinymce.init("""),format.raw/*6.22*/("""{"""),format.raw/*6.23*/(""" """),format.raw/*6.24*/("""selector:'textarea' """),format.raw/*6.44*/("""}"""),format.raw/*6.45*/(""");</script>
"""),_display_(/*7.2*/helper/*7.8*/.form(action=controllers.admincontrollers.routes.CourseActions.saveCourseField(),
'id->"coursefieldform",'name->"coursefieldform", 'method->"post")/*8.66*/{_display_(Seq[Any](format.raw/*8.67*/("""
        """),_display_(/*9.10*/if(flash.containsKey("coursefieldformsuccess"))/*9.57*/{_display_(Seq[Any](format.raw/*9.58*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("coursefieldformsuccess")),format.raw/*11.49*/("""
        """),format.raw/*12.9*/("""</div>
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""<fieldset>
            <legend>Add New Course Field</legend>
            <!--Used to differentiate new form or form editing-->
            <input type="hidden"  value=""""),_display_(/*17.43*/courseFieldForm("course_field_id")/*17.77*/.valueOr("")),format.raw/*17.89*/("""" name="course_field_id"/>

            """),_display_(/*19.14*/text(courseFieldForm("course_field_name"),
            label = "Course Field name",
            placeholder = "Course Field name (e.g. Engineering, Business etc..)",
            divClass="col-sm-9")),format.raw/*22.33*/("""

            """),_display_(/*24.14*/formfieldtemplates/*24.32*/.textarea(courseFieldForm("course_field_description"),
            label="Course field description",
            placeholder = "Type your course description here...... ",
            rows="4",
            divClass="col-sm-9")),format.raw/*28.33*/("""

        """),format.raw/*30.9*/("""</fieldset>

                    <p align="right"><input  type="submit" class="btn btn-primary" value="Save" id="course-field-submit-btn"></p>





    """)))}),format.raw/*38.6*/("""
""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(courseFieldForm:Form[models.web.CourseField]): play.twirl.api.HtmlFormat.Appendable = apply(courseFieldForm)

  def f:((Form[models.web.CourseField]) => play.twirl.api.HtmlFormat.Appendable) = (courseFieldForm) => apply(courseFieldForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 07 17:16:03 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/admin/app/views/admin/courseFieldFormView.scala.html
                  HASH: 831946267301ebc90bef936b40e94aff2d70637a
                  MATRIX: 765->1|943->48|970->95|997->97|1044->136|1082->137|1109->138|1157->159|1185->160|1213->161|1260->181|1288->182|1326->195|1339->201|1494->348|1532->349|1568->359|1623->406|1661->407|1697->416|1771->463|1785->468|1836->498|1872->507|1919->523|1955->532|2151->701|2194->735|2227->747|2295->788|2514->986|2556->1001|2583->1019|2829->1244|2866->1254|3049->1407|3081->1409
                  LINES: 26->1|30->1|31->4|32->5|32->5|32->5|33->6|33->6|33->6|33->6|33->6|33->6|34->7|34->7|35->8|35->8|36->9|36->9|36->9|37->10|38->11|38->11|38->11|39->12|40->13|41->14|44->17|44->17|44->17|46->19|49->22|51->24|51->24|55->28|57->30|65->38|66->39
                  -- GENERATED --
              */
          