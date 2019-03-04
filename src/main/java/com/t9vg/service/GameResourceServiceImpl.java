package com.t9vg.service;

import com.github.pagehelper.PageInfo;
import com.t9vg.mapper.GameResourceMapper;
import com.t9vg.po.GameResource;
import com.t9vg.utils.BeanCopyUtils;
import com.t9vg.vo.GameResourceVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
@Service
public class GameResourceServiceImpl implements GameResourceService {

    @Autowired
    private GameResourceMapper mapper;

    @Override
    public Integer insertBach(List<GameResource> list) {
        int i = 0;
        for (GameResource r :
                list) {
            int insert = mapper.insert(r);
            if(insert ==1){
                i++;
            }
        }
        return i;
    }

    @Override
    public PageInfo<GameResourceVO> getPage(int pageNum, int pageSize,int type, String keyword) {
        List<GameResource> page = mapper.getPage(pageNum, pageSize ,type,keyword);
        PageInfo<GameResource> pageInfo = convert(page);
        return BeanCopyUtils.copyList(pageInfo,GameResourceVO.class);
    }

    @Override
    public Integer updateDownloadTimes(String id) {
        return mapper.updateDownloadTimes(id);
    }

    @Override
    public GameResource selectById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    private PageInfo<GameResource> convert(List<GameResource> list) {
        PageInfo<GameResource> info = new PageInfo(list);
        List<GameResource> _list = info.getList();
        info.setList(null);
        List<GameResource> __list = new ArrayList<>(10);
        PageInfo<GameResource> _info = new PageInfo();
        BeanUtils.copyProperties(info,_info);
        if(null !=_list && _list.size() != 0) {
            for(GameResource c : _list) {
                __list.add(c);
            }
            _info.setList(__list);
        }
        return _info;
    }
}
