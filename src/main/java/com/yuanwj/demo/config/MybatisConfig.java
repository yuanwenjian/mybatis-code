package com.yuanwj.demo.config;

import com.yuanwj.demo.mapper.PhoneImeiMapper;
import com.yuanwj.demo.model.PhoneImei;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisConfig {
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder;

    private static SqlSessionFactory sqlSessionFactory;

    public static void init() {
        String resource = "mybatis-config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            PhoneImeiMapper mapper = sqlSession.getMapper(PhoneImeiMapper.class);
            List<PhoneImei> phoneImeiList = mapper.selectAll();
            System.out.println(phoneImeiList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        init();
    }




}
