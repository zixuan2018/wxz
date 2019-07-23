package com.zixuan.jsxl.controller;


import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class MainController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public String jsonProc(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("helo", "world");
        return jsonObject.toString();

    }
}

