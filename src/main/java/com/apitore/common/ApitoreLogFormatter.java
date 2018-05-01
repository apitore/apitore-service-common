package com.apitore.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;


/**
 * @author Keigo Hattori
 */
public class ApitoreLogFormatter {

  public static void accessLog(final Logger LOG, HttpServletRequest request) {
    String xForwardedFor = request.getHeader("X-Forwarded-For");
    if (xForwardedFor==null) {
      xForwardedFor = request.getRemoteAddr();
    }
    String referer = request.getHeader("Referer");
    if (referer==null) {
      referer = "null";
    }
    LOG.info(String.format("RequestURI:%s, X-Forwarded-For:%s, Referer:%s", request.getRequestURI(), xForwardedFor, referer));
  }

  public static void accessInfoLog(final Logger LOG, HttpServletRequest request, String message) {
    LOG.info(String.format("RequestURI:%s, Message:%s", request.getRequestURI(), message));
  }

}
