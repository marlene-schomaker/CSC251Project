import java.io.*;
import java.util.*;


public class Project_marlene_schomaker {
   public static void main(String[] args) {
      try 
      {
         File file = new File("PolicyInformation.txt");                       
         Scanner inputFile = new Scanner(file);
      
         //declare the variables
         String policyNumber = "", providerName = "", firstName = "", lastName = "", smokingStatus = "";
         double height = 0.0, weight = 0.0;
         int age = 0;
      
         //Create an array list to store objects. The ArrayList will hold Course objects.
         ArrayList<Policy> policies = new ArrayList<Policy>();
      
         /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
      
         while(inputFile.hasNext())       
         { //open loop
         
            policyNumber = inputFile.nextLine();  
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = Integer.parseInt(inputFile.nextLine());
            smokingStatus = inputFile.nextLine();
            height = Double.parseDouble(inputFile.nextLine());
            weight = Double.parseDouble(inputFile.nextLine());
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
            }
        
            Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight); //Passing variables as arguments to the constructor
         
            // Add objects to the ArrayList 
            policies.add(p); 
         
         } //close loop
      
         inputFile.close();//close the file
      
         //use a for loop to display the output
         for (int i = 0; i < policies.size(); i++) {
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
            System.out.printf("Policy Price: $%.2f\n", policies.get(i).getPrice());
         }
      
      }//close the "try" block of code
      
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }         
   }
}