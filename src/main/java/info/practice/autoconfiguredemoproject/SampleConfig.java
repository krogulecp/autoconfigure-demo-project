package info.practice.autoconfiguredemoproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    private final ApplicationContext context;

    public SampleConfig(ApplicationContext context) {
        this.context = context;
        Object dummyConfig = context.getBean("myCustomizableAutoconfigurationBean");
        System.out.println(dummyConfig);
    }
}
