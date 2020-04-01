package com.soft1851.spring.web.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ke
 * @ClassName ResponseObject
 * @Description TOOD
 * @Date 2020/3/20
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
