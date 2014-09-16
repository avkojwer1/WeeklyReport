package cn.weeklyreport.service;

import cn.weeklyreport.domain.ExceptionLog;

import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-12.
 */
public interface ExceptionLogService {
        public List<ExceptionLog> queryList(Map<String, Object> query);

    }
