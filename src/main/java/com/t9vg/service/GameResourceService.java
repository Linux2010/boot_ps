package com.t9vg.service;

import com.github.pagehelper.PageInfo;
import com.t9vg.po.GameResource;
import com.t9vg.vo.GameResourceVO;

import java.util.List;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
public interface GameResourceService {

    Integer insertBach(List<GameResource> list);

    PageInfo<GameResourceVO> getPage(int pageNum,int pageSize,int type,String keyword);

    Integer updateDownloadTimes(String id);

    GameResource selectById(String id);
}
