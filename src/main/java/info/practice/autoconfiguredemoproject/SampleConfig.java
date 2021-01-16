package info.practice.autoconfiguredemoproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    private final ApplicationContext applicationContext;

    public SampleConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        final Object dummyString = applicationContext.getBean("dummyString");
        System.out.println(dummyString);
    }
}
