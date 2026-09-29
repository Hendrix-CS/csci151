import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LightsOutController {

    // Data Members
    // VIEW
    @FXML
    private Button button;
    @FXML
    private Pane pane;
    @FXML
    private Label label;

    // MODEL
    private LightsOut game;

    // Constructor
    public void initialize() {
        game = new LightsOut(5);
        updateViews();
    }

    public void reset() {
        game = new LightsOut(5);
        updateViews();
    }

    // Methods
    public void updateViews() {
        pane.getChildren().clear();
        int size = game.getSize();

        double cellWidth = pane.getWidth() / size;
        double cellHeight = pane.getHeight() / size;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Rectangle cell = new Rectangle(x * cellWidth,
                        y * cellHeight, cellWidth, cellHeight);
                cell.setFill(game.getState(y, x).getColor());
                cell.setStroke(Color.BLACK);

                Position p = new Position(x, y);
                cell.setOnMouseClicked(event -> {
                    game.toggle(p.y(), p.x());
                    updateViews();
                });

                pane.getChildren().add(cell);
            }
        }
    }

}
