package com.soft1851.spring.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.service.TopicService;
import com.soft1851.spring.web.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author ke
 * @ClassName TopicController
 * @Description TOOD
 * @Date 2020/3/28
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/")
public class TopicController {
    @Resource
    private TopicService topicService;

    @GetMapping(value = "topics", produces = "application/json; charat=utf-8")
//    @RequestBody
    public String getTopics() {
        ResponseObject rs = new ResponseObject(1, "success", topicService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/topic")
    public String topic(Model model) {
        model.addAttribute("topics", topicService.queryAll());
        return "topic";
    }

}
