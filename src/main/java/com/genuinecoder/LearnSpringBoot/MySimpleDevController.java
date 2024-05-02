package com.genuinecoder.LearnSpringBoot;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@RestController
@Profile("dev")
public class MySimpleDevController {

    @RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(){
        return "Hi, human";
    }

    @GetMapping("/test")
    public String secondHome(){
        return "Hello World222";
    }


}
