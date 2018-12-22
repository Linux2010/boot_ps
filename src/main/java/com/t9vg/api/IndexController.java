package com.t9vg.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

}
