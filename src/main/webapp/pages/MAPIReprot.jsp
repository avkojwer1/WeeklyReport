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
                    <div class="form-group">
                        <label>ServerName</label>
                        <p class="form-control-static"  ng-init="weeklyReport.serverName = 'MAPI1, MAPI2, MAPI3, MAPI4'">{{weeklyReport.serverName}}</p>
                    </div>
                    <div class="form-group">
                        <label>RequestLogFrom</label>
                        <input type="text" id="requestLogFrom" class="form-control" placeholder="yyyy/mm/dd" ng-model="weeklyReport.requestLogFrom"/>
                    </div>
                    <div class="form-group">
                        <label>RequestLogTo</label>
                        <input type="text" id="requestLogTo" class="form-control" placeholder="yyyy/mm/dd" ng-model="weeklyReport.requestLogTo"/>
                    </div>
                    <div class="form-group">
                        <label>ExceptionLogFrom</label>
                        <input type="text" id="exceptionLogFrom" class="form-control" placeholder="yyyy/mm/dd" ng-model="weeklyReport.exceptionLogFrom"/>
                    </div>
                    <div class="form-group">
                        <label>ExceptionLogTo</label>
                        <input type="text" id="exceptionLogTo" class="form-control" placeholder="yyyy/mm/dd" ng-model="weeklyReport.exceptionLogTo" />
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <textarea type="text" id="description" class="form-control"  ng-model="weeklyReport.description" class="col-xs-4"></textarea>
                    </div>
                    <input type="button" value="Save" class="btn btn-primary" ng-click="save();">
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
                        <td>
                            <a target="_blank" href="/report-detail/{{item.id}}"><img src="${pageContext.request.contextPath}/image/glyphicons_050_link.png" title="detail"></a>
                            <img src="${pageContext.request.contextPath}/image/glyphicons_256_delete.png" title="delete"  ng-click="delete(item.id);">
                        </td>
                    <tr/>
                </table>
            </div>

        </div>


        <%@ include file="common/common_js.jsp"%>
        <script language="javascript" src="${pageContext.request.contextPath}/js/service/weeklyReportService.js"></script>
        <script language="javascript" src="${pageContext.request.contextPath}/js/controller/weeklyReportController.js"></script>

    </body>

</html>