package utils.auth

import io.github.honeycombcheesecake.play.silhouette.api.actions.UnsecuredErrorHandler
import play.api.mvc.RequestHeader
import play.api.mvc.Results._
import utils.route.Calls

import scala.concurrent.Future

/**
 * Custom unsecured error handler.
 */
class CustomUnsecuredErrorHandler extends UnsecuredErrorHandler {

  /**
   * Called when a user is authenticated but not authorized.
   *
   * As defined by RFC 2616, the status code of the response should be 403 Forbidden.
   *
   * @param request The request header.
   * @return The result to send to the client.
   */
  override def onNotAuthorized(implicit request: RequestHeader) = {
    Future.successful(Redirect(Calls.home))
  }
}
