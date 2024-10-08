package productapp.week3_programme2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class Week3Programme2Application {

    public static void main(String[] args) {
        SpringApplication.run(Week3Programme2Application.class, args);
    }

}
