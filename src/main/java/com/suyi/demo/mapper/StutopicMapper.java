package com.suyi.demo.mapper;

import com.suyi.demo.model.Stutopic;
import com.suyi.demo.model.StutopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StutopicMapper {
    long countByExample(StutopicExample example);

    int deleteByExample(StutopicExample example);

    int deleteByPrimaryKey(String stutopicId);

    int insert(Stutopic record);

    int insertSelective(Stutopic record);

    List<Stutopic> selectByExample(StutopicExample example);

    Stutopic selectByPrimaryKey(String stutopicId);

    int updateByExampleSelective(@Param("record") Stutopic record, @Param("example") StutopicExample example);

    int updateByExample(@Param("record") Stutopic record, @Param("example") StutopicExample example);

    int updateByPrimaryKeySelective(Stutopic record);

    int updateByPrimaryKey(Stutopic record);

    int updateBatch(List<Stutopic> list);

    int batchInsert(@Param("list") List<Stutopic> list);
}