package cn.weeklyreport.dao.impl;

import cn.weeklyreport.dao.BaseDao;
import cn.weeklyreport.dao.constants.SqlId;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-12.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired(required = true)
    protected SqlSession sqlSessionTemplate;

    //获取泛型T
    private Class<?> classt;

    private String sqlNamespace;

    public BaseDaoImpl(){
        Type t = this.getClass().getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            this.classt = ((Class<?>) p[0]);
        }
        this.sqlNamespace = this.classt.getName();
    }

    protected String getSqlName(String sqlName) {
        return sqlNamespace + SqlId.SQLNAME_SEPARATOR + sqlName;
    }

    @Override
    public int add(String key,T t) {
        sqlSessionTemplate.insert(key, t);
        return 0;
    }


    @Override
    public List<T> selectList(Map<String, Object> query){

        return sqlSessionTemplate.selectList(getSqlName(SqlId.SQL_SELECT), query);
    }

}
