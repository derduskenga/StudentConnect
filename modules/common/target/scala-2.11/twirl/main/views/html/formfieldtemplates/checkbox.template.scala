
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
object checkbox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Map[String, Boolean],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", checkboxMap: Map[String, Boolean], help:String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.97*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-9" id=""""),_display_(/*5.32*/field/*5.37*/.id),format.raw/*5.40*/("""">
        """),_display_(/*6.10*/for((checkboxName, isChecked) <- checkboxMap) yield /*6.55*/ {_display_(Seq[Any](format.raw/*6.57*/("""
        """),format.raw/*7.9*/("""<label class="checkbox-inline">
            <input
                    type="checkbox"
                    name=""""),_display_(/*10.28*/(field.name)),format.raw/*10.40*/(""""
            id=""""),_display_(/*11.18*/(field.name)),format.raw/*11.30*/(""""
            value=""""),_display_(/*12.21*/checkboxName),format.raw/*12.33*/(""""
            """),_display_(/*13.14*/if(isChecked)/*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""checked""")))}),format.raw/*13.37*/(""" """),format.raw/*13.38*/(""">
            """),_display_(/*14.14*/checkboxName),format.raw/*14.26*/("""
        """),format.raw/*15.9*/("""</label>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<span class="help-block">"""),_display_(/*17.35*/help),format.raw/*17.39*/("""</span>
        <span class="help-block">"""),_display_(/*18.35*/{field.error.map { error => error.message }}),format.raw/*18.79*/("""</span>
    </div>
</div>"""))}
  }

  def render(field:Field,label:String,checkboxMap:Map[String, Boolean],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,checkboxMap,help)

  def f:((Field,String,Map[String, Boolean],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,checkboxMap,help) => apply(field,label,checkboxMap,help)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 31 00:24:51 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/checkbox.scala.html
                  HASH: 571e6ca02b1a1a8f5b8983a2dde5f45712bda485
                  MATRIX: 779->1|962->96|990->98|1040->122|1067->141|1106->143|1146->153|1223->204|1236->209|1259->212|1288->215|1313->220|1379->260|1392->265|1415->268|1453->280|1513->325|1552->327|1587->336|1728->450|1761->462|1807->481|1840->493|1889->515|1922->527|1964->542|1986->555|2026->557|2065->565|2094->566|2136->581|2169->593|2205->602|2254->620|2290->629|2343->655|2368->659|2437->701|2502->745
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|41->13|41->13|42->14|42->14|43->15|44->16|45->17|45->17|45->17|46->18|46->18
                  -- GENERATED --
              */
          