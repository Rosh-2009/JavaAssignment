package assignmen1;

public class Question13 {
    public static void main (String[] args) {
        String str = "Welcome To Java";
        String reverseStr="";

        for (int i=str.length()-1; i >= 0 ; i--) {
            reverseStr = reverseStr+ str.charAt(i);
        }

        System.out.println(reverseStr);
    }
}
