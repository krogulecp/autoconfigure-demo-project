package info.practice.autoconfiguredemoproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DummyConfiguration {

    String dummyString(){
        return "dummy string from app";
    }
}
