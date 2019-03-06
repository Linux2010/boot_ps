package com.t9vg.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
@Controller
public class IndexController {
    @GetMapping(value = {"/index/",""})
    public String index() {
        return "index";
    }

}
