package com.example.Application.controller;

import com.example.Application.Entity.Subject;
import com.example.Application.service.SubjectService;
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

    @RequestMapping(method = RequestMethod.GET , value = "/ID_subjects/{Id_Number}")
    public List<Subject> getSubjectById(@PathVariable Long Id_Number){
        return subjectService.getSubjectById(Id_Number);
    }

    @RequestMapping(method = RequestMethod.GET , value = "/Add_subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/Update_subjects")
    public void updateSubject(@PathVariable Long Id_Number, @RequestBody Subject subject){
        subjectService.updateSubject(Id_Number,subject);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/Delete_Subjects/{Number}")
    public void deleteSubject(@PathVariable Long Number){
        subjectService.deleteSubjects(Number);
    }

}

