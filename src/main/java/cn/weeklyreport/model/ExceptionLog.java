package cn.weeklyreport.model;

import javax.persistence.*;

/**
 * Created by greg.chen on 14-9-3.
 */
@Entity(name="ExceptionLog")
public class ExceptionLog {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ExceptionLogId")
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

    @Basic
    private String moduleName;
    @Basic
    private String hostName;


}
