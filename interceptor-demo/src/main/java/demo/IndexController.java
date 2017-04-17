package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 15050886 on 2017/4/7.
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("home..");
        return "welcome";
    }

    @RequestMapping("validate")
    public String validate(){
        return "validate";
    }
}
