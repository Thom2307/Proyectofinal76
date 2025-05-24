package co.edu.uniquindio.poo.controller;

public class TransaccionControler {
    ModelFactoryController modelFactoryController;

    public TransaccionControler(){
        System.out.println("Llamando al singleton desde EmpleadoServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}
