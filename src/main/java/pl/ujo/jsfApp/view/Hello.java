package pl.ujo.jsfApp.view;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String hello = "Hello world";

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
