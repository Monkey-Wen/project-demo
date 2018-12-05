package com.monkeywen.mybatisbase.service;

import com.monkeywen.mybatisbase.dao.provider.BasesqlProvider;
import demo.Students;
import org.apache.ibatis.annotations.InsertProvider;

public interface BaseService {

    @InsertProvider(type = BasesqlProvider.class, method = "save")
    void save(Students students);
}
