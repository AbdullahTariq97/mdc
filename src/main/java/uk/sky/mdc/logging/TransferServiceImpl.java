package uk.sky.mdc.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransferServiceImpl extends TransferService{

    private final Logger logger= LoggerFactory.getLogger(TransferServiceImpl.class);

    // The transfer object is unavailable to the methods of the abstract class.
    // It can be passed and then the sender added each time a message is logged. However this is repetitive
    // Instead key-value pairs can be added to MDC once. Then they appear each time a message is logged

    @Override
    protected void beforeTransfer(double amount) {
        logger.info("Preparing to transfer £" + amount + ".");
    }

    @Override
    protected void afterTransfer(double amount, boolean outcome) {
        logger.info("Has transfer of " + amount + "$ completed successfully ? " + outcome + ".");
    }
}
