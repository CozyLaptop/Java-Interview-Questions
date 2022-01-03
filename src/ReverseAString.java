public class ReverseAString {
//    Write a function that will return a string without the built-in reverse method
    public static String reverse(String string){
        String reversedString = "";
        for (var i = string.length() - 1; i >= 0; i--){
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}
