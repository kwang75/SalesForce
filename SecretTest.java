import java.util.ArrayList;

/**
 * @author bobbyw
 *
 * This test class will have a main method, allowing you to type input parameter from command line.
 * The input will be the maximum prime number of either x or y.
 * This main method will take the validator with input from your command line,
 * and then test every different secret method with a print message saying if it's additive.
 * while each secret method has its own testMethod.
 *
 * If you just want to run one or certain test cases, simply comment others out!
 *
 */

public class SecretTest {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 2 || n > Integer.MAX_VALUE / 2) {
            System.out.println("Please enter a number larger or equal than 2");
            return;
        }
        Validator validator = new Validator(n);
        testNaiveSecret(validator);
        testAbsSecret(validator);
        testModHundredSecret(validator);
        testModLargeSecret(validator);
        testModSixSecret(validator);
        testNegPosSecret(validator);
        testPlusMinusSecret(validator);
        testNegSecret(validator);
        testBecameOneSecret(validator);
        testBecameZeroSecret(validator);
        testChangeOneNonPrimeSecret(validator);
        testChangeOnePrimeSecret(validator);
    }

    public static void testNaiveSecret(Validator v) {
        if (v.isAdditive(new NaiveSecret())) {
            System.out.println("Naive Secret is additive!");
        } else {
            System.out.println("Naive Secret is not additive!");
        }
    }

    public static void testAbsSecret(Validator v) {
        if (v.isAdditive(new AbsSecret())) {
            System.out.println("Absolute Value Secret is additive!");
        } else {
            System.out.println("Absolute Value Secret is not additive!");
        }
    }

    public static void testModHundredSecret(Validator v) {
        if (v.isAdditive(new ModHundredSecret())) {
            System.out.println("Mod Hundred Secret is additive!");
        } else {
            System.out.println("Mod Hundred Secret is not additive!");
        }
    }

    public static void testModLargeSecret(Validator v) {
        if (v.isAdditive(new ModLargeSecret())) {
            System.out.println("Mod Large Secret is additive!");
        } else {
            System.out.println("Mod Large Secret is not additive!");
        }
    }

    public static void testModSixSecret(Validator v) {
        if (v.isAdditive(new ModSixSecret())) {
            System.out.println("Mod Six Secret is additive!");
        } else {
            System.out.println("Mod Six Secret is not additive!");
        }
    }

    public static void testNegPosSecret(Validator v) {
        if (v.isAdditive(new NegPosSecret())) {
            System.out.println("Negative Positive Secret is additive!");
        } else {
            System.out.println("Negative Positive Secret is not additive!");
        }
    }

    public static void testPlusMinusSecret(Validator v) {
        if (v.isAdditive(new PlusMinusSecret())) {
            System.out.println("Plus Minus Secret is additive!");
        } else {
            System.out.println("Plus Minus Secret is not additive!");
        }
    }

    public static void testBecameOneSecret(Validator v) {
        if (v.isAdditive(new BecameOneSecret())) {
            System.out.println("Became One Secret is additive!");
        } else {
            System.out.println("Became One Secret is not additive!");
        }
    }

    public static void testBecameZeroSecret(Validator v) {
        if (v.isAdditive(new BecameZeroSecret())) {
            System.out.println("Became Zero Secret is additive!");
        } else {
            System.out.println("Became Zero Secret is not additive!");
        }
    }

    public static void testChangeOneNonPrimeSecret(Validator v) {
        if (v.isAdditive(new ChangeOneNonPrimeSecret())) {
            System.out.println("Change One Non Prime Secret Secret is additive!");
        } else {
            System.out.println("Change One Non Prime Secret is not additive!");
        }
    }

    public static void testChangeOnePrimeSecret(Validator v) {
        if (v.isAdditive(new ChangeOnePrimeSecret())) {
            System.out.println("Change One Prime Secret Secret is additive!");
        } else {
            System.out.println("Change One Prime Secret is not additive!");
        }
    }

    public static void testNegSecret(Validator v) {
        if (v.isAdditive(new NegSecret())) {
            System.out.println("Negative Secret Secret is additive!");
        } else {
            System.out.println("Negative Secret is not additive!");
        }
    }
}
