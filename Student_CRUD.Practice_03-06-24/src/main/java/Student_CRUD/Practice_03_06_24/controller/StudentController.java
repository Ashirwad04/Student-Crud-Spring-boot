package Student_CRUD.Practice_03_06_24.controller;


import Student_CRUD.Practice_03_06_24.entiry.Student;
import Student_CRUD.Practice_03_06_24.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {


    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public Student addStudent (@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }


    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id){
       return studentService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void delteteById(@PathVariable Long id){
        studentService.deletById(id);
    }
}
