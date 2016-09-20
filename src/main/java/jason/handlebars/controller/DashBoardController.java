package jason.handlebars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jason, Moon
 * @since 2016. 8. 30.
 */
@Controller
@RequestMapping("/")
public class DashBoardController {

    @RequestMapping
    public String index() {
        return "index";
    }
}
