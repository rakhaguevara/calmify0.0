package util;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class AlertUtil {

    @FXML
    public static void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
