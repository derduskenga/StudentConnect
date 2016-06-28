
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
object text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Field,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "",divClass:String="col-sm-8",
fieldcontrolattr: String ="", fieldsizing:String=""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.53*/("""

"""),format.raw/*4.1*/("""<div class="form-group """),_display_(/*4.25*/if(field.hasErrors)/*4.44*/ {_display_(Seq[Any](format.raw/*4.46*/("""has-error""")))}),format.raw/*4.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*5.44*/label),format.raw/*5.49*/("""</label>
    <div class=""""),_display_(/*6.18*/divClass),format.raw/*6.26*/("""">
        <input type="text"
               class="form-control """),_display_(/*8.37*/fieldsizing),format.raw/*8.48*/(""""
               id=""""),_display_(/*9.21*/field/*9.26*/.id),format.raw/*9.29*/(""""
               name=""""),_display_(/*10.23*/field/*10.28*/.name),format.raw/*10.33*/(""""
               value=""""),_display_(/*11.24*/field/*11.29*/.value.getOrElse("")),format.raw/*11.49*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/(""""
        """),_display_(/*13.10*/fieldcontrolattr),format.raw/*13.26*/("""/>
        <span class="help-block"><small>"""),_display_(/*14.42*/help),format.raw/*14.46*/("""</small></span>
        <span class="help-block">"""),_display_(/*15.35*/{field.error.map { error => error.message }}),format.raw/*15.79*/("""</span>
    </div>
</div>"""))}
  }

  def render(field:Field,label:String,placeholder:String,help:String,divClass:String,fieldcontrolattr:String,fieldsizing:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing)

  def f:((Field,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing) => apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 29 00:29:01 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/text.scala.html
                  HASH: 4714afb6f9d6348a784714c68efdeb5fe9c65776
                  MATRIX: 782->1|1037->168|1065->170|1115->194|1142->213|1181->215|1221->225|1293->271|1318->276|1370->302|1398->310|1490->376|1521->387|1569->409|1582->414|1605->417|1656->441|1670->446|1696->451|1748->476|1762->481|1803->501|1854->525|1886->536|1924->547|1961->563|2032->607|2057->611|2134->661|2199->705
                  LINES: 26->1|30->2|32->4|32->4|32->4|32->4|32->4|33->5|33->5|34->6|34->6|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15
                  -- GENERATED --
              */
          