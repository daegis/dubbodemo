package cn.aegisa.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubbodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbodemoApplication.class, args);
    }
}
