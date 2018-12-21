package com.t9vg.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0.0
 * @项目名称: boot_ps
 * @类名称: com.t9vg.api
 * @类描述:
 * @功能描述:
 * @创建人: tianfs1@yusys.com.cn
 * @创建时间: 2018/12/21
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
