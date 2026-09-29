public record Position(int x, int y) {

    @Override
    public boolean equals(Object other) {
        if (other instanceof Position(int x1, int y1)) {
            return this.x == x1 && this.y == y1;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
