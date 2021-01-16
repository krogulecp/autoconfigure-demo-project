package info.practice.autoconfiguredemoproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    private final ApplicationContext applicationContext;

    public SampleConfig(ApplicationContext applicationContext, MyProps myProps) {
        this.applicationContext = applicationContext;
        final Object dummyString = applicationContext.getBean("dummyString");
        System.out.println(dummyString);
    }
}
