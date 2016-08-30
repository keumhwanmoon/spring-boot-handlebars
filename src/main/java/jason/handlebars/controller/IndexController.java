package jason.handlebars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jason, Moon
 * @since 2016. 8. 30.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {

        String name = "Jason";
        model.addAttribute("name", name);
        return "index";
    }
}
