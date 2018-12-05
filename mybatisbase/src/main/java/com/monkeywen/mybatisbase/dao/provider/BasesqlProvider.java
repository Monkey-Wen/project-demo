package com.monkeywen.mybatisbase.dao.provider;

import demo.Students;
import org.apache.ibatis.jdbc.SQL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasesqlProvider {

    private static final Logger LOGGER = LogManager.getLogger(BasesqlProvider.class);

    private String table = "students";
    private String[] allColumns = new String[] { "id , name, code" };

    public String save(Students students){
        SQL sql = new SQL().INSERT_INTO(table);
        sql.VALUES("name","'" + students.getName() + "'");
        sql.VALUES("code","'" + students.getCode() + "'");
        LOGGER.info(sql.toString());
        return sql.toString();
    }

}
