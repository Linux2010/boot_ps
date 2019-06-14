package com.t9vg.service;

import com.github.pagehelper.PageInfo;
import com.t9vg.mapper.IndexMapper;
import com.t9vg.po.GameResource;
import com.t9vg.po.Index;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper mapper;


    @Override
    public PageInfo<Index> getPage(int pageNum, int pageSize, Integer type, String keyword) {
        return convert( mapper.getPage(pageNum,pageSize,type,keyword) );
    }

    private PageInfo<Index> convert(List<Index> list) {
        PageInfo<Index> info = new PageInfo(list);
        List<Index> _list = info.getList();
        info.setList(null);
        List<Index> __list = new ArrayList<>(10);
        PageInfo<Index> _info = new PageInfo();
        BeanUtils.copyProperties(info,_info);
        if(null !=_list && _list.size() != 0) {
            for(Index c : _list) {
                __list.add(c);
            }
            _info.setList(__list);
        }
        return _info;
    }

}
