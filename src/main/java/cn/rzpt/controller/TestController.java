package cn.rzpt.controller;

import cn.rzpt.entity.Test;
import cn.rzpt.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @Autowired
    private Test test;

    @Autowired
    private TestServiceImpl testService;

    @PostMapping("/postTest")
    public String postTest(@RequestParam("name") String name, ModelMap map) {
        System.out.println(name);
        map.put("name", name);
        return "success";
    }

    @GetMapping("/getTest/{name}")
    public String getTest(@PathVariable("name") String name, ModelMap map) {
        System.out.println(name);
        map.put("name", name);
        return "teacher/index";
    }
}
