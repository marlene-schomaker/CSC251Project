import java.util.Scanner;

public class Project_marlene_schomaker {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.print("Please enter the Policy Number: ");
      int policy_number = scnr.nextInt();
      scnr.nextLine();

      System.out.print("Please enter the Provider Name: ");
      String provider_name = scnr.nextLine();

      System.out.print("Please enter the Policyholder’s First Name: ");
      String first_name = scnr.nextLine();

      System.out.print("Please enter the Policyholder’s Last Name: ");
      String last_name = scnr.nextLine();

      System.out.print("Please enter the Policyholder’s Age: ");
      int age = scnr.nextInt();
      scnr.nextLine();

      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smoking_status = scnr.nextLine();

      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double height_inches = scnr.nextDouble();

      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      double weight_pounds = scnr.nextDouble();

      Policy policy = new Policy(policy_number, provider_name, first_name, last_name,
                                   age, smoking_status, height_inches, weight_pounds);

      System.out.println("Policy Number: " + policy.getPolicyNumber() + "\n");
      System.out.println("Provider Name: " + policy.getProviderName() + "\n");
      System.out.println("Policyholder’s First Name: " + policy.getFirstName() + "\n");
      System.out.println("Policyholder’s Last Name: " + policy.getLastName() + "\n");
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: "  + policy.getSmokingStatus() + "\n");
      System.out.println("Policyholder’s Height: " + policy.getHeightInches() + " inches");
      System.out.println("Policyholder’s Weight: " + policy.getWeightPounds() + " pounds");
      System.out.printf("Policyholder’s BMI: %.2f%n\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f%n\n", policy.calculatePolicyPrice());

      scnr.close();
      
   }
}