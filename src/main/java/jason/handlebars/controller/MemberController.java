package jason.handlebars.controller;

import jason.handlebars.entity.Member;
import jason.handlebars.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
@RestController
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    @ResponseBody
    public List<Member> findMembers() {
        return memberService.findMembers();
    }
}
