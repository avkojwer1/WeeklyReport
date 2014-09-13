package cn.weeklyreport.controller;

import cn.weeklyreport.domain.ExceptionLog;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by greg.chen on 14-9-5.
 */

@RestController
public class ExceptionLogController {


    @Autowired(required = true)
    protected SqlSession sqlSessionTemplate;

    @RequestMapping("/ExceptionLog")
    @ResponseBody
    public List<ExceptionLog> getList(){
        List<ExceptionLog> list = new ArrayList<ExceptionLog>();
        ExceptionLog log = new ExceptionLog();
        log.setHostName("api.suryani.cn");
        list.add(log);

        ExceptionLog exceptionLog = sqlSessionTemplate.selectOne("selectOneExceptionLog");
        list.add(exceptionLog);
        return list;
    }

}
