package com.codellege.apirestin.service;

import java.util.List;

public interface IAlumnoService<Alumno, Integer> {
    // La arquitectura REST Trabaja en base a 4 verbos en http que son Get, Post, Put y Delete.

    // GET
    List<Alumno> findAll();

    // POST
    Alumno save(Alumno alumno);

    // PUT
    Alumno save(Integer id, Alumno alumno);

    // DELETE
    void deleteById(java.lang.Integer id);
    }
