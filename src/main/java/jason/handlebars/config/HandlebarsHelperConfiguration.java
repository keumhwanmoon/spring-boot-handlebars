package jason.handlebars.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * @author jason, Moon
 * @since 2016. 9. 21.
 */
@Configuration
public class HandlebarsHelperConfiguration {
    private final HandlebarsViewResolver handlebarsViewResolver;

    @Autowired
    public HandlebarsHelperConfiguration(HandlebarsViewResolver handlebarsViewResolver) {
        this.handlebarsViewResolver = handlebarsViewResolver;
    }

    @PostConstruct
    public void registerHelper() {
        try {
            handlebarsViewResolver.registerHelpers(new File("/WEB-INF/classes/static/handlebars/handlebars-intl.min.js"));
        } catch (Exception e) {
            System.out.println("e.toString() = " + e.toString());
        }
    }
}
