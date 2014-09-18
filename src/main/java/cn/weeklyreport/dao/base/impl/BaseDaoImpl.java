package cn.weeklyreport.dao.base.impl;

import cn.weeklyreport.dao.base.BaseDao;
import cn.weeklyreport.dao.constants.SqlId;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
    public int add(T entity) {
        return sqlSessionTemplate.insert(getSqlName(SqlId.SQL_INSERT), entity);
    }

    @Override
    public List<T> selectList(Map<String, Object> query){
        return sqlSessionTemplate.selectList(getSqlName(SqlId.SQL_SELECT), query);
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
