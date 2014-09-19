package cn.weeklyreport.service.impl;

import cn.weeklyreport.dao.ExceptionLogDao;
import cn.weeklyreport.dao.base.BaseDao;
import cn.weeklyreport.dao.impl.ExceptionLogDaoImpl;
import cn.weeklyreport.domain.ExceptionLog;
import cn.weeklyreport.service.ExceptionLogService;
import cn.weeklyreport.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-12.
 */
@Service
public class ExceptionLogServiceImpl extends BaseServiceImpl<ExceptionLog> implements ExceptionLogService<ExceptionLog> {

    @Autowired
    private ExceptionLogDao exceptionLogDao;

    @Override
    protected BaseDao<ExceptionLog> getBaseDao() {
        return exceptionLogDao;
    }

}
