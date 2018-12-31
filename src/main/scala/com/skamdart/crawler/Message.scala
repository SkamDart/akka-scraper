package com.skamdart.crawler

class Message

case class StartCrawler(url: String) extends Message
case class EndCrawler() extends Message
case class CreateIndex(url: String) extends Message
case class StartScrape(url: String) extends Message
case class ScrapeSuccess(url: String) extends Message
case class ScrapeFailure(url: String, reason: String) extends Message
