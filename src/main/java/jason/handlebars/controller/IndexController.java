package jason.handlebars.controller;

import com.github.jknack.handlebars.Handlebars;
import jason.handlebars.entity.Member;
import jason.handlebars.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 8. 30.
 */
@Controller
public class IndexController {

    private final MemberRepository memberRepository;

    private final NamedParameterJdbcTemplate template;

    @Autowired
    public IndexController(MemberRepository memberRepository, NamedParameterJdbcTemplate template) {
        this.memberRepository = memberRepository;
        this.template = template;
    }

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("name", "Jason");

        return "index";
    }

    @RequestMapping(value = "/member")
    @ResponseBody
    public List<Member> memberList() {
        return memberRepository.findAll();
    }
}
