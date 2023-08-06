package com.codellege.apirestin.repository;

import com.codellege.apirestin.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository = La capa de acceso a datos ANTERIORMENTE se usaba DAO: Data Access Object.
@Repository
public interface IAlumnoRepo extends JpaRepository<Alumno, Integer> {
}
