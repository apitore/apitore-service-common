package com.apitore.common;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Encoder {

  public String encode(String rawPassword) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest digest = MessageDigest.getInstance("MD5");
    byte[] bytes;
    bytes = digest.digest(rawPassword.getBytes("UTF-8"));
    String encoded = String.format("%032x", new BigInteger(1, bytes));
    return encoded;
  }

  public boolean match(String rawPassword, String encodedPassword) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    String tmp = encode(rawPassword);
    return tmp.equals(encodedPassword);
  }

}
