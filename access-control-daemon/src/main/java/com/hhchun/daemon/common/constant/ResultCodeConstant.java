package com.hhchun.daemon.common.constant;


public enum ResultCodeConstant {
    SUCCESS(0, "成功"),
    ERROR(500, "系统错误"),
    ACCESS_DENIED(403, "访问被拒绝"),
    AUTHENTICATION_ERROR(401, "身份认证错误"),
    ARGUMENT_ERROR(400, "参数错误"),
    ILLEGAL_CONDITION(410, "非法条件");

    ResultCodeConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Integer code;
    private String message;
}
