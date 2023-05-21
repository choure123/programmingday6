public class binaryconverte {
    public static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();

        int power = 0;
        while (Math.pow(2, power) <= number) {
            power++;
        }
        power--;

        // Constructing the binary representation
        for (; power >= 0; power--) {
            int currentPower = (int) Math.pow(2, power);
            if (number >= currentPower) {
                binary.append("1");
                number -= currentPower;
            } else {
                binary.append("0");
            }
        }

        while (binary.length() < 32) {
            binary.insert(0, "0");
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int number = 106; // Change this to the decimal number you want to convert

        String binaryRepresentation = toBinary(number);

        System.out.println("Decimal number: " + number);
        System.out.println("Binary representation: " + binaryRepresentation);
    }
}


