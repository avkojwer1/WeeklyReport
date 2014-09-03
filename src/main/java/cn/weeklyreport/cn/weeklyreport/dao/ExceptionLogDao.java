package cn.weeklyreport.cn.weeklyreport.dao;


import cn.weeklyreport.model.ExceptionLog;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.orm.jpa.JpaTransactionManager;


/**
 * Created by greg.chen on 14-9-3.
 */
@Repository("exceptionLogDao")
public class ExceptionLogDao {

    @PersistenceContext
    private EntityManager entityManager;


    public long count(){
        CriteriaBuilder qb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> cq = qb.createQuery(Long.class);
        cq.select(qb.count(cq.from(ExceptionLog.class)));

        return entityManager.createQuery(cq).getSingleResult();
    }

}
