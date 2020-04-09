package travellingcard;


public class adult extends Person {
    int NID;
    public adult(String name, String gender, String age, String nationality,int NID) {
        super(name, gender, age, nationality);
        this.NID=NID;
   
        //System.out.println(name+ "'s NID is : "+NID);
    }
    
    @Override
    public void getinformation(){
        System.out.println("Name is : "+name+"\nGender is "+gender +"\nAge is "+age +"\nNationality is "+nationality);

        System.out.println(name+ "'s NID is : "+NID);
    }  
}
