public class Policy
{  //fields
   private String policyNumber;
   private String providerName;

   //constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
   }
   
   public Policy(String pNumber, String pName)
   {
      policyNumber = pNumber;
      providerName = pName;
   }
   
   //setters

   public void setPolicyNumber(String pNumber){
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }

   
   //getters
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