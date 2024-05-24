public class Methods {
    public static void main(String[] args) {

    String a = "My name ";
    String b = "is Keerti";
    String c = " Vishwkarma";
    String d = " from Bangalore.";
    String e = "Geeks for Geeks";
    System.out.println("\n1. Concatenate the Strings.");
    System.out.println(a + " " + b +" " + c + " " + d);

    System.out.println("\n2. Replace e in 'Geeks for Geeks' with i.");
    System.out.println(e.replace("e", "i"));
    System.out.println(e.replaceFirst("G", "g"));
    System.out.println(e.replaceAll("e", "E"));

    System.out.println("\n3. Join the strings with '<'");
    System.out.println(String.join(" < ", "India","is","my","Country."));

    System.out.println("\n4. Concatenate the Strings.");
    System.out.println(a.concat(b));
    String x = a.concat(b);
    System.out.println(x);
    String y = x.concat(c);
    System.out.println(y);
    String z = y.concat(d);
    System.out.println(z);
    

    double d1 = 4.786578976545678;
    double d2 = 4.78765787832864827;

    System.out.println("\nDouble accepts:" + d1);
    System.out.println("Float accepts: " + d2);

    String s1 =  "     Methods of Java    ";
    System.out.println("\nString = " +s1);

    System.out.println("\nRemove white space = " +s1.trim()); // remove white space

    System.out.println("\nLength of String = " + s1.length());

    System.out.println("\nUppercase = " + s1.toUpperCase());

    System.out.println("\nLowercase = " + s1.toLowerCase());

    System.out.println("\nIndex number of 'z', which is not found in string = " + s1.indexOf('z')); //-1 for missing value in available string

    System.out.println("\nIndex number of 'o' = " + s1.indexOf('o'));

    System.out.println("\nIndex number of 'O', which is not found in string = " + s1.indexOf('O'));

    System.out.println("\nCheck 'z' is present or not in string = " + s1.contains("z")); //false

    System.out.println("\nCheck 'W' is present or not in string = " + s1.contains("W")); //false

    System.out.println("\nCharcater at index 0 of the string = " + s1.charAt(0));

    System.out.println("\nChecks if the string starts with a space = " + s1.startsWith(" "));

    System.out.println("\nchecks if the string ends with 'hnm' = " + s1.endsWith("hnm"));

    System.out.println("\nCharacter at index 7 of the string = " + s1.charAt(8));

    }
    
}
