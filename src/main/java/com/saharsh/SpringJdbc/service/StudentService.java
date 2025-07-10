package com.saharsh.SpringJdbc.service;

import com.saharsh.SpringJdbc.model.Student;
import com.saharsh.SpringJdbc.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public Studentrepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(Studentrepo repo) {
        this.repo = repo;
    }

    private Studentrepo repo;


    public void addStudent(Student s1) {
        repo.save(s1);
    }
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
