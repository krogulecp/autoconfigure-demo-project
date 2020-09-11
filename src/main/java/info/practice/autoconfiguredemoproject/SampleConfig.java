package info.practice.autoconfiguredemoproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    private final ApplicationContext applicationContext;

    public SampleConfig(ApplicationContext applicationContext) {
        Object dummyString = applicationContext.getBean("dummyString");
        this.applicationContext = applicationContext;
    }
}
