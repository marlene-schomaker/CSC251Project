public class Policy
{  //fields
   private static int policyCount = 0;
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }
   
   public Policy(String pNumber, String pName, PolicyHolder holder)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyHolder = holder;
      policyCount++;
   }
   
   //policy count
   public static int getPolicyCount() {
      return policyCount;
   }
   
   //setters

   public void setPolicyNumber(String pNumber){
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }

   //getters
   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }
   
   public String getPolicyNumber() {
      return policyNumber;
   }
   
   public String getProviderName() {
      return providerName;
   }
      
   //Calculates the Policy's price
   public double getPrice()
   {
      final double base_price = 600;
      final double additional_age_fee = 75;
      final double additional_smoking_fee = 100;
      final double additional_BMI_fee = 20;
      
      int age = policyHolder.getAge();
      String smoker = policyHolder.getSmokingStatus();
      double bmi = policyHolder.getBMI();
      
      final int age_threshold = 50;
      final int BMI_threshold = 35;
      
      double price = base_price;
      
      if(age > age_threshold) {
         price += additional_age_fee; 
      }
         
      if(smoker.equalsIgnoreCase("smoker")) {
         price += additional_smoking_fee; 
      }   
            
      if(bmi > BMI_threshold) {
         price += ((bmi - BMI_threshold) * additional_BMI_fee); //additional BMI fee - 20
      }   
      
      return price;
   }
   
   //to string method
   @Override
   public String toString() {
      return String.format(
          "Policy Number: %s" +
          "\nProvider Name: %s" + 
          "\n%s"  +
          "\nPolicy Price: $%.2f", policyNumber, providerName, policyHolder.toString(), getPrice());
   }
   
}