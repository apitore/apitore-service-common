package com.apitore.common;


public class ClientSetting {

  public static final int NUM_APIS = 6;
  public static final int NUM_APIS_PAGING = 20;

  public static final int NUM_TAG_UPPER = 10;
  public static final int NUM_PROJECT_UPPER = 5;
  public static final int NUM_PROJECT_API_UPPER = 20;

  public static final int IMAGE_SIZE=300;

  public static final long RATE_LIMIT_INTERVAL=60000;// 1 minites
  public static final int NUM_RATE_LIMIT=100;
  public static final int NUM_RATE_LIMIT_MONTH_FREE=1000;
  public static final String SDF_RATE_LIMIT_MONTH_FREE="yyyyMM";


  public static final String ERROR_SERVER_DOWN = "We're sorry, internal server error has occurred. Server may be down.";
  public static final String ERROR_INTERNAL = "We're sorry, internal server error has occurred";
  public static final String ERROR_NO_PAGE = "We're sorry, the requested URL was not found on this server.";
  public static final String ERROR_PAGING = "No APIs found.";
  public static final String ERROR_INHIBIT_ACCESS = "Access inhibit.";
  public static final String ERROR_INHIBIT_IMAGE_FORMAT = "Access inhibit. Only JPG/PNG is permitted.";
  public static final String ERROR_BAD_PARAMETER = "Bad GET/POST parameters.";
  public static final String ERROR_OUTOFSERVICE = "This API has been OUT OF SERVICE.";
  public static final String ERROR_CREDIT_SHORT = "Not enough credits.";
  public static final String ERROR_RATE_LIMIT = "Rate limit.";

}
