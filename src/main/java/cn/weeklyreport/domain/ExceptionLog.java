package cn.weeklyreport.domain;

/**
 * Created by greg.chen on 14-9-3.
 */

public class ExceptionLog {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

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

    private String moduleName;

    private String hostName;

    @Override
    public String toString() {
        return "ExceptionLog{" +
                "id=" + id +
                ", moduleName='" + moduleName + '\'' +
                ", hostName='" + hostName + '\'' +
                '}';
    }
}
