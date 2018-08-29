package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HtmlViewReportController {

    @Autowired
    StudentService studentService;


    @GetMapping(value = "/report/html")
    public String getPdfReportForStudent(Model model) {
        model.addAttribute("studentList", studentService.findAll());
        return "sample";
    }
}