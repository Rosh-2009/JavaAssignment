package assignmen1;

public class Question2 {
    String name;
    String course;
    int age;
    public Question2(String name, String course,int age){
        this.name = name;
        this.course = course;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Question2 s1 = new Question2("Roshni","BSc",25);
        System.out.println(s1.getName());
    }

}
