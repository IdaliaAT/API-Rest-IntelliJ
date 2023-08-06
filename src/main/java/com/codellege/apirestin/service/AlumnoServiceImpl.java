package com.codellege.apirestin.service;

import com.codellege.apirestin.model.Alumno;
import com.codellege.apirestin.repository.IAlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlumnoServiceImpl implements IAlumnoService<Alumno, Integer>{
    @Autowired
    private IAlumnoRepo repository;
    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    @Override
    public Alumno save(Integer id, Alumno alumno) {
        alumno.setId(id);
        return repository.save(alumno);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
