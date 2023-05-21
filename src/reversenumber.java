public class reversenumber {
    public static int reverseNumber(int number) {
        int reverse = 0;

        for (; number != 0; number /= 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }

        return reverse;
    }

        public static void main(String[] args) {
            int number = 12345; // Change this to the number you want to reverse

            int reversedNumber = reverseNumber(number);

            System.out.println("Original number: " + number);
            System.out.println("Reversed number: " + reversedNumber);
        }
    }




