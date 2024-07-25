package controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jpa.test.Repo.StudentRepository;
import com.jpa.test.entitites.User;

@RestController
@RequestMapping("/api/v2/students")
public class StudentControllerWithJPA {

    @Autowired
    private StudentRepository studentRepository;

    public StudentControllerWithJPA(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllStudents() {
        List<User> students = studentRepository.findAll();
        return ResponseEntity.ok().body(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getStudent(@PathVariable Long id) {
        Optional<User> student = studentRepository.findById(id);
        return student.map(val -> ResponseEntity.ok().body(val))
                      .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PostMapping
    public ResponseEntity<User> createStudent(@RequestBody User student) {
        User newStudent = studentRepository.save(student);
        return ResponseEntity.ok().body(newStudent);
    }

    @PutMapping
    public ResponseEntity<User> updateStudent(@RequestBody User student) {
        User updatedStudent = studentRepository.save(student);
        return ResponseEntity.ok().body(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
