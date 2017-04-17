package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 15050886 on 2017/4/6.
 */
@SpringBootApplication
public class MainApplication {

    // mvn clean spring-boot:run 可运行
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
