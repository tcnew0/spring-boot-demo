package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by 15050886 on 2017/4/6.
 */
@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/home")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }
}
