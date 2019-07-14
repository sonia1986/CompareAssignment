package server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
public class MainStarter {
    public static void main(String[] args) {
        SpringApplication.run(MainStarter.class, args);
    }
}
