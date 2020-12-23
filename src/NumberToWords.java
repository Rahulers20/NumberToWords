public class NumberToWords {

    public static int reverse(int number) {
        int reverse = 0;

        if (number > 0) {
            while (number > 0) {
                int lastDigit = 0;
                lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;

            }
        } else  if (number < 0) {

            while (number < 0) {
                int lastDigit = 0;
                lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;

            }
        } return reverse;
    }


    public static void numberToWords(int number) {
        int newNumber = reverse(number);

        int digit = 0;


            if (newNumber >= 0) {
            while (newNumber > 0) {
                digit = newNumber % 10;
                if (digit == 0) {
                    System.out.println("Zero");
                } else if (digit == 1) {
                    System.out.println("One");
                } else if (digit == 2) {
                    System.out.println("Two");
                } else if (digit == 3) {
                    System.out.println("Three");
                } else if (digit == 4) {
                    System.out.println("Four");
                } else if (digit == 5) {
                    System.out.println("Five");
                } else if (digit == 6) {
                    System.out.println("Six");
                } else if (digit == 7) {
                    System.out.println("Seven");
                } else if (digit == 8) {
                    System.out.println("Eight");
                } else if (digit == 9) {
                    System.out.println("Nine");
                }
                newNumber = newNumber / 10;
            }

        } else {
            System.out.println("Invalid Value");
        }

    }



    public static int getDigitCount(int number) {
        int digit = 0;

        if(number > 0) {
            while(number > 0) {
                number = number / 10;
                digit = digit + 1;
            } return digit;
        } else if (number == 0) {
            digit = digit + 1;
            return digit;
        } return -1;
    }
}
