package info.practice.autoconfiguredemoproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfiguration {

    @Bean
    String dummyString(){
        return "dummy string";
    }
}
