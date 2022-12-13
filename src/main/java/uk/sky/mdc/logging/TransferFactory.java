package uk.sky.mdc.logging;

import com.github.javafaker.Faker;

public class TransferFactory {

    public static Transfer getTransfer(){
        String randomSender = Faker.instance().name().firstName();
        double randomAmountToTransfer = Double.parseDouble(Faker.instance().commerce().price());
        String randomId = Faker.instance().idNumber().valid();

        return new Transfer(randomId, randomSender, randomAmountToTransfer);
    }
}
