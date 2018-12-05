package com.monkeywen.mybatisbase.dao;

import com.monkeywen.mybatisbase.dao.provider.BasesqlProvider;
import demo.Students;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseDao {

    @InsertProvider(type = BasesqlProvider.class, method = "save")
    void save(Students students);
}
