package uk.sky.mdc.logging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransferDemo {
    public static void main(String[] args) {
        // This simulates multiple requests coming in. Each assigned a different thread

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0 ; i < 10 ; i++){
            Transfer transfer = TransferFactory.getTransfer();
            TransferRunnable tr = new TransferRunnable(transfer);
            executorService.submit(tr);
        }

    }
}
