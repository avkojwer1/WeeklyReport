package cn.weeklyreport.dao.impl;

import cn.weeklyreport.dao.WeeklyReportDao;
import cn.weeklyreport.dao.base.impl.BaseDaoImpl;
import cn.weeklyreport.domain.WeeklyReport;
import org.springframework.stereotype.Repository;

/**
 * Created by greg.chen on 14-9-19.
 */
@Repository
public class WeeklyReportDaoImpl extends BaseDaoImpl<WeeklyReport> implements WeeklyReportDao<WeeklyReport> {
}
