package co.edu.uniquindio.poo.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona{


    private Double salario;
    private String codigo;
    ArrayList<Cliente> listaClientesAsociados = new ArrayList<Cliente>();


    public Empleado(Double salario, String codigo, ArrayList<Cliente> listaClientesAsociados) {
        this.salario = salario;
        this.codigo = codigo;
        this.listaClientesAsociados = listaClientesAsociados;
    }

    public Empleado() {

    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public ArrayList<Cliente> getListaClientesAsociados() {
        return listaClientesAsociados;
    }


    public void setListaClientesAsociados(ArrayList<Cliente> listClientesAsociados) {
        this.listaClientesAsociados = listClientesAsociados;
    }



}