package cn.weeklyreport.service.impl;

import cn.weeklyreport.dao.impl.ExceptionLogDaoImpl;
import cn.weeklyreport.domain.ExceptionLog;
import cn.weeklyreport.service.ExceptionLogServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by greg.chen on 14-9-12.
 */
@Service
public class ExceptionLogServiceImpl implements ExceptionLogServcie{

    @Autowired
    private ExceptionLogDaoImpl<ExceptionLog> exceptionLogDao;

    @Override
    public List<ExceptionLog> queryList(String key, Object parameters){

        return exceptionLogDao.selectList(key,parameters);
    }

}
