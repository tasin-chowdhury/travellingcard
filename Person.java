
package travellingcard;

class Person {
    String name, gender , nationality;
    int age;
    public Person(){
        
    }
    public Person(String name,String gender,int age,String nationality ){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.nationality=nationality;
    }
    public Person(String name,String gender,String age,String nationality ){
        int x=Integer.parseInt(age);
        this.name=name;
        this.gender=gender;
        this.age=x;
        this.nationality=nationality;
    }
    public void getinformation(){
         System.out.println("Name is : "+name+"\nGender is "+gender +"\nAge is "+age +"\nNationality is "+nationality);
    }
    
}
