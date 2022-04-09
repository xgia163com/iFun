package com.ju.ifun.watch.version.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class VersionController {

    /**
     * http://localhost:8011/version/getTest
     * @param customerName
     * @return
     */
    @GetMapping("getTest")
    public String  getTest(String customerName

    ) {
        return "test";

    }

}
