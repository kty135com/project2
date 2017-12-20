package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String pwd;
    private String realName;
    private int state;    //0：超级管理员 1.院部管理员 2.教研室主任3.老师
    private int dept_id;   //院部id
    private int pro_id;     //专业id

    public User() {
    }

    public User(int id, String name, String pwd, String realName, int state, int dept_id, int pro_id) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.realName = realName;
        this.state = state;
        this.dept_id = dept_id;
        this.pro_id = pro_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", realName='" + realName + '\'' +
                ", state=" + state +
                ", dept_id=" + dept_id +
                ", pro_id=" + pro_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }
}
