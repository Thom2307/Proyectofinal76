package co.edu.uniquindio.poo.ViewController;

import co.edu.uniquindio.poo.controller.BancoController;
import co.edu.uniquindio.poo.controller.service.IBancoControllerService;
import javafx.fxml.FXML;

public class BancoViewController {
    IBancoControllerService bancoControllerService;

    @FXML
    void initialize() {
        bancoControllerService = new BancoController();
    }
}