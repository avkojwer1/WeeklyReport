package cn.weeklyreport.dao;

import java.util.HashMap;
import java.util.List;

/**
 * Created by greg.chen on 14-9-12.
 */
public interface BaseDao<T> {

    public int add(String key,T t);

    public List<T> selectList(String key, Object paramters);
}
