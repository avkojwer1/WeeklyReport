<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./common/common.jsp"%>

<!DOCTYPE html>
<html  ng-app>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/mapi/mapi.css" type="text/css">
</head>
    <body>
        <%@ include file="common/nav.jsp"%>

        <div class="container">
            <div class="row">
                <table class="table report_table">
                    <thead>
                    <tr>
                        <th>ServerName</th>
                        <th>RequestLogFrom</th>
                        <th>RequestLogTo</th>
                        <th>ExceptionLogFrom</th>
                        <th>ExceptionLogTo</th>
                        <th>CreateDate</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                    </thead>

                    <s:forEach var="item" items="${list}">
                        <tr>
                            <td>${item.getServerName()}</td>
                            <td>${item.getRequestLogFrom()}</td>
                            <td>${item.getRequestLogTo()}</td>
                            <td>${item.getExceptionLogFrom()}</td>
                            <td>${item.getExceptionLogTo()}</td>
                            <td>${item.getCreateDate()}</td>
                            <td>${item.description}</td>
                            <td><a target="_blank" href="/report-detail/${item.id}"><img src="${pageContext.request.contextPath}/image/glyphicons_050_link.png" title="detail"></a></td>
                        <tr/>
                    </s:forEach>
                </table>
            </div>

            <div class="row">
                Hello {{'World'}}!

            </div>

        </div>



    </body>

</html>