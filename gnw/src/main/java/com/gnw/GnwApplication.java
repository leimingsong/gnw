package com.gnw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gnw.Dao")
public class GnwApplication {

    public static void main(String[] args) {
        SpringApplication.run(GnwApplication.class, args);
    }

}
