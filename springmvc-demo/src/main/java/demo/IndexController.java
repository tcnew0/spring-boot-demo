package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value="/home",method = RequestMethod.GET, produces="text/html")
    public @ResponseBody String home(){
        return "home page result";
    }

    @RequestMapping(value="/mav",method = RequestMethod.GET)
    public ModelAndView mav(){
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("message","mav message");
        return mav;
    }

    @RequestMapping("/login/{id}")
    public @ResponseBody String login(@PathVariable String id){
        return "login id:"+id;
    }

    @RequestMapping("/show")
    public String show(@RequestParam(required = false) String id, ModelMap map){
        map.addAttribute("message","show message : "+id);
        return "show";
    }
}
