package com.apitore.common;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class MYCODE {

  public String randomCODE(final int length) throws NoSuchAlgorithmException {
    byte token[] = new byte[length/2];
    StringBuffer buf = new StringBuffer();
    SecureRandom random = null;
    random = SecureRandom.getInstance("SHA1PRNG");
    random.nextBytes(token);
    for (int i = 0; i < token.length; i++) {
      buf.append(String.format("%02x", token[i]));
    }
    return buf.toString();
  }

}
