package org.template.tog.module.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"code", "status", "data", "pagination", "error"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

  private int status;
  private String errorMessage;
  private T data;

}
