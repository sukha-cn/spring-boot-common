package com.local.spc.spcbase.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "Hello SpringBoot, test WebHook, Redeploy";
    }
}
