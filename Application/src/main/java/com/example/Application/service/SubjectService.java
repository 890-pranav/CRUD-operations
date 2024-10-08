package com.example.Application.service;

import com.example.Application.repository.SubjectRepo;
import com.example.Application.Entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepo subjectRepo;
    public List<Subject> getAllSubjects(){
        return (List<Subject>) this.subjectRepo.findAll();
    }


    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject(Long id, Subject subject) {
        subjectRepo.save(subject);
    }

    public void deleteSubjects(Long Number) {
        subjectRepo.deleteById(Number);
        System.out.println("Successfully deleted By Number :" + String.valueOf(Number));
    }

    public List<Subject> getSubjectById(Long Id) {
        List<Subject> subjects= new ArrayList<>();
        subjectRepo.findById(Id);
        return subjects;
    }
}
