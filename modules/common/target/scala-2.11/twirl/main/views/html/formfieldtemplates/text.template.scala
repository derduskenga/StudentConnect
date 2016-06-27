
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
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "",divClass:String="col-sm-8",fieldcontrolattr: String ="", fieldsizing:String=""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.168*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class=""""),_display_(/*5.18*/divClass),format.raw/*5.26*/("""">
        <input type="text"
               class="form-control """),_display_(/*7.37*/fieldsizing),format.raw/*7.48*/(""""
               id=""""),_display_(/*8.21*/field/*8.26*/.id),format.raw/*8.29*/(""""
               name=""""),_display_(/*9.23*/field/*9.28*/.name),format.raw/*9.33*/(""""
               value=""""),_display_(/*10.24*/field/*10.29*/.value.getOrElse("")),format.raw/*10.49*/(""""
        placeholder=""""),_display_(/*11.23*/placeholder),format.raw/*11.34*/(""""
        """),_display_(/*12.10*/fieldcontrolattr),format.raw/*12.26*/("""/>
        <span class="help-block"><small>"""),_display_(/*13.42*/help),format.raw/*13.46*/("""</small></span>
        <span class="help-block">"""),_display_(/*14.35*/{field.error.map { error => error.message }}),format.raw/*14.79*/("""</span>
    </div>
</div>"""))}
  }

  def render(field:Field,label:String,placeholder:String,help:String,divClass:String,fieldcontrolattr:String,fieldsizing:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing)

  def f:((Field,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing) => apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 26 14:31:12 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/text.scala.html
                  HASH: 6ac1188662de2bf6eab5206d8e2d36a5c6cb8cc6
                  MATRIX: 782->1|1037->167|1065->169|1115->193|1142->212|1181->214|1221->224|1293->270|1318->275|1370->301|1398->309|1490->375|1521->386|1569->408|1582->413|1605->416|1655->440|1668->445|1693->450|1745->475|1759->480|1800->500|1851->524|1883->535|1921->546|1958->562|2029->606|2054->610|2131->660|2196->704
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|33->5|33->5|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14
                  -- GENERATED --
              */
          