package cn.test.weeklyreport;

import cn.weeklyreport.cn.weeklyreport.dao.ExceptionLogDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * Created by greg.chen on 14-9-3.
 */
public class ExceptionLogDaoTest {

    private ApplicationContext applicationContext;

    @Test
    public void countTest(){
        applicationContext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml");
        ExceptionLogDao dao = (ExceptionLogDao) applicationContext.getBean("exceptionLogDao");
        Long count = dao.count();
        System.out.println(count);
    }

}
