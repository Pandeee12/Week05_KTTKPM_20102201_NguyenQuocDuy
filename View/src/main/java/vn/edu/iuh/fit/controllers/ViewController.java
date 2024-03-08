package vn.edu.iuh.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.Repositories.ViewRepository;
import vn.edu.iuh.fit.models.View;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller")
public class ViewController {
    @Autowired
    private ViewRepository viewRepository;

    @GetMapping("/views")
    public List<View> getViews(){
        return viewRepository.findAll();
    }

    @GetMapping("/views/{id}")
    public Optional<View> getViewById(@PathVariable long id){
        return viewRepository.findById(id);
    }
}
