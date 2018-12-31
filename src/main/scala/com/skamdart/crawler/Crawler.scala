package com.skamdart.crawler

import akka.actor.{ActorSystem, PoisonPill, Props}
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

object Crawler extends App {
  val system = ActorSystem()
  val supervisor = system.actorOf(Props(new Supervisor(system)))
  val baseUrl = "https://google.com"
  supervisor ! StartCrawler(baseUrl)

  Await.result(system.whenTerminated, 30 minutes)

  supervisor ! PoisonPill
  system.terminate
}
