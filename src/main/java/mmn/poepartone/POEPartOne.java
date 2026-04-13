
package mmn.poepartone;

import java.util.Scanner;

public class POEPartOne {

     public static void main(String[] args) {
        //object calling
        Login log = new Login();
        //Scanner object
        Scanner scan = new Scanner(System.in);
        //displaying the message
        System.out.println("*************************************************\n Welcome user please enter the following details to register \n *************************************************");
        
        //asking the user for the input
        System.out.print("Enter your First name:");
        String firstName = scan.nextLine();
        log.setName(firstName);
        
        
        System.out.print("Enter your Last name:");
        String LastName = scan.nextLine();
        log.setLastname(LastName);
        
        System.out.print("Enter your Username:");
        String UserName = scan.nextLine();
        log.setUsername(UserName);
        //using conditional statements to check if the username meets the conditions
        if(log.checkUsernameComplexity(UserName)){
            System.out.println("Username is successfully captured");
        }else{
            System.out.println("Username is not correctly formatted;please ensure that your username contains an underscore and is no more than five characters in lenght.");
        }
        
        System.out.print("Enter your Password:");
        String Password = scan.nextLine();
        log.setPassword(Password);
         //using conditional statements to check if the password meets the conditions
        if(log.CheckPasswordComplexity(Password)){
            System.out.println("password is correctly captured"); 
        }else{
            System.out.println("password is not correctly formatted; ensure that the password contains at least 8 characters, a capital letter, a number, and a special character. ");
        }
        
        System.out.print("Enter your phone number:");
        String PhoneNumber = scan.nextLine();
        log.setPhoneNumber(PhoneNumber);
        //using conditional statements to check if the phonenumber meets the conditions
        if(log.CheckPhoneNumberComplexity(PhoneNumber)){
            System.out.println("phone number is successfully added.");
        }else{
            System.out.println("phone number incorrectly formatted or does not contain international code");
        }
        
       
        //register the user
        String registration= log.RegisterUser(UserName,Password);
        System.out.println("Registration: "+ registration);
        
        //checking if the registration is successful
        if(registration=="Registration successful"){
        System.out.println("*****************\n LOGIN \n*****************");
        //login user
        System.out.print("Enter username to login:");
        String Secondusername=scan.next();
        System.out.print("Enter password to login:");
        String Secondpassword=scan.next();
         //dispaly  login Status
        boolean loginSuccessful= log.LoginUser(Secondusername,Secondpassword);
       String loginMessage=log.ReturnLoginStatus(loginSuccessful);
      
       //checking if the user has logged in successfully
       if(loginSuccessful){
           System.out.println(loginMessage);
       } else{
           System.out.println("password or username is incorrect");
       }
        }else{
            System.out.println("Registration unsuccessful, unable to login");
        }

    }
}
