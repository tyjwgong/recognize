package com.yun.game.recognize.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Description
 * @author: gongjw1@lenovo.com
 * @create: 2020-04-04 11:30
 * @since 1.0.0
 **/
@Data
@Builder
public class ResultBody implements Serializable {
    private boolean success;
    private ResultError error;
    private Object data;

    public static ResultBody success(Object data) {
        return ResultBody.builder().success(true).data(data).build();
    }

    public static ResultBody error(ResultError error) {
        return ResultBody.builder().success(false).error(error).build();
    }
}
