package cn.weeklyreport.domain;

/**
 * Created by greg.chen on 14-9-3.
 */

public class ExceptionLog {

    private String exceptionLogId;

    private String moduleName;

    private String hostName;

    private String exceptionSource;

    private String exceptionType;

    public String getExceptionLogId() {
        return exceptionLogId;
    }

    public void setExceptionLogId(String exceptionLogId) {
        this.exceptionLogId = exceptionLogId;
    }

    public String getExceptionSource() {
        return exceptionSource;
    }

    public void setExceptionSource(String exceptionSource) {
        this.exceptionSource = exceptionSource;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getExceptionLogPath() {
        return exceptionLogPath;
    }

    public void setExceptionLogPath(String exceptionLogPath) {
        this.exceptionLogPath = exceptionLogPath;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    private String exceptionLogPath;

    private String clientIp;

    private String userAgent;

    private String ticket;

    private String executionTime;

    private String visitorId;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "ExceptionLog{" +
                "id='" + exceptionLogId + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", exceptionSource='" + exceptionSource + '\'' +
                ", exceptionType='" + exceptionType + '\'' +
                ", exceptionLogPath='" + exceptionLogPath + '\'' +
                ", clientIp='" + clientIp + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", ticket='" + ticket + '\'' +
                ", executionTime='" + executionTime + '\'' +
                ", visitorId='" + visitorId + '\'' +
                '}';
    }
}
