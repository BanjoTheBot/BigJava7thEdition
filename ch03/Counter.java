package ch03;

/**
 * This class models a tally counter
 */
public class Counter {

    private int value;

    /**
     * Gets the current value of this counter
     * @return the counter value
     */
    public int getValue(){
        return value;
    }

    /**
     * Add 1 to the value of the counter
     */
    public void click(){
        value = value + 1;
    }

    /**
     * Resets value to 0
     */
    public void reset(){
        value = 0;
    }
}
