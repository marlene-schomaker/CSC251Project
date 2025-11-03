public class Policy {

   private int policy_number;
   private String provider_name;
   private String first_name;
   private String last_name;
   private int age;
   private String smoking_status;
   private double height_inches;
   private double weight_pounds;
   
   public Policy() {
      policy_number = 0;
      provider_name = "";
      first_name = "";
      last_name = "";
      age = 0;
      smoking_status = "smoker";
      height_inches = 0.0;
      weight_pounds = 0.0;
   }
   
   public Policy(int policy_number, String provider_name, 
                 String first_name, String last_name, int age, 
                 String smoking_status, double height_inches, double weight_pounds) {
      this.policy_number = policy_number;
      this.provider_name = provider_name;
      this.first_name = first_name;
      this.last_name = last_name;
      this.age = age;
      this.smoking_status = smoking_status.toLowerCase();
      this.height_inches = height_inches;
      this.weight_pounds = weight_pounds;
   }
   
   public int getPolicyNumber() {
      return policy_number;
   } 
   public void setPolicyNumber(int policy_number) {
      this.policy_number = policy_number;
   }
   
   public String getProviderName() {
      return provider_name;
   }
   public void setProviderName(String provider_name) {
      this.provider_name = provider_name;
   }
   
   public String getFirstName() {
      return first_name;
   }
   public void setFirstName(String first_name) {
      this.first_name = first_name;
   }
   
   public String getLastName() {
      return last_name;
   }
   public void setLastName(String last_name) {
      this.last_name = last_name;
   }
   
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
   public String getSmokingStatus() {
      return smoking_status;
   }
   public void setSmokingStatus(String smoking_status) {
      this.smoking_status = smoking_status.toLowerCase();
   }
   
   public double getHeightInches() {
      return height_inches;
   }
   public void setHeightInches(double height_inches) {
      this.height_inches = height_inches;
   }
   
   public double getWeightPounds() {
      return weight_pounds;
   }
   public void setWeightPounds(double weight_pounds) {
      this.weight_pounds = weight_pounds;
   }
   
   public double calculateBMI() {
      if (height_inches == 0) {
         return 0.0;
      }
      return (weight_pounds * 703.0) / (height_inches * height_inches);
   }
   
   public double calculatePolicyPrice() {
      double price = 600.0;
      
      if (age > 50) {
         price += 75.0;
      }
      if (smoking_status.equals("smoker")) {
         price += 100.0;
      }
      
      double bmi = calculateBMI();
      if (bmi > 35) {
         price += (bmi-35) * 20;
      }
      
      return price;
   }
}