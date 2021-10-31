package com.company.exception;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName NotEnoughException
 * @company 公司
 * @Description 异常类(自定义的运行时异常)
 * @createTime 2021年10月28日 16:34:34
 */
public class NotEnoughException extends RuntimeException{

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
