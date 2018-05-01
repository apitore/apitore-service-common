package com.apitore.common;


public class HtmlSanitizer {

  public String escapeHtml( String str ) {
    if(str==null) {
      return str;
    }
    str = str.replaceAll("&" , "&amp;" );
    str = str.replaceAll("<" , "&lt;"  );
    str = str.replaceAll(">" , "&gt;"  );
    str = str.replaceAll("\"", "&quot;");
    str = str.replaceAll("'" , "&#39;" );
    return str;
  }

  public String unescapeHtml( String str ) {
    if(str==null) {
      return str;
    }
    str = str.replaceAll("&#39;" , "'" );
    str = str.replaceAll("&quot;", "\"");
    str = str.replaceAll("&gt;"  , ">" );
    str = str.replaceAll("&lt;"  , "<" );
    str = str.replaceAll("&amp;" , "&" );
    return str;
  }

}
