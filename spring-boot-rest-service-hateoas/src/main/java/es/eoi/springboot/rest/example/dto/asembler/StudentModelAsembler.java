package es.eoi.springboot.rest.example.dto.asembler;

import es.eoi.springboot.rest.example.controller.StudentController;
import es.eoi.springboot.rest.example.dto.StudentModel;
import es.eoi.springboot.rest.example.entity.Student;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class StudentModelAsembler extends RepresentationModelAssemblerSupport<Student, StudentModel> {

    public StudentModelAsembler() {
        super(StudentController.class, StudentModel.class);
    }

    @Override
    public StudentModel toModel(Student entity) {
        return null;
    }

    // TODO
}
