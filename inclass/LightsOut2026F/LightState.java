public enum LightState {
    ON {
        public LightState opposite() {
            return LightState.OFF;
        }
    }, OFF {
        public LightState opposite() {
            return LightState.ON;
        }
    };

    abstract public LightState opposite();
}
