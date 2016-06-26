
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

Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <title></title>
</head>

<body>
    """),_display_(/*9.6*/helper/*9.12*/.form(action=controllers.admincontrollers.routes.CourseActions.saveCourseField(), 'id->"coursefieldform",'name->"coursefieldform", 'method->"post")/*9.159*/{_display_(Seq[Any](format.raw/*9.160*/("""
        """),format.raw/*10.9*/("""<fieldset>
            <legend>Add New Course Field</legend>
            <!--Used to differentiate new form or form editing-->
            <input type="hidden"  value=""""),_display_(/*13.43*/courseFieldForm("course_field_id")/*13.77*/.valueOr("")),format.raw/*13.89*/("""" name="course_field_id"/>
            """),_display_(/*14.14*/helper/*14.20*/.inputText(courseFieldForm("course_field_name"), 'id->"course_field_name", 'name->"course_field_name", '_label -> "Course field name (e.g. Engineering, Business etc..)")),format.raw/*14.189*/("""
            """),_display_(/*15.14*/helper/*15.20*/.textarea(courseFieldForm("course_field_description"), 'rows->"5", 'cols->"32", 'id->"course_field_description", 'name->"course_field_description", '_label -> "Course field description")),format.raw/*15.206*/("""
            """),format.raw/*16.13*/("""<input type="submit" value="Save" id="course_field_submit_btn">


        </fieldset>
    """)))}),format.raw/*20.6*/("""
"""),format.raw/*21.1*/("""</body>

</html>"""))}
  }

  def render(courseFieldForm:Form[models.web.CourseField]): play.twirl.api.HtmlFormat.Appendable = apply(courseFieldForm)

  def f:((Form[models.web.CourseField]) => play.twirl.api.HtmlFormat.Appendable) = (courseFieldForm) => apply(courseFieldForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 25 16:38:15 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/admin/app/views/admin/courseFieldFormView.scala.html
                  HASH: cd34904b859eceb0c8505a1324f50b3a8f09b65f
                  MATRIX: 765->1|915->48|942->66|1022->121|1036->127|1192->274|1231->275|1267->284|1463->453|1506->487|1539->499|1606->539|1621->545|1812->714|1853->728|1868->734|2076->920|2117->933|2238->1024|2266->1025
                  LINES: 26->1|29->1|30->3|36->9|36->9|36->9|36->9|37->10|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|47->20|48->21
                  -- GENERATED --
              */
          