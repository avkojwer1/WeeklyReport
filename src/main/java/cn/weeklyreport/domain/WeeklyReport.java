package cn.weeklyreport.domain;

/**
 * Created by greg.chen on 14-9-19.
 */
public class WeeklyReport {

    private String Id;
    private String requestLogFrom;
    private String requestLogTo;
    private String exceptionLogFrom;
    private String exceptionLogTo;
    private String Type;
    private String Description;
    private String CreateDate;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRequestLogFrom() {
        return requestLogFrom;
    }

    public void setRequestLogFrom(String requestLogFrom) {
        this.requestLogFrom = requestLogFrom;
    }

    public String getRequestLogTo() {
        return requestLogTo;
    }

    public void setRequestLogTo(String requestLogTo) {
        this.requestLogTo = requestLogTo;
    }

    public String getExceptionLogFrom() {
        return exceptionLogFrom;
    }

    public void setExceptionLogFrom(String exceptionLogFrom) {
        this.exceptionLogFrom = exceptionLogFrom;
    }

    public String getExceptionLogTo() {
        return exceptionLogTo;
    }

    public void setExceptionLogTo(String exceptionLogTo) {
        this.exceptionLogTo = exceptionLogTo;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }
}
