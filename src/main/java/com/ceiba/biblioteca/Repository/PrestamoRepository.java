package com.ceiba.biblioteca.Repository;

import com.ceiba.biblioteca.Entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
    boolean existsByIdentificacionUsuario(String identificacionUsuario);

}