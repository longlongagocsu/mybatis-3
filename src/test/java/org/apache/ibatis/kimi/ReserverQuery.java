package org.apache.ibatis.kimi;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import net.bytebuddy.asm.Advice.This;

/**
* @author donglongjun
* @date 2018年12月18日 下午6:51:01
*/
public class ReserverQuery {
    
    public static void main(String[] args) throws IOException {
        String resource = "resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("id", 1);
        Reserver reserver1 = sqlSession.selectOne("org.apache.ibatis.kimi.ReserverMapper.selectById", parameter);
        ReserverMapper reserverMapper = sqlSession.getMapper(ReserverMapper.class);
        Reserver reserver2 = reserverMapper.selectById(1);
        System.out.println(reserver1);
        System.out.println(reserver2);
        sqlSession.close();
    }

}
