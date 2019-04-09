package me.june.demosecurity;

import me.june.core.CoreConfig;
import me.june.site.SiteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class DemoSecurityApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .parent(ParentConfig.class).web(WebApplicationType.NONE)
                .child(CoreConfig.class).web(WebApplicationType.SERVLET)
                .sibling(SiteConfig.class).web(WebApplicationType.SERVLET)
                .run(args);
//        SpringApplication.run(DemoSecurityApplication.class, args);
    }
}
