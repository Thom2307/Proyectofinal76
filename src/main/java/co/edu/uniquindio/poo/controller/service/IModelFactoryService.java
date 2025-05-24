package co.edu.uniquindio.poo.controller.service;

import co.edu.uniquindio.poo.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.poo.model.Empleado;

import java.util.ArrayList;
import java.util.List;


public interface IModelFactoryService {

	List<EmpleadoDto> obtenerEmpleados();
	boolean agregarEmpleado(EmpleadoDto empleadoDto);

	boolean eliminarEmpleado(String cedula);

	boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);


}
