package com.soft1851.spring.web.controller;


import com.soft1851.spring.web.entity.Book;

import com.soft1851.spring.web.entity.Foucs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Arrays;
import java.util.List;

/**
 * @author ke
 * @ClassName HomeController
 * @Description TOOD
 * @Date 2020/3/24
 * @Version 1.0
 **/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
//        model.addAttribute("message", "Hello Spring MVC");
        Foucs[] foucs = {
                new Foucs("特朗普盼四月重启美国经济 拜登怒批：求你别说话，听专家意见", "人民日报网", "https://pics4.baidu.com/feed/f31fbe096b63f624a06b812600bd83fe1b4ca3e5.png?token=55fbf4ffbf19b7335c9c6b8b7c780f0a"),
                new Foucs("文在寅回复特朗普求援：若韩国有剩余，将尽可能提供医疗设备", "环球网", "https://pics5.baidu.com/feed/c2fdfc039245d688017282c1282c1518d31b2453.jpeg?token=0786fa9141fd63e1ccaf9c63f1ad6724"),
                new Foucs("美国新冠肺炎确诊病例达53268例 单日新增确诊数破万", "海外网", "https://pics4.baidu.com/feed/bd3eb13533fa828b8e2a35ff7e852932960a5ac5.jpeg?token=f81a21a1a98c8adf5e01fd31201b63df"),
                new Foucs("武汉市城区疫情评估等级降为中风险", "红星新闻", "https://pics7.baidu.com/feed/c2cec3fdfc039245788251a5b57fccc47c1e2552.jpeg?token=4bca52bba9d293cccc03a9e0c96ca2c0&s=8C95855E442188AC44D96FEA0200B01E")
        };
        List<Foucs> foucsList = Arrays.asList(foucs);
        model.addAttribute("foucsList", foucsList);

        return "home";
    }
}
