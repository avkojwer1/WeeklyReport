package cn.weeklyreport.service.base.impl;

import cn.weeklyreport.service.base.BaseService;

import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-17.
 */
public class BaseServiceImpl<T> implements BaseService<T> {
    @Override
    public int add(T entity) {
        return 0;
    }

    @Override
    public List<T> selectList(Map<String, Object> query) {
        return null;
    }

    @Override
    public T selectOne(Map<String, Object> query) {
        return null;
    }

    @Override
    public T selectById(String id) {
        return null;
    }

    @Override
    public int insert(T entity) {
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
    public int update(T entity) {
        return 0;
    }
}
