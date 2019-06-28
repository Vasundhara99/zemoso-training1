package vasundhara.assignment2.task1.solution;

import java.util.Arrays;

public class Solution
{
    int count=0;
    public void solution() {
    checkEvenDigits();
    }

        void checkEvenDigits() {
            int numberOfDigits = 10;
            while (true) {
                checkVampireNumberAndPrint(numberOfDigits);
                numberOfDigits=numberOfDigits*10;
            }
        }
    void checkVampireNumberAndPrint(int numberOfDigits) {
        for (int firstFactor = numberOfDigits + 1; firstFactor < numberOfDigits * 10; firstFactor++) {
            for (int secondFactor = firstFactor; secondFactor < numberOfDigits * 10; secondFactor++) {
                int number = firstFactor * secondFactor;

                String numberString = Integer.toString(number);
                String firstFactorString = Integer.toString(firstFactor);
                String secondFactorString = Integer.toString(secondFactor);
                if(firstFactorString.charAt(firstFactorString.length()-1)=='0' && secondFactorString.charAt(secondFactorString.length()-1)=='0')
                {
                    continue;
                }
                String factorsString = firstFactorString + secondFactorString;


                char[] numberCharArray = numberString.toCharArray();
                char[] factorsCharArray = factorsString.toCharArray();

                Arrays.sort(numberCharArray);
                Arrays.sort(factorsCharArray);

                boolean isVampire = Arrays.equals(numberCharArray, factorsCharArray);
                if (isVampire) {
                    System.out.println(firstFactor + " * " + secondFactor + " = " + number);
                    count++;
                }
                if (count == 100)
                    System.exit(0);
            }
        }
    }
}
