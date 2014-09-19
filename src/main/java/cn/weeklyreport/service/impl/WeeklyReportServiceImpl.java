package cn.weeklyreport.service.impl;

import cn.weeklyreport.dao.WeeklyReportDao;
import cn.weeklyreport.dao.base.BaseDao;
import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.service.WeeklyReportService;
import cn.weeklyreport.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by greg.chen on 14-9-19.
 */
public class WeeklyReportServiceImpl extends BaseServiceImpl<WeeklyReport> implements WeeklyReportService<WeeklyReport> {

    @Autowired
    private WeeklyReportDao weeklyReportDao;

    @Override
    protected BaseDao<WeeklyReport> getBaseDao() {
        return weeklyReportDao;
    }
}
