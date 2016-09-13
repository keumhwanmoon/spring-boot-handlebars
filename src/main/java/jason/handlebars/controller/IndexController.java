package jason.handlebars.controller;

import jason.handlebars.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jason, Moon
 * @since 2016. 8. 30.
 */
@Controller
public class IndexController {

    private final MemberService memberService;

    @Autowired
    public IndexController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("name", "Jason");

        model.addAttribute("members", memberService.findMembers());

        return "index";
    }
}
