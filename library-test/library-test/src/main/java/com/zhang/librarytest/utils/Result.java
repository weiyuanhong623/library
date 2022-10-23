package com.zhang.librarytest.utils;

public class Result {
    private String message;
    private Object data;
    private String success;
    private Integer code;

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", success='" + success + '\'' +
                ", code=" + code +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("操作成功!");
        result.setSuccess("true");
        result.setData(null);
        return result;
    }


    public static Result success(String message){
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        result.setSuccess("true");
        result.setData(null);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setSuccess("true");
        result.setData(data);
        return result;
    }

    public static Result success(String message, Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        result.setSuccess("true");
        result.setData(object);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setCode(500);
        result.setMessage("操作失败!");
        result.setSuccess("true");
        result.setData(null);
        return result;
    }
    public static Result error(String message){
        Result result = new Result();
        result.setCode(500);
        result.setMessage(message);
        result.setSuccess("true");
        result.setData(null);
        return result;
    }
    public static Result error(String message, Object o){
        Result result = new Result();
        result.setCode(500);
        result.setMessage(message);
        result.setSuccess("true");
        result.setData(o);
        return result;
    }


    public static Result error(Object data){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setSuccess("true");
        result.setData(data);
        return result;
    }
}
