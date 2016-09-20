package jason.handlebars.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jason, Moon
 * @since 2016-09-20
 */
@Controller
@RequestMapping(value = "/ui")
public class PanelsController {

    @RequestMapping(value = "/panels")
    public String page() {
        return "ui/panels";
    }
}
