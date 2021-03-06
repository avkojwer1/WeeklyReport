package cn.weeklyreport.controller;

import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.service.WeeklyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by greg.chen on 14-9-24.
 */
@Controller
public class IndexController {
    @Autowired
    protected WeeklyReportService weeklyReportService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String weeklyReport(ModelMap model) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("requestLogFrom",String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        List<WeeklyReport> list = weeklyReportService.selectList(map);
        model.put("list", list);

        return "MAPIReprot";
    }
}
