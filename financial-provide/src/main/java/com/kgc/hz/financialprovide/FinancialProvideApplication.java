package com.kgc.hz.financialprovide;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class FinancialProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialProvideApplication.class, args);
    }

}
