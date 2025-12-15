package care.cuddliness.base;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext stacyApplication = new SpringApplicationBuilder(BaseApplication.class).web(
                WebApplicationType.NONE).run(args);

    }
}
