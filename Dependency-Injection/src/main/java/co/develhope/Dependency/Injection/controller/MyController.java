package co.develhope.Dependency.Injection.controller;

import co.develhope.Dependency.Injection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    public MyController (MyService myService){
        System.out.println("This is MyController");
        this.myService = myService;
    }

    @GetMapping
    public String helloMess(){
        return "Welcome in my Dependency Injection";
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }
}
