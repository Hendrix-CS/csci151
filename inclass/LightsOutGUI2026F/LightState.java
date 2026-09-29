import javafx.scene.paint.Color;

public enum LightState {
    ON {
        public LightState opposite() {
            return LightState.OFF;
        }
        public Color getColor() {
            return Color.GOLDENROD;
        }
    }, OFF {
        public LightState opposite() {
            return LightState.ON;
        }
        public Color getColor() {
            return Color.DEEPSKYBLUE;
        }
    };

    abstract public LightState opposite();
    abstract public Color getColor();
}
