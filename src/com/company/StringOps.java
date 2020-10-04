package com.company;

public class StringOps {
    public static void stringFormatting() {
        int a = 10;
        float b = 12.55f;
        char c = 'A';

        System.out.println(c);
        System.out.println("Sum of " + (a + b));

        // formatted string
        System.out.printf("Sum of %d and %f is %f\n", a, b, (a + b));

        // scientific representation
        System.out.printf("%e\n", 0.0012f);
        System.out.printf("%e\n", 12.43f);

        // argument index (go use [1])
        System.out.printf("%3$s %2$f %1$d\n", a, b, "hello");

        // use of flags (pad number with 3 0s)
        System.out.printf("%05d\n", 10);

        // use of flags (Added brackets for negative numbers)
        System.out.printf("%(3d\n", -10);

        // use of flags (Added + for positive numbers)
        System.out.printf("%+3d\n", 10);

        // showing only 2 digits
        System.out.printf("%.2f\n", 12.45);

        // having a width of 20
        System.out.printf("%-20s", "Java");
        System.out.print("something");
    }

    public static void creatingStrings() {
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);

        byte[] b = {65, 66, 67, 69};

        // overloaded methods to create a string from bytes
        String str4 = new String(b, 2, 2);
        System.out.println(str4); // ABCE

        // compare strings in the string pool
        String str5 = "JAVAC";
        String str6 = "JAVAc";
        System.out.println(str5 == str6);

    }

    public static void stringMethod1() {
        String str = new String("netbeans");
        System.out.printf("length of %s is %d\n", str, str.length());

        System.out.println("Uppercase, " + str.toUpperCase());
        System.out.println("Lowercase, " + str.toLowerCase());

        String str2 = "  netbeans ";
        System.out.println(str2.trim());

        System.out.printf("Substring of %s from index 1 to 4 -> %s\n", str, str.substring(1, 4));
        System.out.printf("Replacing e with o of %s -> %s\n", str, str.replace('e', 'o'));
    }

    public static void stringMethod2() {
        String str = "Mr. Sharukh Khan";
        System.out.println(str.startsWith("Sha", 4));

        System.out.println(str.charAt(2));

        String str1 = "www.udemy.com";
        String domain = str1.substring(str1.lastIndexOf('.') + 1);
        System.out.println(domain);

    }

    public static void stringMethod3() {
        String str1 = "Pyramid";
        String str2 = "Pyramid";
        String str3 = new String("Pyramid");

        // Equals to do a full string check
        System.out.println(str1.equals(str2));
        System.out.println(str1.toLowerCase().equalsIgnoreCase(str2));

        // to do a reference check
        System.out.println(str1 == str2);

        // use equals to compare object and lieral notation
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        // compare to (can be used in sorting)
        System.out.println(str1.compareTo(str2)); // 0 - same
        System.out.println(str1.compareTo(str2.toLowerCase())); // -32 (str1 is less
        System.out.println(str1.toLowerCase().compareTo(str2)); // 32 (lower is higher)
        System.out.println("china wall".compareTo("china tall")); // positive 3

        // contains
        System.out.println("china wall".contains("wall"));

        // concat
        System.out.println(str1.concat(" china"));
    }

    public static void regexMatch() {
        System.out.println("b".matches("[abc]")); // true
        System.out.println("p".matches("[^abc]")); // true
        System.out.println("9".matches("[a-z0-9]")); // true
        System.out.println("a7".matches("[a-z][0-9]")); // true
        System.out.println("abcd".matches("abc")); // false
        System.out.println("a".matches("\\w")); // true
        System.out.println("$".matches("\\W")); // true

        // quantifiers
        System.out.println("----------------------------");
        System.out.println("51".matches("\\d{2}")); // true
        System.out.println("abc def".matches("[a-z]*\\s[a-z]*")); // true
        System.out.println("john@gmail.com".matches("\\w*@[a-z]*\\.[a-z]{2,3}")); // true
    }

    public static void challenge1(String email) {
        int indexOfAt = email.indexOf('@');
        String domain = email.substring(indexOfAt + 1, email.lastIndexOf("."));
        System.out.printf("Domain is %s and it matches gmail -> %b\n", domain, domain.equals("gmail"));
        System.out.println("Username is " + email.substring(0, indexOfAt));
    }

    public static boolean checkBinary(String num) {
        return num.matches("[10]+");
    }

    public static boolean checkHex(String num) {
        return num.toUpperCase().matches("[A-F0-9]+");
    }

    public static boolean checkDateFormat(String date) {
        return date.matches("([0-2][0-9]|30|31)/(0[1-9]|10|11|12)/[0-9]{4}");
    }

    public static String removeSpecialChars(String phrase) {
        return phrase.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String removeExtraSpaces(String phrase) {
        return phrase.trim().replaceAll("\\s{2,}", " ");
    }

    public static int findNumberOfWords(String phrase) {
        return phrase.split("\\s").length;
    }
}








