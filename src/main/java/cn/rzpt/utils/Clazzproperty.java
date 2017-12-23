package cn.rzpt.utils;

import cn.rzpt.entity.User;

import java.util.List;

public class Clazzproperty {

    public static List<User> setitState(List<User> list) {
        for (User u : list
                ) {
            if (u.getState() == 0) {
                u.setSta("超级管理员");
            } else if (u.getState() == 1) {
                u.setSta("院部管理员");
            } else if (u.getState() == 2) {
                u.setSta("教研室主任");
            } else if (u.getState() == 3) {
                u.setSta("教师");
            } else {
                return null;
            }
        }
        return list;
    }
}
