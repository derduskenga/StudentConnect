
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
object checkbox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Field,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", help:String = "", divClass: String = "", label2: String="",value: String="", checked: String=""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.141*/("""

"""),format.raw/*3.1*/("""<div class="form-group """),_display_(/*3.25*/if(field.hasErrors)/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""has-error""")))}),format.raw/*3.56*/("""">
    <label class="col-sm-3 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class=""""),_display_(/*5.18*/divClass),format.raw/*5.26*/("""">
            <input
                    type="checkbox"
                    name=""""),_display_(/*8.28*/field/*8.33*/.name),format.raw/*8.38*/(""""
                    value=""""),_display_(/*9.29*/value),format.raw/*9.34*/(""""
                    id=""""),_display_(/*10.26*/field/*10.31*/.id),format.raw/*10.34*/(""""
                    """),_display_(/*11.22*/checked),format.raw/*11.29*/(""">
        """),_display_(/*12.10*/label2),format.raw/*12.16*/("""
        """),format.raw/*13.9*/("""<span class="help-block">"""),_display_(/*13.35*/help),format.raw/*13.39*/("""</span>
        <span class="help-block">"""),_display_(/*14.35*/{field.error.map { error => error.message }}),format.raw/*14.79*/("""</span>
    </div>
</div>"""))}
  }

  def render(field:Field,label:String,help:String,divClass:String,label2:String,value:String,checked:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,help,divClass,label2,value,checked)

  def f:((Field,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,help,divClass,label2,value,checked) => apply(field,label,help,divClass,label2,value,checked)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jul 23 16:35:23 EAT 2016
                  SOURCE: /home/derdus/studentconnect/modules/common/app/views/formfieldtemplates/checkbox.scala.html
                  HASH: cb616c13640012f00f4f005fb3f48ab203a6f558
                  MATRIX: 786->1|1014->140|1042->142|1092->166|1119->185|1158->187|1198->197|1275->248|1288->253|1311->256|1340->259|1365->264|1417->290|1445->298|1556->383|1569->388|1594->393|1650->423|1675->428|1729->455|1743->460|1767->463|1817->486|1845->493|1883->504|1910->510|1946->519|1999->545|2024->549|2093->591|2158->635
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|33->5|33->5|36->8|36->8|36->8|37->9|37->9|38->10|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|41->13|42->14|42->14
                  -- GENERATED --
              */
          