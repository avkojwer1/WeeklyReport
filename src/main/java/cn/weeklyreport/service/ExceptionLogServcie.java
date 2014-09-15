package cn.weeklyreport.service;

import cn.weeklyreport.domain.ExceptionLog;

import java.util.List;

/**
 * Created by greg.chen on 14-9-12.
 */
public interface ExceptionLogServcie {
        public List<ExceptionLog> queryList(String key, Object parameters);

    }
