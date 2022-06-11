/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class EjemploAlertConfirmacionController implements Initializable {

    @FXML
    private Button btnPedirConf;
    @FXML
    private TextField txtPedirConfi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void pedirConfirmación(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("¿Estas seguro de confirmar la acción?");
        Optional<ButtonType> action = alert.showAndWait();

        // Si hemos pulsado en aceptar
        if (action.get() == ButtonType.OK) {
            this.txtPedirConfi.setText("Has pulsado en aceptar");
        } else {
            this.txtPedirConfi.setText("Has pulsado en cancelar");
        }

    }

}
