package cn.weeklyreport.dao.impl;

import cn.weeklyreport.dao.BaseDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by greg.chen on 14-9-12.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired(required = true)
    protected SqlSession sqlSessionTemplate;

    @Override
    public int add(String key,T t) {
        sqlSessionTemplate.insert(key, t);
        return 0;
    }

    @Override
    public List<T> selectList(String key, Object parameters){
        return sqlSessionTemplate.selectList(key, parameters);
    }

}
