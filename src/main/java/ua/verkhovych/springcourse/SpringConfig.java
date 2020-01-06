package ua.verkhovych.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.verkhovych.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
