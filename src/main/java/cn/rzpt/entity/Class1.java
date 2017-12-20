package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
*   班级实体
* */
@Component
@Entity
public class Class1 {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String note;  //备注
    private int stuCnt;   //学生数
    private int year;     //入学年份
    private String type;   //类型   0高中班 1对口班 2单招班 33+2班 4定向培养 5混合班
    private int pro_id;  //专业id
    private int user_id;   //班主任id
    private int plan_id;    //方案id

    public Class1() {
    }

    @Override
    public String toString() {
        return "class1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", stuCnt=" + stuCnt +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", pro_id=" + pro_id +
                ", user_id=" + user_id +
                ", plan_id=" + plan_id +
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStuCnt() {
        return stuCnt;
    }

    public void setStuCnt(int stuCnt) {
        this.stuCnt = stuCnt;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
