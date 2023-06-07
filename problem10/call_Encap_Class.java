package problem10;

public class call_Encap_Class {
    // We can access private data from one class to another class by using friend class or function,
    // which allows the friend class to access all its private data

    //We can also access private data of one class to other class using getter and setter method
    //Also by using inheritance the private data pf parent class can be accessed by the child class.



    public static void main(String args[]) throws Exception{


        understand_Encapsulation obj = new understand_Encapsulation();
        obj.setAge(20);
        System.out.println("The Actual Age =="+obj.getAge());

        obj.setMobileData(123 , "#123");
        System.out.println("The Balance is  ==>"+obj.getMobileData());


    }





}




