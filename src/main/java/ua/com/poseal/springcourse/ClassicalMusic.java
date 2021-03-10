package ua.com.poseal.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
