package mx.edu.utez.firstapp.controllers.person;

import mx.edu.utez.firstapp.models.person.Person;
import mx.edu.utez.firstapp.models.utils.CustomResponse;
import mx.edu.utez.firstapp.services.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-firstapp/person")
@CrossOrigin(origins = {"*"})

public class PersonContoller {
    @Autowired
    private PersonService service;

    @GetMapping("/")
    public ResponseEntity<CustomResponse<List<Person>>>
    getAll(){
        return new ResponseEntity<>(
                this.service.getAll(),
                HttpStatus.OK
        );
    }


}
