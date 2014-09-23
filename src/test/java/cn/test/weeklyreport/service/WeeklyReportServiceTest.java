package cn.test.weeklyreport.service;

import cn.test.weeklyreport.service.base.BaseTest;
import cn.weeklyreport.dao.utils.UUIDUtils;
import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.service.WeeklyReportService;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
/**
 * Created by greg.chen on 14-9-19.
 */
public class WeeklyReportServiceTest extends BaseTest {

    @Autowired
    protected WeeklyReportService weeklyReportService;

    @Test
    public void addTest(){
        WeeklyReport weeklyReport = new WeeklyReport();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String currentDate = dateFormat.format(cal.getTime());
        weeklyReport.setCreateDate(currentDate);
        weeklyReport.setDescription("test");
        weeklyReport.setExceptionLogFrom("2014/09/01");
        weeklyReport.setExceptionLogTo("2014/09/06");
        weeklyReport.setRequestLogFrom("2014/09/01");
        weeklyReport.setRequestLogTo("2014/09/06");
        weeklyReport.setId(UUIDUtils.create());
        weeklyReport.setType("MAPI");

        weeklyReportService.insert(weeklyReport);
    }

    @Test
    public void selectListTest(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", "MAPI");
        List<WeeklyReport> list = weeklyReportService.selectList(map);

        Assert.assertTrue(list.size() > 0);
    }
}
