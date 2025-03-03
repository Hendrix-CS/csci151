import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LightsOutController {

    // Fields
    private LightsOut game;

    @FXML
    private Label status;

    @FXML
    private Button newGame;

    @FXML
    private Pane pane;

    private int moveCount;

    // Constructor???
    public void initialize() {
        game = new LightsOut(5);
        game.randomize();
    }

    // Methods
    @FXML
    public void reset() {
        System.out.println("Button pressed!");
        game = new LightsOut(5);
        game.randomize();
        updateView();
    }

    public void updateView() {
        pane.getChildren().clear();
        int size = game.getSize();
        if (game.isSolved()) {
            status.setText("Amazing, you won!");
        } else {
            status.setText("Moves: " + moveCount);
        }

        double cellWidth = pane.getWidth() / size;
        double cellHeight = pane.getHeight() / size;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Rectangle cell = new Rectangle(x * cellWidth,
                        y * cellHeight, cellWidth, cellHeight);
                Position p = new Position(x, y);
                if (game.getState(x, y)) {
                    cell.setFill(Color.LIGHTGOLDENRODYELLOW);
                } else {
                    cell.setFill(Color.FIREBRICK);
                }
                cell.setStroke(Color.BLACK);
                cell.setOnMouseClicked(event -> {
                    game.toggle(p.x(), p.y());
                    moveCount++;
                    updateView();
                });

                pane.getChildren().add(cell);
            }
        }
    }
}
