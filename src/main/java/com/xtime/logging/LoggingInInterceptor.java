/*
 * Copyright (c) 2014 Xtime, Inc.  All rights reserved.
 */

package com.xtime.logging;

import org.apache.cxf.interceptor.LoggingMessage;

/**
 *   @author jmittler
 */
public class LoggingInInterceptor extends org.apache.cxf.interceptor.LoggingInInterceptor{

    public LoggingInInterceptor()
  {
    super(-1);
  }
  @Override
  protected String formatLoggingMessage(LoggingMessage loggingMessage)
  {
    return  loggingMessage.getPayload() != null ? loggingMessage
        .getPayload().toString() : "";
  }
    
}
