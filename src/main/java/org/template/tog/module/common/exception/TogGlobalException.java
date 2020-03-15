package org.template.tog.module.common.exception;

public class TogGlobalException extends RuntimeException {

  public TogGlobalException() {}

  public TogGlobalException(String message) {
    super(message);
  }

  public TogGlobalException(String message, Throwable cause) {
    super(message, cause);
  }

  public TogGlobalException(Throwable cause) {
    super(cause);
  }

  public TogGlobalException(
      String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
