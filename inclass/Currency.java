package money;

public enum Currency {
    PENNY(1) {
        @Override
        public String getColor() {
            return "copper";
        }
    }, NICKLE(5){
        @Override
        public String getColor() {
            return "purble";
        }
    }, DIME(10){
        @Override
        public String getColor() {
            return "silver";
        }
    }, QUARTER(25){
        @Override
        public String getColor() {
            return "silver";
        }
    };

    private int value;

    public int getValue(){
        return value;
    }

    private Currency(int value) {
        this.value = value;
    }

    public abstract String getColor();
}
