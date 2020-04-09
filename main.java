
package travellingcard;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        String name,gender,age,nationality,passportno,birthcertificateno,parentsnidno;
        char choice;
        int nid;
        Scanner sc= new Scanner (System.in);
        System.out.println("Card for : \n\n1.Adult\n2.infant\n3.Forigner\\Enter Your Choice : ");
        choice=sc.nextLine().charAt(0);
        
        if(choice =='1'|| choice =='2' || choice == '3'){
            System.out.println("Enter Your Name : ");
            name = sc.nextLine();
            System.out.println("Enter Your Gender : ");
            gender= sc.nextLine();
            System.out.println("Enter Your Age : ");
            age= sc.nextLine();
            System.out.println("Enter Your Nationality : ");
            nationality=sc.nextLine();
            if(choice== '1'){
            
            System.out.println("Enter Your NID : ");
            nid= sc.nextInt();
            adult tasin=new adult(name,gender,age,nationality,nid);
            tasin.getinformation();
        }
        
        else if(choice =='2'){
            
            System.out.println("Enter Your Passport No : ");
            passportno= sc.nextLine();
            foreigner bideshi_manush=new foreigner(name,gender,age,nationality,passportno); 
            bideshi_manush.getinformation();
        }
        else if(choice == '3'){
            System.out.println("Enter Your Birth Certificate No : ");
            birthcertificateno= sc.nextLine();
            System.out.println("Enter Your Parent's NID No : ");
            parentsnidno = sc.nextLine();
           Infant baby= new Infant(name,gender,age,nationality,birthcertificateno,parentsnidno);
           baby.getinformation(); 
        }
        
        }
    }
    
}
