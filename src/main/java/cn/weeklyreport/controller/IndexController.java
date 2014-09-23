package cn.weeklyreport.controller;

import cn.weeklyreport.service.WeeklyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;

@Controller
public class IndexController {

    @Autowired
    protected WeeklyReportService weeklyReportService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String weeklyReport(ModelMap model) {
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("requestLogFrom",String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));

        model.put("list", weeklyReportService.selectList(map));
        
		return "MAPIReprot";
	}

    @RequestMapping(value = "/MAPIReportDetail", method = RequestMethod.GET)
    public String mapiWeeklyReportDetail(ModelMap model) {

        return "MAPIReprotDetail";
    }
}