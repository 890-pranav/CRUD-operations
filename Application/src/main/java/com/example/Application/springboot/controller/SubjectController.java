package com.example.Application.springboot.controller;

import com.example.Application.springboot.Entity.Subject;
import com.example.Application.springboot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(method = RequestMethod.GET , value = "/List_subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST , value = "/Add_subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/Update_subjects")
    public void updateSubject(@PathVariable Long Id, @RequestBody Subject subject){
        subjectService.updateSubject(Id,subject);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/Delete_Subjects")
    public void deleteSubject(@PathVariable Long Id){
        subjectService.deleteSubjects(Id);
    }

    public void getSubjectsByName(@RequestBody Subject subject){
        subjectService.getSubjectsByName(subject);
    }
}

