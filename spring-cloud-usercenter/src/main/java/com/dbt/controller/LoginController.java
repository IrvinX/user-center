package com.dbt.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author irvin
 * @date Create in 下午12:19 2017/8/6
 * @description
 */
@Api(value = "product", description = "商品管理", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class LoginController {

    @ApiOperation(value = "获得商品信息", notes = "获取商品信息(用于数据同步)")
    @GetMapping("/login")
    public String test(){
        return "hello";
    }

}
