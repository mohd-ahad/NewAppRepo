package io.ahad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.ahad.entity.NewApp;
import io.ahad.service.NewAppService;

import java.util.List;

@RestController
public class NewAppController {

    @Autowired
    private NewAppService service;

    @GetMapping("/newApp")
    public List<NewApp> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/newApp/{id}")
    public NewApp getBookById(@PathVariable("id") int id) {
        return this.service.getById(id);
    }

    @PostMapping("/newApp")
    public NewApp addBook(@RequestBody NewApp newApp){
        return this.service.add(newApp);
    }

    @PutMapping("/newApp/{id}")
    public String updateBook( @PathVariable("id") long id, @RequestBody NewApp newApp){
        this.service.update(id, newApp);
        return "updated successfully";
    }

    @DeleteMapping("/newApp/{id}")
    public String delete(@PathVariable("id") long id){
        this.service.delete(id);
        return "deleted successfully";
    }

}
