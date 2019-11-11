package com.gnw.Util;

public class Result {
    private Integer Code;//状态码
    private Boolean Falg;//标志位
    private Object Data;//返回数据
    private String Message;//返回消息

    public Result(Integer code, Boolean falg, Object data, String message) {
        Code = code;
        Falg = falg;
        Data = data;
        Message = message;
    }

    public Result() {
    }
    //失败返回
    public static Result error(){
        return new Result(200,false,null,"ERROR");
    }
    //失败返回
    public static Result error(Object data){
        return new Result(200,false,data,"ERROR");
    }
    //失败返回
    public static Result error(Object data,String message){
        return new Result(200,false,data,message);
    }
    //失败返回
    public static Result error(String message){
        return new Result(200,false,null,message);
    }
    //失败返回
    public static Result error(Integer code, Object data, String message){
        return new Result(code,false,data,message);
    }
    //成功返回
    public static Result success(){
        return new Result(400,true,null,"SUCCESS");
    }
    //成功返回
    public static Result success(Object data){
        return new Result(400,true,data,"SUCCESS");
    }
    //成功返回
    public static Result success(Integer code,Object data,String message){
        return new Result(code,true,data,message);
    }
    //成功返回
    public static Result success(Object data,String message){
        return new Result(400,true,data,message);
    }
    //自定义返回
    public static Result Coustom(Integer code,Boolean falg,Object data,String message){
        return new Result(code,falg,data,message);
    }
    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public Boolean getFalg() {
        return Falg;
    }

    public void setFalg(Boolean falg) {
        Falg = falg;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
