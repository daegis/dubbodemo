package cn.aegisa.dubbodemo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/10/2018 10:16 PM
 */
@Controller
@Slf4j
public class TestController {


    @RequestMapping("/test")
    public String test() {
        return "ok";
    }
}
