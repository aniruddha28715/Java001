public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(1, 7));
        System.out.println(str.substring(7));
        System.out.println(str.replace('w', 'r' ));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("World", 6));
        System.out.println(str.indexOf("World", 7));
        System.out.println(str.indexOf("World", 8));
        System.out.println(str.equals("Hello"));
        System.out.println("I am escape sequence \\ double qoute");
}
}





// package com.company;

// public class cwh_14_string_methods {
//     public static void main(String[] args) {
//         String name = "Harry";
//         // System.out.println(name);
//         int value = name.length();
//         //System.out.println(value);

//         //String lstring = name.toLowerCase();
//         //System.out.println(lstring);

//         //String ustring = name.toUpperCase();
//         //System.out.println(ustring);

//         //String nonTrimmedString = "     Harry     ";
//         //System.out.println(nonTrimmedString);

//         //String trimmedString = nonTrimmedString.trim();
//         //System.out.println(trimmedString);

//         //System.out.println(name.substring(1));
//         //System.out.println(name.substring(1,5));

//         //System.out.println(name.replace('r', 'p'));
//         //System.out.println(name.replace("r", "ier"));

//         //System.out.println(name.startsWith("Har"));
//         //System.out.println(name.endsWith("dd"));

//         //System.out.println(name.charAt(4));

//         //String modifiedName = "Harryrryrry";
//         //System.out.println(modifiedName.indexOf("rry"));
//         //System.out.println(modifiedName.indexOf("rry", 4));
//         //System.out.println(modifiedName.lastIndexOf("rry", 7));

//         //System.out.println(name.equals("Harry"));
//         System.out.println(name.equalsIgnoreCase("HarRY"));

//         System.out.println("I am escape sequence\tdouble quote");




//     }
// }
