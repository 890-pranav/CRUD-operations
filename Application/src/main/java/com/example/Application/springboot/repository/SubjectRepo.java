package com.example.Application.springboot.repository;
import com.example.Application.springboot.Entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends CrudRepository<Subject,Long> {

}
