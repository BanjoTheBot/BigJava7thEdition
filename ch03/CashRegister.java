package ch03;

/**
 * A challenge from a How-To section
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {

    private double regAmount;
    CashRegister register = new CashRegister();

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {

    }

    /**
     * Records the sale of an item.
     * @param amount the price of the item
     */
    public void recordPurchase(double amount) {

    }

    /**
     * Processes a payment received from the customer.
     * @param amount the amount of the payment
     */
    public void receivePayment(double amount) {

    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange() {
        return 0;
    }
}