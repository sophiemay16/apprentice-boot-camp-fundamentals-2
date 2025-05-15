package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int countsUpToOneHundred;
    private int countsUpToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;
    public static final int ONE_HUNDRED = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final String FIZZ_HEX = "46697a7a";
    public static final String BUZZ_HEX = "42757a7a";

    String doFizzBuzzUpTo100() {
        String result = "";
        for (; countsUpToOneHundred < ONE_HUNDRED; countsUpToOneHundred++) result += addFizzOrBuzz(countsUpToOneHundred) + " ";
        return result.substring(0, result.length() - 1);
    }

    private String addFizzOrBuzz(int num) {
        countsUpToThree++;
        countsDownFromFive--;
        boolean isDivisibleByThree = countsUpToThree == THREE;
        boolean isDivisibleByFive = countsDownFromFive == 0;

        String fizzOrBuzz = isDivisibleByThree || isDivisibleByFive ? "" : String.valueOf(num + 1);
        if (isDivisibleByThree) fizzOrBuzz += fizz();
        if (isDivisibleByFive) fizzOrBuzz += buzz();
        return fizzOrBuzz;
    }

    private String buzz() {
        int five = new int[]{0, 0, 0, 0, 0}.length;
        countsDownFromFive = five;
        try {
            byte[] buzzInBytes = Hex.decodeHex(BUZZ_HEX);
            return new String(buzzInBytes, StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String fizz() {
        countsUpToThree = 0;
        try {
            byte[] fizzInBytes = Hex.decodeHex(FIZZ_HEX);
            return new String(fizzInBytes, StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
