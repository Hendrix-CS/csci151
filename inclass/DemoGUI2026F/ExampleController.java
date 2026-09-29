import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ExampleController {

    // Data Members
    @FXML
    private Button button;

    @FXML
    private Label message;

    // Constructor?????
    public void initialize() {
        message.setText("Hello!");
        button.setText("Click me to leave!");
    }

    // Methods
    public void onClick() {
        message.setText("Goodbye!");
    }
}
