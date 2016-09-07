package jason.handlebars.service;

import jason.handlebars.entity.Member;
import jason.handlebars.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
@Service
public class MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
