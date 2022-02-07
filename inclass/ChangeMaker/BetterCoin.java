package change;

public enum BetterCoin {
    PENNY(1) {
        @Override
        public String getMaterial() {
            return "copper";
        }
    },
    NICKLE(5){
        @Override
        public String getMaterial() {
            return "nickle";
        }
    },
    DIME(10){
        @Override
        public String getMaterial() {
            return "silver";
        }
    },
    QUARTER(25){
        @Override
        public String getMaterial() {
            return "silver";
        }
    };

    // Fields
    private int value;

    // Constructor?
    private BetterCoin(int value) {
        this.value = value;
    }

    // Method
    public int getValue() {
        return value;
    }

    public abstract String getMaterial();
}
