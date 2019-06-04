package com.t9vg.api;

import com.github.pagehelper.PageInfo;
import com.t9vg.po.GameResource;
import com.t9vg.service.GameResourceService;
import com.t9vg.vo.GameResourceVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/game")
public class GameResourceController {
    private static final Logger log = LoggerFactory.getLogger(GameResourceController.class);

    @Autowired
    private GameResourceService service;

    @GetMapping("/ps4")
    public String ps4() {
        return "ps4";
    }


    @GetMapping("/psv")
    public String psv() {
        return "psv";
    }


    @GetMapping("/ns")
    public String ns() {
        return "ns";
    }

    @GetMapping("/list")
    @ResponseBody
    public PageInfo<GameResourceVO> list(@RequestParam("page") Integer pageNum,
                                         @RequestParam("rows") Integer pageSize,
                                         Integer type,
                                         String keyword,
                                         HttpServletRequest request
    ) {
        if (pageSize > 15) {
            return null;
        }

        log.info("list,keyword:[{}],remoteHost[{}]",keyword, request.getRemoteAddr());
        if (!StringUtils.isEmpty(keyword)) {
            try {
                keyword = URLDecoder.decode(keyword, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        PageInfo<GameResourceVO> page = service.getPage(pageNum, pageSize, type, keyword);
        return page;
    }

    @PostMapping("/download")
    @ResponseBody
    public String updateDownloadTimes(String id, HttpServletRequest request) {
        log.info("download id:[{}]----remoteHost[{}]", id,request.getRemoteAddr());
        service.updateDownloadTimes(id);
        GameResource gameResource = service.selectById(id);
        return gameResource.getDownloadLink();
    }


    @PostMapping("/insertBatch")
    public void insertBatch(@RequestBody List<GameResource> list) {
        int i = 0;
        for (GameResource g : list
        ) {
            System.out.println(g.toString());
            i++;
        }
        System.out.println("输入：" + i);
        Integer result = service.insertBach(list);
        System.out.println("收录：" + result);
    }
}
