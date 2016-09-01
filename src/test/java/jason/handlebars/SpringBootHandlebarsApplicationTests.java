package jason.handlebars;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import jason.handlebars.entity.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHandlebarsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void handlebarsCompile() throws Exception {
		Handlebars handlebars = new Handlebars();

		List<Member> memberList = Arrays.asList(
			new Member(1L, "Member1"),
				new Member(2L, "Member2"),
				new Member(3L, "Member3"),
				new Member(4L, "Member4")
		);

		Template template = handlebars.compileInline(
				"{{#each this}}" +
						"[{{id}}, {{name}}]" +
				"{{/each}}"
		);

		System.out.println(" ============================================== " );
		System.out.println(template.apply(memberList));
		System.out.println(" ============================================== " );
	}

}
