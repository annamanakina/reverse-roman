package com.example.training.task.roman;

public class ReverseRomanTask {

    /*Given a Roman number as a string (eg "XX") determine
    its integer value (eg 20).

    You cannot write numerals like IM for 999.
    Wikipedia states "Modern Roman numerals are written by
    expressing each digit separately starting with the
    leftmost digit and skipping any digit with a value of zero."

    Examples:
            "I" -> 1 |    "X" -> 10 |    "C" -> 100 |    "M" -> 1000
            "II" -> 2 |   "XX" -> 20 |   "CC" -> 200 |   "MM" -> 2000
            "III" -> 3 |  "XXX" -> 30 |  "CCC" -> 300 |  "MMM" -> 3000
            "IV" -> 4 |   "XL" -> 40 |   "CD" -> 400 | "MMMM" -> 4000
            "V" -> 5 |    "L" -> 50 |    "D" -> 500 |
            "VI" -> 6 |   "LX" -> 60 |   "DC" -> 600 |
            "VII" -> 7 |  "LXX" -> 70 |  "DCC" -> 700 |
            "VIII" -> 8 | "LXXX" -> 80 | "DCCC" -> 800 |
            "IX" -> 9 |   "XC" -> 90 |   "CM" -> 900 |

            "MCMXC" -> 1990 ("M" -> 1000 + "CM" -> 900 + "XC" -> 90)
            "MMVIII" -> 2008 ("MM" -> 2000 + "VIII" -> 8)
            "XCIX" -> 99   ("XC" -> 90 + "IX" -> 9)
            "XLVII" -> 47   ("XL" -> 40 + "VII" -> 7)*/

    public int convertRomanToArabic(String romanNumber){
        int sum = 0;
        System.out.println("romanNumber: "+ romanNumber);
        System.out.println("romanNumber: "+ romanNumber.length());
        System.out.println("isInNumberFormatCorrect: " + isInNumberFormatCorrect(romanNumber));

        if (isInNumberFormatCorrect(romanNumber)) {

            String[] s = romanNumber.split("");

            for (int i = 0; i < s.length; i++) {

                if (isLastIndex(i, s)) {
                    return add(sum, RomanNumber.valueOf(s[i]).getValue());
                }

                if (isLarger(s, i)) {
                    sum += RomanNumber.valueOf(s[i]).getValue();
                } else {
                    sum += substract(s, i);
                    i++;
                }
            }
        } else throw new NumberFormatException("Incorrect number format");
        return sum;
    }

    private boolean isInNumberFormatCorrect(String str) {
        String regex = "([M]{0,5}[D]{0,5}[C]{0,5}[L]{0,5}[X]{0,5}[V]{0,5}[I]{0,5})|"
                + "([M]{0,5}[C]?[D]{0,5}[X]?[L]{0,5}[I]?[V]{0,5})|"
                + "([M]{0,5}[C]?[D]{0,5}[L]{0,5}[X]{0,5}[I]?[V]{0,5})|" +
                "([M]{0,5}[C]?[D]{0,5}[L]{0,5}[X]{0,5}[V]{0,5}[I]{0,5})";
               // +"([M]{0,5}[C]?[M]{0,5}[D]{0,5}[L]{0,5}[X]{0,5}[I]?[V]{0,5})";
        //System.out.println("isCorrect: " + str.matches(regex));

        return ((str != null)
                && (!str.equals(""))
                && (str.matches(regex)));
    }

    private boolean isLastIndex(int i, String[] array) {
        return i == array.length - 1;
    }

    private int add(int sum, int value) {
        return sum + value;
    }

    private int substract(String[] array, int index) {
        return RomanNumber.valueOf(array[index + 1]).getValue() - RomanNumber.valueOf(array[index]).getValue();
    }

    private boolean isLarger(String[] array, int index) {
        return RomanNumber.valueOf(array[index + 1]).getValue() <= RomanNumber.valueOf(array[index]).getValue();
    }
}

