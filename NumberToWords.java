public class NumberToWords {

    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Minus " + convert(-number);
        }

        String words = "";

        if (number >= 1000) {
            words += units[number / 1000] + " Thousand ";
            number %= 1000;
        }

        if (number >= 100) {
            words += units[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number >= 20) {
            words += tens[number / 10] + " ";
            number %= 10;
        }

        if (number > 0) {
            words += units[number] + " ";
        }

        return words.trim();
    }

    public static void main(String[] args) {
        int number = 1234; // Change this number to test with different values
        String result = convert(number);
        System.out.println(result);
    }
}
