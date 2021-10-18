package fhtw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button btn_1;

    @FXML
    void btn_1_click(ActionEvent event) {
        System.out.println("Text in command line");
    }

}
