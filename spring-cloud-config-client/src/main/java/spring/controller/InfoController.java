package spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${info.profile}")
    private String version;

    @GetMapping("/version")
    public String getVersion(){
        return version;
    }

}
