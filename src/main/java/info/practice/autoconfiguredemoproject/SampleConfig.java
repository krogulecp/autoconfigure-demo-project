package info.practice.autoconfiguredemoproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    private final ApplicationContext applicationContext;

    public SampleConfig(ApplicationContext applicationContext, MyProps myProps) {
        this.applicationContext = applicationContext;
        final Object dummyString = applicationContext.getBean("myCustomizableAutoconfigurationBean");
        System.out.println(dummyString);
    }
}
