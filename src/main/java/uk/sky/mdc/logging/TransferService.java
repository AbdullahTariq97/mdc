package uk.sky.mdc.logging;

public abstract class TransferService {

    public boolean transfer(double amount) {
        beforeTransfer(amount);
        // transfer logic
        afterTransfer(amount, true);
        return true;
    }

    abstract protected void beforeTransfer(double amount);

    abstract protected void afterTransfer(double amount, boolean outcome);
}
