package com.laioin.gateway.common.base;


import com.laioin.services.common.constant.ServiceCode;
import com.laioin.services.common.modle.ResultMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 基础controller
 */
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 处理 服务内的错误
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultMsg handlerEx(Exception e) {
        ResultMsg msg = new ResultMsg().setCode(ServiceCode.SERVER_ERROR.code).
                setMessage(ServiceCode.SERVER_ERROR.msg).setData(new Object());
        return msg;
    }

    /**
     * 构建成功 模型，返回数据
     *
     * @param data 返回的数据
     * @param <T>
     * @return
     */
    protected <T> ResultMsg<T> buildSuccess(T data) {
        ResultMsg msg = ResultMsg.SUCCESS_MSG().setData(data);
        return msg;
    }

    /**
     * 构建 错误模型，并且返回
     *
     * @param serviceCode 错误描述
     * @return
     */
    protected ResultMsg buildError(ServiceCode serviceCode) {
        ResultMsg msg = new ResultMsg().setCode(serviceCode.code).
                setMessage(serviceCode.msg).setData(ResultMsg.EMPTY_MAP);
        return msg;
    }

    /**
     * 更新错误，替换,message 里的展位符号
     *
     * @param serviceCode
     * @param obs         占位需要的参数
     * @return
     */
    protected ResultMsg buildError(ServiceCode serviceCode, Object... obs) {
        String msgStr = String.format(serviceCode.msg, obs);
        ResultMsg msg = new ResultMsg().setCode(serviceCode.code).
                setMessage(msgStr).setData(ResultMsg.EMPTY_MAP);
        return msg;
    }

    /**
     * 操作数据 boolean 是否成功失败
     *
     * @param flag
     * @return
     */
    protected ResultMsg buildSuccess(boolean flag) {
        if (flag) {
            return ResultMsg.SUCCESS_MSG();
        } else {
            return ResultMsg.ERR_MSG();
        }
    }


}
