package cn.weeklyreport.controller;

import cn.weeklyreport.model.ExceptionLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by greg.chen on 14-9-5.
 */

@RestController
public class ExceptionLogController {


    @RequestMapping("/ExceptionLog")
    @ResponseBody
    public ExceptionLog getList(){

        return new ExceptionLog();
    }

}
