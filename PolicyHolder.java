public class PolicyHolder {
   //fields
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //no-arg constructor
   
   public PolicyHolder() {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /*constructor that accepts arguments for fields
   @param fName first name
   @param lName last name
   @param a age
   @param smoker smoking status
   @param h height
   @param w weight
   */
   
   public PolicyHolder(String fName, String lName, int a, String smoker, double h, double w) {
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = smoker;
      height = h;
      weight = w;
   }
   
   //getters
   
   //return first name
   public String getFirstName() {
      return firstName;
   }
   //return last name
   public String getLastName() {
      return lastName;
   }
   //return age
   public int getAge() {
      return age;
   }
   //return smoking status
   public String getSmokingStatus() {
      return smokingStatus;
   }
   //return height
   public double getHeight() {
      return height;
   }
   //return weight
   public double getWeight() {
      return weight;
   }
   
   //setters
   
   /**
   @param fName The Policy holder's first name
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
   @param lName The Policy holder's last name
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
   @param a The Policy holder's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param sStatus The Policy holder's smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   @param h The Policy holder's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   @param w The Policy holder's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   //Calculates the Policyholder's BMI
   public double getBMI() {
      final double conversionFactor = 703;
      
      return (weight * conversionFactor) / (height * height);
   }
   
   //toString method
   @Override
   public String toString() {
      return "Policyholder's First Name: " + firstName +
           "\nPolicyholder's Last Name: " + lastName +
           "\nPolicyholder's Age: " + age +
           "\nPolicyholder's Smoking Status (Y/N): " + (smoker ? "smoker" : "non-smoker") +
           "\nPolicyholder's Height: " + height + " inches" +
           "\nPolicyholder's Weight: " + weight + " pounds";
   }
}  