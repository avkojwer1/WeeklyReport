package cn.weeklyreport.test.webapp;

import cn.weeklyreport.dao.utils.UUIDUtils;
import cn.weeklyreport.domain.WeeklyReport;
import cn.weeklyreport.test.base.BaseTest;
import cn.weeklyreport.test.base.WebAppBaseTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.awt.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by greg.chen on 14-10-7.
 */
public class WeeklyReportControllerTest extends WebAppBaseTest {

    private static String UUID = UUIDUtils.create();

    @Test
    public void getWeeklyReportListTest() throws  Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/report-list"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }

    @Test
    public void deleteTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.delete(String.format("/report/delete/%s", UUID)))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void deleteTest2() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.delete("/report/delete/111111111111111111111111"))
                .andExpect(status().isBadRequest())
                .andDo(print());
    }

    @Test
    public void addTest() throws Exception{
        String json = null;
        WeeklyReport report = new WeeklyReport();
        report.setId(UUID);
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        json = objectMapper.writeValueAsString(report);

        mockMvc.perform(post("/report/add").content(json)
                .contentType(MediaType.APPLICATION_JSON)
                 .accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isCreated());
    }


}
