package cn.rzpt.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
*   职业领域
* */
@Component
@Entity
public class OccupationalArea {
    @Id
    @GeneratedValue
    private int id;
    private String content;   //详情
    private int plan_id;       //外键 人才培养方案

    public OccupationalArea() {
    }

    @Override
    public String toString() {
        return "OccupationalArea{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", plan_id=" + plan_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }
}
