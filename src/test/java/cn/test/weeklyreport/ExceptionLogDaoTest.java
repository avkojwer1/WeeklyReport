package cn.test.weeklyreport;

import cn.weeklyreport.domain.ExceptionLog;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by greg.chen on 14-9-3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
@Transactional
public class ExceptionLogDaoTest {

    @Autowired(required = true)
    protected SqlSession sqlSessionTemplate;

    @Test
    public void countTest(){
        ExceptionLog exceptionLog = sqlSessionTemplate.selectOne("selectOneExceptionLog");

    }

}
