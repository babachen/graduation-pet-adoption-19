package com.example.common;
import java.io.Serializable;
/** 统一返回（展示用） */
public class Result<T> implements Serializable {
  private String code; private String msg; private T data;
  public static <T> Result<T> success(T data){ Result<T> r=new Result<>(); r.code="200"; r.msg="ok"; r.data=data; return r; }
  public String getCode(){return code;} public String getMsg(){return msg;} public T getData(){return data;}
}
