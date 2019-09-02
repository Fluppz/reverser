package com.interview;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("abcde"));

    }


    public static String reverseString(String originalString) {
        String reversedString = "";
        int length = originalString.length();

        while(length > 0) {

            String lastChar = originalString.substring(length - 1);
            reversedString += lastChar;
            originalString = originalString.substring(0, length - 1);
            length--;
        }

        return reversedString;
    }
}


//    @Test
//    public void reverseAbcde() {
//        final String expected = "edcba";
//        final String actual = Main.reverseString("abcde");
//        Assert.assertEquals(expected, actual);
//    }
