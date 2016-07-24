
package views.html.formfieldtemplates

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
object textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Field,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "",
help: String = "", divClass:String="col-sm-10", fieldcontrolattr: String=""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.77*/("""

"""),format.raw/*4.1*/("""<div class="form-group """),_display_(/*4.25*/if(field.hasErrors)/*4.44*/ {_display_(Seq[Any](format.raw/*4.46*/("""has-error""")))}),format.raw/*4.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*5.44*/label),format.raw/*5.49*/("""</label>
    <div class=""""),_display_(/*6.18*/divClass),format.raw/*6.26*/("""">
      <textarea class="form-control"
                rows=""""),_display_(/*8.24*/rows),format.raw/*8.28*/(""""
                id=""""),_display_(/*9.22*/field/*9.27*/.id),format.raw/*9.30*/(""""
                name=""""),_display_(/*10.24*/field/*10.29*/.name),format.raw/*10.34*/(""""
                placeholder=""""),_display_(/*11.31*/placeholder),format.raw/*11.42*/(""""
                """),_display_(/*12.18*/fieldcontrolattr),format.raw/*12.34*/("""
      """),format.raw/*13.7*/(""">"""),_display_(/*13.9*/field/*13.14*/.value.getOrElse("")),format.raw/*13.34*/("""</textarea>
        <span class="help-block"><small>"""),_display_(/*14.42*/help),format.raw/*14.46*/("""</small></span>
        <span class="help-block">"""),_display_(/*15.35*/{field.error.map { error => error.message }}),format.raw/*15.79*/("""</span>
    </div>
</div"""))}
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String,divClass:String,fieldcontrolattr:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help,divClass,fieldcontrolattr)

  def f:((Field,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help,divClass,fieldcontrolattr) => apply(field,rows,label,placeholder,help,divClass,fieldcontrolattr)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 21 23:46:27 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/textarea.scala.html
                  HASH: b82531c15f74706a4203eb79dd3b2afe462f432f
                  MATRIX: 786->1|1039->166|1067->168|1117->192|1144->211|1183->213|1223->223|1295->269|1320->274|1372->300|1400->308|1489->371|1513->375|1562->398|1575->403|1598->406|1650->431|1664->436|1690->441|1749->473|1781->484|1827->503|1864->519|1898->526|1926->528|1940->533|1981->553|2061->606|2086->610|2163->660|2228->704
                  LINES: 26->1|30->2|32->4|32->4|32->4|32->4|32->4|33->5|33->5|34->6|34->6|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|43->15|43->15
                  -- GENERATED --
              */
          