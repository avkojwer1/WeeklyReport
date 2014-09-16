package cn.weeklyreport.service.impl;

import cn.weeklyreport.dao.impl.ExceptionLogDaoImpl;
import cn.weeklyreport.domain.ExceptionLog;
import cn.weeklyreport.service.ExceptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-12.
 */
@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {

    @Autowired
    private ExceptionLogDaoImpl exceptionLogDao;

    @Override
    public List<ExceptionLog> queryList(Map<String, Object> query){

        return exceptionLogDao.selectList(null);
    }

}
