package com.example.springboot.repository;

import com.example.springboot.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject,String> {
}
