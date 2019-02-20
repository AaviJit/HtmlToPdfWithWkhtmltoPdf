package com.example.demo.controller;

import com.example.demo.pdfutil.PdfDemo;
import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    StudentService studentService;

    @Autowired
    PdfDemo pdfDemo;

    @GetMapping("/test")
    private String testPage(Model model)
    {
        List<Student> studentList = studentService.findAll();System.out.println(studentList);
        model.addAttribute(studentList);
        return "sample";
    }
}