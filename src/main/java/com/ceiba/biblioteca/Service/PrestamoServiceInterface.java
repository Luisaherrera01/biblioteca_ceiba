package com.ceiba.biblioteca.Service;

import com.ceiba.biblioteca.Entity.Prestamo;

import java.time.LocalDate;

public interface PrestamoServiceInterface {

    Prestamo crearPrestamo(Prestamo prestamo) throws Exception;
    Prestamo buscarPorId(Integer id) throws Exception;
    LocalDate calcularFechaMaximaDevolucion(Prestamo prestamo);
    LocalDate calcularFechaMaximaDevolucionBase(LocalDate fechaActual, Integer diasSegunTipoUsuario);
}
