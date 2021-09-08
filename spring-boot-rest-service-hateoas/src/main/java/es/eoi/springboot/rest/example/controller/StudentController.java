package es.eoi.springboot.rest.example.controller;

import es.eoi.springboot.rest.example.dto.StudentModel;
import es.eoi.springboot.rest.example.dto.asembler.StudentModelAsembler;
import es.eoi.springboot.rest.example.entity.Student;
import es.eoi.springboot.rest.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    StudentModelAsembler studentModelAssembler;

    @GetMapping("/api/students")
    public ResponseEntity<CollectionModel<StudentModel>> getAllStudents()
    {
        List<Student> actorEntities = studentRepository.findAll();
        return new ResponseEntity<>(
                studentModelAssembler.toCollectionModel(actorEntities),
                HttpStatus.OK);
    }

	/* Same data than getAllStudents method but without HATEOAS (in different path)
	@GetMapping("/students")
	public List<Student> retrieveAllStudents() {
		return studentRepository.findAll();
	}
	*/

    @GetMapping("/api/student/{id}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable("id") Long id)
    {
        return null; //TODO
    }


    @DeleteMapping("/api/students/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentApi(@PathVariable long id) {
        studentRepository.deleteById(id);
    }


    @PostMapping("/api/students")
    public ResponseEntity<StudentModel> createStudentApi(@RequestBody Student student) {
        return null; //TODO
    }

    @PutMapping("/api/students/{id}")
    public ResponseEntity<StudentModel> updateStudentApi(@RequestBody Student student, @PathVariable long id) {

        return null; //TODO
    }
}
