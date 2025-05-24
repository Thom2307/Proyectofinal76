package co.edu.uniquindio.poo.controller;

public class ClienteController {
    ModelFactoryController modelFactoryController;

    public ClienteController(){
        System.out.println("Llamando al singleton desde EmpleadoServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}
