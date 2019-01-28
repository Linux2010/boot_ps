package com.t9vg.mapper;

import com.t9vg.po.GameResource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GameResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GameResource record);

    int insertSelective(GameResource record);

    GameResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GameResource record);

    int updateByPrimaryKey(GameResource record);

    List<GameResource> getPage(@Param("pageNumKey") int pageNum, @Param("pageSizeKey") int pageSize,
                               @Param("type")int type,
                               @Param("keyword")String keyword);

    Integer updateDownloadTimes(Integer id);
}