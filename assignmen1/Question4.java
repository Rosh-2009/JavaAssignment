package assignmen1;

public class Question4 {

    public static void mathematical_operation(String operate,int a, int b)
    {
        switch (operate)
        {
            case "Add":
                System.out.println("Addition of two number "+(a+b));
                break;
            case "Sub":
                System.out.println("Subtraction of two number "+(a-b));
                break;
            case "Mul":
                System.out.println("multiplication of two number "+(a*b));
                break;
            case "Div":
                System.out.println("division of two number "+(a/b));
                break;
            default:
                System.out.println("Invalid operation");

        }


    }

    public static void main(String[] args)
    {
        mathematical_operation("Add",25,5);
    }
}
