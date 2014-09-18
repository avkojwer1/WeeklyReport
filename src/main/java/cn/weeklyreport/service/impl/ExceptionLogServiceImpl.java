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
public class ExceptionLogServiceImpl implements ExceptionLogService<ExceptionLog> {

    @Autowired
    private ExceptionLogDaoImpl exceptionLogDao;

    @Override
    public int add(ExceptionLog entity) {
        return exceptionLogDao.add(entity);
    }

    @Override
    public List<ExceptionLog> selectList(Map<String, Object> query){

        return exceptionLogDao.selectList(null);
    }

    @Override
    public ExceptionLog selectOne(Map<String, Object> query) {
        return null;
    }

    @Override
    public ExceptionLog selectById(String id) {
        return null;
    }

    @Override
    public int insert(ExceptionLog entity) {
        return 0;
    }

    @Override
    public int delete(Map<String, Object> query) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int update(ExceptionLog entity) {
        return 0;
    }

}
