package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 请求控制器
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public @ResponseBody String home(){
        return "home page";
    }
}
