public class Rocket {

    // Static final constant for your use later
    private static final int FUEL_SPOTS = 3;

    // Fields
    private Canister[] fuel;
    private boolean onGround;

    /***
     * A Rocket will have spots for fuel canisters based
     * on the FUEL_SPOTS constant, and
     * starts on the ground.
     */
    public Rocket() {

    }

    /***
     * If the requested spot is a valid index, and
     * if the Canister in that spot is empty, then
     * replace it with a new Canister and return true,
     * otherwise return false
     * @param spot, the fuel location
     * @return success of adding a new Canister
     */
    public boolean addFuelCanister(int spot) {

    }

    /***
     * A rocket can blastOff if it is on the ground and
     * at least one of its Canisters still has fuel. When these
     * conditions are met, one pellet of fuel will be used
     * and the rocket will no longer be on the ground.
     */
    public void blastOff() {

    }

    /***
     * A rocket can land if it is not on the ground and
     * at least one of its Canisters still has fuel. When these
     * conditions are met, one pellet of fuel will be used
     * and the rocket will now be on the ground.
     */
    public void land() {

    }
}
