
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
object selectoption extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Field,String,Map[String, Boolean],Boolean,Boolean,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", optionMap: Map[String, Boolean], isDefaultSelect:Boolean=false, isMultiple: Boolean=false, help: String = "", divClass:String="col-sm-10", default:String="Please select a value"):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.223*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class=""""),_display_(/*5.18*/divClass),format.raw/*5.26*/("""">
        <select
                class="form-control"
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/(""""
                name=""""),_display_(/*9.24*/if(isMultiple)/*9.38*/ {_display_(_display_(/*9.41*/(field.name + "[]")))}/*9.62*/else/*9.67*/{_display_(_display_(/*9.69*/field/*9.74*/.name))}),format.raw/*9.80*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(isDefaultSelect)/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""<option class="blank" value="">"""),_display_(/*11.63*/default),format.raw/*11.70*/("""</option>""")))}),format.raw/*11.80*/("""
        """),_display_(/*12.10*/for((optionName, isSelected) <- optionMap) yield /*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
        """),format.raw/*13.9*/("""<option id=""""),_display_(/*13.22*/optionName),format.raw/*13.32*/("""" value=""""),_display_(/*13.42*/optionName),format.raw/*13.52*/("""" """),_display_(/*13.55*/if(isSelected)/*13.69*/ {_display_(Seq[Any](format.raw/*13.71*/("""selected""")))}),format.raw/*13.80*/(""">"""),_display_(/*13.82*/optionName),format.raw/*13.92*/("""</option>
        """)))}),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""</select>
        <span class="help-block">"""),_display_(/*16.35*/help),format.raw/*16.39*/("""</span>
        <span class="help-block">"""),_display_(/*17.35*/{field.error.map { error => error.message }}),format.raw/*17.79*/("""</span>
    </div>
</div>"""))}
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isDefaultSelect:Boolean,isMultiple:Boolean,help:String,divClass:String,default:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isDefaultSelect,isMultiple,help,divClass,default)

  def f:((Field,String,Map[String, Boolean],Boolean,Boolean,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isDefaultSelect,isMultiple,help,divClass,default) => apply(field,label,optionMap,isDefaultSelect,isMultiple,help,divClass,default)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jun 26 14:31:12 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/selectoption.scala.html
                  HASH: 1d95cbbfef1a42ffc5057b5cb856fc1c2bec53e2
                  MATRIX: 813->1|1123->222|1151->224|1201->248|1228->267|1267->269|1307->279|1384->330|1397->335|1420->338|1449->341|1474->346|1526->372|1554->380|1657->457|1670->462|1693->465|1744->490|1766->504|1796->507|1826->528|1838->533|1867->535|1880->540|1908->546|1946->557|1969->571|2009->573|2060->593|2098->604|2126->623|2166->625|2225->657|2253->664|2294->674|2331->684|2389->726|2429->728|2465->737|2505->750|2536->760|2573->770|2604->780|2634->783|2657->797|2697->799|2737->808|2766->810|2797->820|2847->839|2883->848|2954->892|2979->896|3048->938|3113->982
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|42->14|43->15|44->16|44->16|45->17|45->17
                  -- GENERATED --
              */
          