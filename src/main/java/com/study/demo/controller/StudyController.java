package com.study.demo.controller;


import com.study.demo.service.TestThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {

    @Autowired
    private TestThreadService testThreadService;

    @GetMapping("/testThread")
    public void testThread() {
        try{
            for (int i = 1; i <= 26; i++) {
                testThreadService.exe("任务"+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
