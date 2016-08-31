package jason.handlebars.repository;

import jason.handlebars.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jason on 2016-08-31.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
