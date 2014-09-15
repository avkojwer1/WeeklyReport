package cn.test.weeklyreport.service;

import cn.weeklyreport.domain.ExceptionLog;
import cn.weeklyreport.service.ExceptionLogServcie;
import junit.framework.Assert;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by greg.chen on 14-9-3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
@Transactional
public class ExceptionLogServiceTest {

    @Autowired()
    protected ExceptionLogServcie exceptionLogServcie;

    @Test
    public void countTest(){
        List<ExceptionLog> exceptionLog = exceptionLogServcie.queryList("selectOneExceptionLog", null);
        Assert.assertTrue(exceptionLog.size() > 0);
    }

}
