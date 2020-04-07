package com.yun.game.recognize.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Description
 * @author: gongjw1@lenovo.com
 * @create: 2020-04-04 11:31
 * @since 1.0.0
 **/
@Data
public class ResultError implements Serializable {
    private Integer code;
    private String message;
}
