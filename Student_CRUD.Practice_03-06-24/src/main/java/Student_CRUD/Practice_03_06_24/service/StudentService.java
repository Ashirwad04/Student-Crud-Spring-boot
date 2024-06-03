package Student_CRUD.Practice_03_06_24.service;


import Student_CRUD.Practice_03_06_24.entiry.Student;
import Student_CRUD.Practice_03_06_24.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


//add Student
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

//get all student

    public List<Student> getAllStudent(){
        return  studentRepository.findAll();
    }
//get by id
    public Optional<Student> getById(Long id){
        return studentRepository.findById(id);
    }




//delete by id
    public void deletById(Long id){
        studentRepository.deleteById(id);
    }




}
