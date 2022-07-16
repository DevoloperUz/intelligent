package extraTasks.hackPassword;

import java.util.Random;

public class HackPassword {
    public static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXVZabcdefghijklmnopqrstuvwxvz1234567890";

    public static void main(String[] args) {
        String generatePassword = generatePassword();
        System.out.println(" Password: " + generatePassword);
        System.out.println(" /n hacking process . . . ");
        String result = hackingCombination(generatePassword);
        System.out.println(result);

    }

    private static String generatePassword() {
        String result = " ";

        Random random = new Random();
        while (true) {
            for (int i = 0; i < 5; i++) {
                result += letters.charAt(random.nextInt(letters.length()));
            }
            if (isNumberLetter(result))
                return result;
            else
                result += " ";
        }
    }

    private static String hackingCombination(String target) {
        int count = 0;
        for (int i = 0; i < letters.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                for (int k = 0; k < letters.length(); k++) {
                    for (int l = 0; l < letters.length(); l++) {

                        String result = letters.charAt(i) + " " + letters.charAt(j) + " " + letters.charAt(k) + " " + letters.charAt(l);
                        if (isNumberLetter(result)) {
                            if (target.equals(result)) {
                                count++;
                                return result + " , " + count + " ta urinish ";
                            }
                        }
                        count++;

                    }

                }

            }
            
        }
        return null;
    }

    private static boolean isNumberLetter(String result) {
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < result.length(); i++) {
            if (Character.isLetter(result.charAt(i)))
                letterCount++;
            if (Character.isDigit(result.charAt(i)))
                digitCount++;

        }
        return letterCount == 2 && digitCount == 2;
    }

}
