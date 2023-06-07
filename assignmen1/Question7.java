package assignmen1;

public class Question7 {
    public static int returnNumber() {
        int c = 0;
        float a = 7.8f;
        float b = 4.4f;
        c=Math.round(a)+Math.round(b);
        return c;
    }
    public static void main(String[] args)
    {
        System.out.println(returnNumber());
    }
}
