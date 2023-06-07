package problem10;

public class understand_Encapsulation {

    // Private field ....
    private int age=0;

    private String mobileDataBalance = null;

    // getter method ...
    public int getAge(){
        return age;
    }

    // setter method ...
    public void setAge(int age){
        this.age = age;
    }
    public String getMobileData(){
        return mobileDataBalance;
    }
    // setter method ...
    public void setMobileData(int mobileNumber , String code){
        this.mobileDataBalance = call_DataBase_To_CheckTheBalance(mobileNumber,code);
    }
    public String call_DataBase_To_CheckTheBalance(int num , String code){
        return "5GB";
    }






}