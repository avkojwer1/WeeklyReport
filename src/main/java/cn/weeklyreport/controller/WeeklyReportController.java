package cn.weeklyreport.controller;

import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.service.WeeklyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.List;

@RestController
public class WeeklyReportController {

    @Autowired
    protected WeeklyReportService weeklyReportService;

    @RequestMapping(value = "/report-list", method = RequestMethod.GET)
    @ResponseBody
    public  List<WeeklyReport> getWeeklyReportList(ModelMap model) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("requestLogFrom",String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        List<WeeklyReport> list = weeklyReportService.selectList(map);
        model.put("list", list);

        return list;
    }



    @RequestMapping(value = "/report-detail/{id}", method = RequestMethod.GET)
    public String WeeklyReportDetail(@PathVariable String id) {

        return "MAPIReprotDetail";
    }
}