package com.example.demo.service;


import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("studentService")
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAll()
    {
        return studentRepository.findAll();
    }

    public Student findOne(int id)
    {
        return studentRepository.getOne(id);
    }



    public List<Map<String, Object>> generateReports()
    {
     List<Map<String,Object>> result = new ArrayList<>();
     for(Student student : this.findAll())
     {
         Map<String, Object> item = new HashMap<>();
         item.put("id",student.getId());
         item.put("name",student.getName());
         item.put("session",student.getSession());
         item.put("department",student.getDepartment());
         item.put("roll",student.getRoll());
         item.put("mobile",student.getMobile());
         result.add(item);
     }
        return result;
    }

}
