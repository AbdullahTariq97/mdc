package uk.sky.mdc.logging;

import org.slf4j.MDC;

public class TransferRunnable implements Runnable{

    private static final TransferService ts = new TransferServiceImpl();

    private Transfer transfer;

    public TransferRunnable(Transfer transfer){
        this.transfer = transfer;
    }

    @Override
    public void run() {
        /**
        MDC in Log4j allows us to fill a map-like structure with pieces of
        information that are accessible to the appender when the log message is actually written.
        Here's the high-level idea:

        Fill the MDC with pieces of information that we want to make available to the appender
        Then log a message
        And finally clear the MDC
         */
        MDC.put("sender", transfer.getSender());
        ts.transfer(transfer.getAmount());
        MDC.clear();
    }
}
