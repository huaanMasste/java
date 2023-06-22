/**
 * <p>
 * Title TestController
 * </p>
 * <p>
 * Description //TODO
 * </p>
 *
 * @Author xxx
 * @Date 2023-06-20 23:25
 * @Version 1.0
 */
package com.example.foodorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(path = "get")
    public String testGet(){
        return "get";
    }
}
