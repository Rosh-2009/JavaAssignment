package assignmen1;

public class Question12 {
    static int count;
    public Question12() {
// increase the count variable by 1
        count++;
    }
        public static void main(String args[]) {

            Question12 ob1 = new Question12();
            Question12 ob2 = new Question12();
            Question12 ob3 = new Question12();
            Question12 ob4 = new Question12();
            System.out.print("Total Number of Objects: " + Question12.count);
        }
    }

