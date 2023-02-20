package edu.dws.ejemploWeb.aplicacion.repositorios;

import org.springframework.data.repository.CrudRepository;

import edu.dws.ejemploWeb.aplicacion.entidades.Alumno;
//extends CrudRepository<Alumno, Integer>

public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer>{

}
