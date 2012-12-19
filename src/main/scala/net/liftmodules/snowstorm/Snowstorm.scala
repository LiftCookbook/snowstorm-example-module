package net.liftmodules.snowstorm

import net.liftweb.http._

object Snowstorm {
	
 def init() : Unit = {

  ResourceServer.allow {
     case "snowstorm.js" :: Nil => true
  }

  def addSnow(s: LiftSession, r: Req) =
    S.putInHead(<script type="text/javascript" src="/classpath/snowstorm.js"></script>)

  LiftSession.onBeginServicing = addSnow _ ::  LiftSession.onBeginServicing

 }

}