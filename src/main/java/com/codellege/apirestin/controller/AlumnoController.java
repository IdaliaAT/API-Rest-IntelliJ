package com.codellege.apirestin.controller;

import com.codellege.apirestin.model.Alumno;
import com.codellege.apirestin.service.AlumnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apirestin/v1/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoServiceImpl serviciosREST;

    @GetMapping
    public List<Alumno> listarTodo(){
        return serviciosREST.findAll();
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno){
        return serviciosREST.save(alumno);
    }

    @PutMapping("{id}")
    public Alumno actualizar(@RequestBody Alumno alumno, @PathVariable Integer id){
        alumno.setId(id);
        return serviciosREST.save(alumno);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Integer id){
        serviciosREST.deleteById(id);
    }

}
