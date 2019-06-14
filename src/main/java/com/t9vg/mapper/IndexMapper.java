package com.t9vg.mapper;

import com.t9vg.po.Index;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface IndexMapper {


    List<Index> getPage(@Param("pageNumKey") int pageNum, @Param("pageSizeKey") int pageSize,
                        @Param("type")Integer type,
                        @Param("keyword")String keyword);
}
