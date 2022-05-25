package co.develhope.Dependency.Injection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;
    public MyComponent(){
        System.out.println("MyComponent constructor");
        this.myComponentName = "Matteo De Lorenzo";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
