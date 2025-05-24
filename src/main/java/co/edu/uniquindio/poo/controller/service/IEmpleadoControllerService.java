package co.edu.uniquindio.poo.controller.service;

import co.edu.uniquindio.poo.mapping.dto.EmpleadoDto;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public interface IEmpleadoControllerService {
    List<EmpleadoDto> obtenerEmpleados();

    boolean agregarEmpleado(EmpleadoDto empleadoDto);

    boolean eliminarEmpleado(String cedula);

    boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);
}
