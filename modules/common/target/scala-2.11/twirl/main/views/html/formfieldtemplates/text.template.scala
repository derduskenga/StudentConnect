
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
object text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Field,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = "",divClass:String="col-sm-8",
fieldcontrolattr: String ="", fieldsizing:String="", input_class:String=""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.76*/("""

"""),format.raw/*4.1*/("""<div class="form-group """),_display_(/*4.25*/if(field.hasErrors)/*4.44*/ {_display_(Seq[Any](format.raw/*4.46*/("""has-error""")))}),format.raw/*4.56*/("""">
    <label class="col-sm-3 control-label">"""),_display_(/*5.44*/label),format.raw/*5.49*/("""</label>
    <div class=""""),_display_(/*6.18*/divClass),format.raw/*6.26*/("""">
        <input type="text"
               class="form-control """),_display_(/*8.37*/fieldsizing),format.raw/*8.48*/(""" """),_display_(/*8.50*/input_class),format.raw/*8.61*/(""""
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

  def render(field:Field,label:String,placeholder:String,help:String,divClass:String,fieldcontrolattr:String,fieldsizing:String,input_class:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing,input_class)

  def f:((Field,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing,input_class) => apply(field,label,placeholder,help,divClass,fieldcontrolattr,fieldsizing,input_class)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 10 00:46:53 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/text.scala.html
                  HASH: d421c27705302ab0fd73a3b3f95ae169220c7e89
                  MATRIX: 789->1|1067->191|1095->193|1145->217|1172->236|1211->238|1251->248|1323->294|1348->299|1400->325|1428->333|1520->399|1551->410|1579->412|1610->423|1658->445|1671->450|1694->453|1745->477|1759->482|1785->487|1837->512|1851->517|1892->537|1943->561|1975->572|2013->583|2050->599|2121->643|2146->647|2223->697|2288->741
                  LINES: 26->1|30->2|32->4|32->4|32->4|32->4|32->4|33->5|33->5|34->6|34->6|36->8|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15
                  -- GENERATED --
              */
          