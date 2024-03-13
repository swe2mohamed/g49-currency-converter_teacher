package se.lexicon;

import java.text.DecimalFormat;

public class ExchangeOperations {

    // convertSEKToUSD
    // convertUSDToSEK
    // convertSEKToEuro
    // convertEuroToSEK


    public static double convertSEKToUSD(double sekAmount) {
        double usdAmount = sekAmount * ExchangeRates.usdToSekRate;
        return usdAmount;
    }

    public static double convertUSDToSEK(double usdAmount) {
        double sekAmount = usdAmount * ExchangeRates.sekToUsdRate;
        return sekAmount;
    }

    // todo: add more methods as needed


    public static String formatNumber(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        return decimalFormat.format(amount);
    }
}
