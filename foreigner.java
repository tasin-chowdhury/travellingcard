package travellingcard;

public class foreigner extends Person {
     private  String passportNo;
     
     public foreigner(String name, String gender, String age, String nationality,String passportNo){
         super(name,gender,age,nationality);
         this.passportNo = passportNo;
     }
     /*public void setpassportNo(String passportNo){
         this.passportNo=passportNo;
     }*/
     @Override
     public void getinformation(){
            System.out.println("Name is : "+name+"\nGender is "+gender +"\nAge is "+age +"\nNationality is "+nationality);
            System.out.println("Your Passport no : "+ passportNo);

     }
}
