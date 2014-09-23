package cn.test.weeklyreport.service;

import cn.test.weeklyreport.service.base.BaseTest;
import cn.weeklyreport.dao.utils.UUIDUtils;
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

public class ExceptionLogServiceTest extends BaseTest {

    private static Logger logger = Logger.getLogger(ExceptionLogServiceTest.class);

    @Autowired
    protected ExceptionLogService exceptionLogService;

    @Test
    public void selectTest(){
        List<ExceptionLog> exceptionLog = exceptionLogService.selectList(null);
        logger.info(exceptionLog);
        Assert.assertTrue(exceptionLog.size() > 0);
    }

    @Test
    public void addTest(){
        ExceptionLog exceptionLog = new ExceptionLog();
        exceptionLog.setExceptionLogId(UUIDUtils.create());
        exceptionLog.setHostName("test");
        exceptionLog.setModuleName("test");
        logger.info(exceptionLog);
        int result = exceptionLogService.insert(exceptionLog);

        Assert.assertTrue(result > 0);
    }

}
