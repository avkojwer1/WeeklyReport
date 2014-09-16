package cn.test.weeklyreport.service;

import cn.weeklyreport.domain.ExceptionLog;
import cn.weeklyreport.service.ExceptionLogService;
import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static Logger logger = Logger.getLogger(ExceptionLogServiceTest.class);

    @Autowired()
    protected ExceptionLogService exceptionLogService;

    @Test
    public void countTest(){
        List<ExceptionLog> exceptionLog = exceptionLogService.queryList(null);
        logger.info(exceptionLog);
        Assert.assertTrue(exceptionLog.size() > 0);
    }

}
