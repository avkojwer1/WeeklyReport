package cn.weeklyreport.interceptor;

import org.apache.log4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by greg.chen on 14-9-18.
 */
public class RequestProcessingTimeInterceptor extends HandlerInterceptorAdapter {
    private static Logger logger = Logger.getLogger(RequestProcessingTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        logger.info("Request URL:" + request.getRequestURL().toString());
        logger.info("Request Parameters:" + request.getParameterMap().toString());

        request.setAttribute("startTime", startTime);
        //if returned false, we need to make sure 'response' is sent
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("Request URL:" + request.getRequestURL().toString()
                + " Sent to Handler");
        //we can add attributes in the modelAndView and use that in the view page
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        logger.info("Request URL:" + request.getRequestURL().toString()
                + ", elapsed=" +  (System.currentTimeMillis() - startTime) + "ms");

    }


}
