package org.example.config;

import org.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 18:27
 */

@Configuration
@ComponentScan("org.example.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    @Bean
    public User getUser() {
        return new User();
    }

}
