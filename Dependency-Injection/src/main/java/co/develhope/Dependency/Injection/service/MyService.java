package co.develhope.Dependency.Injection.service;

import co.develhope.Dependency.Injection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;

    @Autowired
    public MyService (MyComponent myComponent){
        System.out.println("This is my service");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("Method getName called");
        return myComponent.getMyComponentName();
    }
}
