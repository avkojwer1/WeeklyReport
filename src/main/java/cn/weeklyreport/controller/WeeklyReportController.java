package cn.weeklyreport.controller;

import cn.weeklyreport.dao.utils.UUIDUtils;
import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.exception.InvalidRequestIdException;
import cn.weeklyreport.exception.ResourceNotFoundException;
import cn.weeklyreport.service.WeeklyReportService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @RequestMapping(value = "/report/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<WeeklyReport> add(@RequestBody WeeklyReport weeklyReport){

        WeeklyReport newWeeklyReport = new WeeklyReport();
        BeanUtils.copyProperties(weeklyReport, newWeeklyReport);

        String newUUid = UUIDUtils.create();
        weeklyReport.setId(newUUid);
        weeklyReport.setType("MAPI");

        weeklyReportService.insert(weeklyReport);

        newWeeklyReport = (WeeklyReport) weeklyReportService.selectById(newUUid);

        return new ResponseEntity<WeeklyReport>(newWeeklyReport, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/report/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable String id) {
        if(id.length() < 32)
            throw new InvalidRequestIdException("Invalid request id");

        Object o = weeklyReportService.selectById(id);

        if(o == null){
            throw new ResourceNotFoundException("Invalid request id");
        }

        weeklyReportService.deleteById(id);

        return "Success";
    }


    @RequestMapping(value = "/report-detail/{id}", method = RequestMethod.GET)
    public String WeeklyReportDetail(@PathVariable String id) {



        return "MAPIReprotDetail";
    }
}