package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.controller.service.IBancoControllerService;

public class BancoController implements IBancoControllerService {

    ModelFactoryController modelFactoryController;

    public BancoController(){
        System.out.println("Llamando al singleton desde BancoServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}
