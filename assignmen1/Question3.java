package assignmen1;

public class Question3 {
    public static void main(String args[]){
        int age = 56;
        if (age >= 25 && age<=55) {
            System.out.println("Age is above 25");
        }
        else{
            throw new ArithmeticException ("Incorrect age");
    }
    }
}
