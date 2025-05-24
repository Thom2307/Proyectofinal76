package co.edu.uniquindio.poo.model.services;

import co.edu.uniquindio.poo.exceptions.EmpleadoException;
import co.edu.uniquindio.poo.model.Empleado;

import java.util.ArrayList;


public interface IBancoService {
    public co.edu.uniquindio.poo.model.Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) throws EmpleadoException;

    public Boolean eliminarEmpleado(String cedula) throws EmpleadoException;

    boolean actualizarEmpleado(String cedulaActual, Empleado empleado) throws EmpleadoException;

    public boolean verificarEmpleadoExistente(String cedula) throws EmpleadoException;

    public co.edu.uniquindio.poo.model.Empleado obtenerEmpleado(String cedula);

    public ArrayList<co.edu.uniquindio.poo.model.Empleado> obtenerEmpleados();
}
