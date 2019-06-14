package com.t9vg.api;

import com.github.pagehelper.PageInfo;
import com.t9vg.po.Index;
import com.t9vg.service.IndexService;
import com.t9vg.vo.GameResourceVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private IndexService service;

    @GetMapping(value = {"/",""})
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    @ResponseBody
    public PageInfo<Index> list(@RequestParam("page") Integer pageNum,
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
        PageInfo<Index> page = service.getPage(pageNum, pageSize, type, keyword);
        return page;
    }


}
