package cn.weeklyreport.controller;

import cn.weeklyreport.model.ExceptionLog;
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


    @RequestMapping("/ExceptionLog")
    @ResponseBody
    public List<ExceptionLog> getList(){
        List<ExceptionLog> list = new ArrayList<ExceptionLog>();
        ExceptionLog log = new ExceptionLog();
        log.setHostName("api.suryani.cn");
        list.add(log);
        return list;
    }

}
