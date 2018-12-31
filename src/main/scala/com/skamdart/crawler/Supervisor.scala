package com.skamdart.crawler

import akka.actor.{Actor, ActorLogging, ActorSystem}

class Supervisor(actorSystem: ActorSystem) extends Actor with ActorLogging {

  override def receive: Receive = {
    case StartCrawler(url) => {
      actorSystem.log.info("Starting crawler with {}", url)
    }
  }
}
