package me.june.site;

import me.june.demosecurity.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-09
 * Time: 21:23
 **/
@Controller
public class SiteController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return "hello Site";
    }

    @GetMapping("/site")
    public String site() {
        return helloService.sayHello();
    }

}
