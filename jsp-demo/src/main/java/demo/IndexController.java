package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 15050886 on 2017/4/6.
 */
@Controller
public class IndexController {

    @RequestMapping("home")
    public String home(){
        System.out.println("home page..");
        return "index.jsp";
    }
}
