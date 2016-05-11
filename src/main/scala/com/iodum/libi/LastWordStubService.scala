package com.iodum.libi

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import org.slf4j.LoggerFactory

/**
  * @author shad862
  */
object LastWordStubService extends App {
  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val logger = LoggerFactory.getLogger(this.getClass.getName)
  logger.info("Initializing service ...")

  private val routes =
    logRequestResult("mock") {
      get {
        complete {
          logger.info("Request received")
          StatusCodes.OK -> "OK"
        }
      }
  }

  Http().bindAndHandle(routes , "localhost", 80)
}
