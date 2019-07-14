package server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableAutoConfiguration
public class MainStarter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MainStarter.class, args);
    }
}
