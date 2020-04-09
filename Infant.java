package travellingcard;

public class Infant extends Person {
    private String Birthcertificate,parentNID;
    public Infant(String name, String gender, String age, String nationality,String Birthcertificate,String parentNID){
     super(name,gender,age,nationality);
     this.Birthcertificate=Birthcertificate;
     this.parentNID=parentNID;
    }
    public void setBirthcertificate(String Birthcertificate){
        this.Birthcertificate=Birthcertificate;
    }
    public void setparentNID(String parentNID){
        this.parentNID=parentNID;
    }
    @Override
    public void getinformation(){
        System.out.println("Name is : "+name+"\nGender is "+gender +"\nAge is "+age +"\nNationality is "+nationality);
        System.out.println(name+"'s Birth Certificate No : "+Birthcertificate +"\n"+name+ "'s Parent NID No :"+parentNID);
    }
    
}
