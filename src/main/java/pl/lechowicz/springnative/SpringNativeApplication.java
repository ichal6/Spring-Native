package pl.lechowicz.springnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNativeApplication.class, args);
    }

    @GetMapping("/")
    public String greetings(){
        return "Test Native";
    }

}
