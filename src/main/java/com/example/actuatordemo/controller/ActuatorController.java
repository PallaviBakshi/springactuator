package com.example.actuatordemo.controller;

import com.example.actuatordemo.model.ActuatorModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActuatorController {
    private static final String template = "Service, %s!";

    @GetMapping("/healthCheck")
    @ResponseBody
    public ActuatorModel checkServiceStatus(@RequestParam(name="name", required=false, defaultValue="UP") String name) {
        return new ActuatorModel(String.format(template, name));
    }
}
