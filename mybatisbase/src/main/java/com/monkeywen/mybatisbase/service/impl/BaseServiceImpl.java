package com.monkeywen.mybatisbase.service.impl;

import com.monkeywen.mybatisbase.dao.BaseDao;
import com.monkeywen.mybatisbase.service.BaseService;
import demo.Students;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    private static final Logger LOGGER = LogManager.getLogger(BaseServiceImpl.class);

    @Autowired
    private BaseDao baseDao;

    @Override
    public void save(Students students) {
//        Integer i = 1/0;
        LOGGER.info("学生新增开始");
        baseDao.save(students);
    }
}
