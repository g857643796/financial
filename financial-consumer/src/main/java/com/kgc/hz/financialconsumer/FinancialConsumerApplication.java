package com.kgc.hz.financialconsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class FinancialConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialConsumerApplication.class, args);
    }

}
