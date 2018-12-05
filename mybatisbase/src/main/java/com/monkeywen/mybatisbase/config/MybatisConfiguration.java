package com.monkeywen.mybatisbase.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * mybatis配置
 * @author wuzz
 * @Date   2018年8月31日
 *
 */
@Configuration
public class MybatisConfiguration {

	@Autowired
	private DataSource dataSource;

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.put("helperDialect", "mysql");
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		pageInterceptor.setProperties(properties);
		sqlSessionFactoryBean.setPlugins(new Interceptor[] { pageInterceptor });
		return sqlSessionFactoryBean.getObject();
	}

}
