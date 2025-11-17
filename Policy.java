public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   public Policy(String pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //setters

   public void setPolicyNumber(String pNumber){
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
   public void setFirstName(String fName){
      firstName = fName;
   }
   
   public void setLastName(String lName) {
      lastName = lName;
   }
   
   public void setAge(int a) {
      age = a;
   }
   
   public void setSmokingStatus(String sStatus) {
      smokingStatus = sStatus;
   }
   
   public void setHeight(double h) {
      height = h;
   }
   
   public void setWeight(double w) {
      weight = w;
   }

   
   //getters
   public String getPolicyNumber() {
      return policyNumber;
   }
   
   public String getProviderName() {
      return providerName;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public int getAge() {
      return age;
   }
   
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   public double getHeight() {
      return height;
   }
   
   public double getWeight() {
      return weight;
   }
   
      
   //Calculates the Policyholder's BMI
   public double getBMI() {
      final double conversionFactor = 703;
      
      return (weight * conversionFactor) / (height * height);
   }
   
   //Calculates the Policy's price
   public double getPrice()
   {
      final double base_price = 600;
      final double additional_age_fee = 75;
      final double additional_smoking_fee = 100;
      final double additional_BMI_fee = 20;
      
      final int age_threshold = 50;
      final int BMI_threshold = 35;
      
      double price = base_price;
      
      if(age > age_threshold) //over 50 years
         price += additional_age_fee; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += additional_smoking_fee; //100
            
      //call the getBMI method
      if(getBMI() > BMI_threshold) //BMI over 35
         price += ((getBMI() - BMI_threshold) * additional_BMI_fee); //additional BMI fee - 20
         
      return price;
   }
   
}