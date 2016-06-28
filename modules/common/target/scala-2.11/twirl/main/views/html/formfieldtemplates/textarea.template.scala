
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
object textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Field,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "", help: String = "",divClass:String="col-sm-10"):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.137*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class=""""),_display_(/*5.18*/divClass),format.raw/*5.26*/("""">
      <textarea class="form-control"
                rows=""""),_display_(/*7.24*/rows),format.raw/*7.28*/(""""
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/(""""
                name=""""),_display_(/*9.24*/field/*9.29*/.name),format.raw/*9.34*/(""""
                placeholder=""""),_display_(/*10.31*/placeholder),format.raw/*10.42*/(""""
      >"""),_display_(/*11.9*/field/*11.14*/.value.getOrElse("")),format.raw/*11.34*/("""</textarea>
        <span class="help-block"><small>"""),_display_(/*12.42*/help),format.raw/*12.46*/("""</small></span>
        <span class="help-block">"""),_display_(/*13.35*/{field.error.map { error => error.message }}),format.raw/*13.79*/("""</span>
    </div>
</div"""))}
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String,divClass:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help,divClass)

  def f:((Field,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help,divClass) => apply(field,rows,label,placeholder,help,divClass)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jun 28 20:58:42 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/textarea.scala.html
                  HASH: b584057f852d1e192fc16e211576654a52fd3c19
                  MATRIX: 779->1|1003->136|1031->138|1081->162|1108->181|1147->183|1187->193|1259->239|1284->244|1336->270|1364->278|1453->341|1477->345|1526->368|1539->373|1562->376|1613->401|1626->406|1651->411|1710->443|1742->454|1778->464|1792->469|1833->489|1913->542|1938->546|2015->596|2080->640
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|33->5|33->5|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|39->11|39->11|39->11|40->12|40->12|41->13|41->13
                  -- GENERATED --
              */
          