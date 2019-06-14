package com.t9vg.service;

import com.github.pagehelper.PageInfo;
import com.t9vg.po.Index;

public interface IndexService {
    PageInfo<Index> getPage(int pageNum, int pageSize, Integer type, String keyword);

}
