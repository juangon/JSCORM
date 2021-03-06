package com.arcusys.learn.oauth

import com.escalatesoft.subcut.inject.BindingModule
import com.arcusys.learn.achievements.BaseWebService
import com.arcusys.learn.ioc.Configuration
import javax.servlet.http.HttpServletResponse
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.ext.dynamicreg.server.response.OAuthServerRegistrationResponse
import org.apache.oltu.oauth2.ext.dynamicreg.common.OAuthRegistration
import com.arcusys.learn.tincan.model.{LrsScopeConverters, LrsScope}
import LrsScope.LrsScope
import LrsScopeConverters._
import org.apache.oltu.oauth2.common.OAuth
import org.apache.oltu.oauth2.common.message.OAuthResponse
import org.apache.commons.lang.NotImplementedException

//
// Created by iliya.tryapitsin on 11.02.14.
//
class RegistrationController(configuration: BindingModule) extends BaseWebService(configuration) with SignatureValidator {
  def this() = this(Configuration)

  post("/") {
    //requireAdmin()

    try {

      val requestType = parameter(OAuthRegistration.Request.TYPE).required
      requestType match {
        case OAuthRegistration.Type.PUSH => addToStore()
        case OAuthRegistration.Type.PULL => removeFromStore()
      }

    } catch {
      case e: OAuthProblemException => {
        val res = OAuthResponse
          .errorResponse(HttpServletResponse.SC_BAD_REQUEST)
          .setError(e.getError())
          .setErrorDescription(e.getDescription())
          .setErrorUri(e.getUri())
          .buildJSONMessage()

        response.setStatus(res.getResponseStatus())
        res.getBody()
      }
    }
  }

  after() {
    response.setContentType(OAuth.ContentType.JSON)
  }

  private def addToStore(): String = {
    val clientName = parameter(OAuthRegistration.Request.CLIENT_NAME).required
    val redirectUrl = parameter(OAuthRegistration.Request.REDIRECT_URL).option
    val clientIcon = parameter(OAuthRegistration.Request.CLIENT_ICON).option
    val clientDescription = parameter(OAuthRegistration.Request.CLIENT_DESCRIPTION).option
    val clientUrl = parameter(OAuthRegistration.Request.CLIENT_URL).option
    val lrsScope: LrsScope = parameter(LrsScope.OAuth.NAME).required

    val clientApi = clientApiStoreManager.registration(
      clientName,
      clientDescription,
      clientUrl,
      redirectUrl,
      lrsScope,
      clientIcon)

    val res = OAuthServerRegistrationResponse
      .status(HttpServletResponse.SC_OK)
      /*.setClientId(clientApi.clientId.toString)
      .setClientSecret(clientApi.clientSecret)*/
      .setParam("clientId", clientApi.clientId.toString)
      .setParam("clientSecret", clientApi.clientSecret)
      .setParam("clientName", clientName)
      //.setIssuedAt(clientApi.issuedAt)
      //.setExpiresIn(clientApi.expiredIn)
      .buildJSONMessage()

    response.setStatus(res.getResponseStatus())
    res.getBody()
  }
  
  private def removeFromStore(): String = {
    throw new NotImplementedException()
  }
}
