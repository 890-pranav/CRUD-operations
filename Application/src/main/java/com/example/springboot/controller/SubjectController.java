package com.example.springboot.controller;

import com.example.springboot.bean.Subject;
import com.example.springboot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST , value = "/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/subjects")
    public void updateSubject(@PathVariable String Id, @RequestBody Subject subject){
        subjectService.updateSubject(Id,subject);
    }

    public void deleteSubject(@PathVariable String Id){
        subjectService.deleteSubjects(Id);
    }
}

