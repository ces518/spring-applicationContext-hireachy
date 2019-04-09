package me.june.site;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-09
 * Time: 21:11
 **/
@Configuration
@PropertySource("classpath:site.properties")
@EnableAutoConfiguration
public class SiteConfig {
}
