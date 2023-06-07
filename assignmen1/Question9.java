package assignmen1;

public class Question9 {
    public static void main(String args[]) {
        String str = "ABCDE12345";
        String str1= str.replaceAll("[^0-9]","");
        System.out.println("Extracted numbers from given string are: " +str1);
    }
}
