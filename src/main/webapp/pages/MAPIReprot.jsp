<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="common/common_css.jsp"%>

<!DOCTYPE html>
<html  ng-app="weeklyReport">
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mapi/mapi.css" type="text/css">
</head>
    <body>
        <%@ include file="common/nav.jsp"%>

        <div class="container">

            <div class="row" ng-controller="WeeklyReportController">
                <form>
                    <label>ServerName</label>
                    <input type="text" name="serverName" ng-model="weeklyReport.serverName">
                    <label>RequestLogFrom</label>
                    <input type="text" name="requestLogFrom" ng-model="weeklyReport.requestLogFrom">
                    <label>RequestLogTo</label>
                    <input type="text" name="requestLogTo" ng-model="weeklyReport.requestLogTo">

                    <input type="button" value="Save" ng-click="saveWeeklyReport();">
                </form>

                <table class="table report_table">
                    <thead>
                    <tr>
                        <th>ServerName</th>
                        <th>RequestLogFrom</th>
                        <th>RequestLogTo</th>
                        <th class="width160">ExceptionLogFrom</th>
                        <th >ExceptionLogTo</th>
                        <th>CreateDate</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                    </thead>

                    <tr ng-repeat="item in list">
                        <td>{{item.serverName}}</td>
                        <td>{{item.requestLogFrom}}</td>
                        <td>{{item.requestLogTo}}</td>
                        <td>{{item.exceptionLogFrom}}</td>
                        <td>{{item.exceptionLogTo}}</td>
                        <td>{{item.createDate}}</td>
                        <td>{{item.description}}</td>
                        <td><a target="_blank" href="/report-detail/{{item.id}}"><img src="${pageContext.request.contextPath}/image/glyphicons_050_link.png" title="detail"></a></td>
                    <tr/>
                </table>
            </div>

        </div>


        <%@ include file="common/common_js.jsp"%>
        <script language="javascript" src="${pageContext.request.contextPath}/js/service/weeklyReportService.js"></script>
        <script language="javascript" src="${pageContext.request.contextPath}/js/controller/weeklyReportController.js"></script>

    </body>

</html>