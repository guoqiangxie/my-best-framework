package com.acorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: IndexController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index() {
        System.out.println("hello");
        return "index/first";
    }
}
