package com.laioin.services.common.modle;


import com.laioin.services.common.constant.ServiceCode;

import java.util.HashMap;
import java.util.Map;

/**
 * API 接口，返回 模型
 */
public class ResultMsg<T> {

    public static final Map<String, String> EMPTY_MAP = new HashMap<>(1);

    /**
     * 错误msg
     */
    public static ResultMsg ERR_MSG() {
        return new ResultMsg<>().setCode(ServiceCode.UPDATE_ERROR.code).
                setMessage(ServiceCode.UPDATE_ERROR.msg).setData(EMPTY_MAP);
    }

    /**
     * 成功 msg
     */
    public static ResultMsg SUCCESS_MSG() {
        return new ResultMsg().setCode(ServiceCode.SUCCESS.code).
                setMessage(ServiceCode.SUCCESS.msg).setData(EMPTY_MAP);
    }



    /**
     * code
     */
    private int code;
    /**
     * code 对应的说明
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public int getCode() {
        return code;
    }

    public ResultMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultMsg setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultMsg setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static void main(String args[]) {
        ResultMsg msg = new ResultMsg().setCode(1).setMessage("sss");
        System.out.println(msg);
    }
}
