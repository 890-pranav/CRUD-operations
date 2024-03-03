package com.example.springboot.service;

import com.example.springboot.bean.Subject;
import com.example.springboot.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepo subjectRepo;
    public List<Subject> getAllSubjects(){
        List<Subject> subjects= new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        subjectRepo.save(subject);
    }

    public void deleteSubjects(String id) {
        subjectRepo.deleteById(id);
    }
}
