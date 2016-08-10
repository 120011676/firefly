package com.github.firefly.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by say on 8/10/16.
 */
//@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan
//@MapperScan("cn.no7player.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
