public class Car {
   // Variable Definition
   private String mfgName;  // Company who made the car
   private String modelName;  // Car model
   private double carPrice;  // $ value of one car
   private int[] salesHistory;  // Number of units sold in the previous 12 months

   // Constructor - complete this constructor
   public Car(String mfg, String model, double price) {
       this.mfgName = mfg;
       this.modelName = model;
       this.carPrice = price;
       this.salesHistory = new int[12];
       for (int idx = 0; idx < salesHistory.length; idx++) {
           salesHistory[idx] = (int) (Math.random() * 6 + 1);  // Random monthly quantity sold amount from 1 to 6 units
       }
   }

   String getMfgName() {
       return this.mfgName;
   }

   String getModelName() {
       return this.modelName;
   }

   double getCarPrice() {
       return this.carPrice;
   }

   int[] getSalesHistory() {
       return this.salesHistory;
   }

   // Calculate the total sales quantity
   int getTotalSalesQty() {
       int totalSalesQty = 0;
       for (int i : salesHistory) {
           totalSalesQty += i;
       }
       return totalSalesQty;
   }

   // Calculate the total sales amount
   double getTotalSalesAmount() {
       double totalSalesAmount = 0.0;
       for (int i : salesHistory) {
           totalSalesAmount += i * carPrice;
       }
       return totalSalesAmount;
   }

   // Check if the total sales amount is greater than or equal to 2,000,000
   boolean isTopSeller() {
       return getTotalSalesAmount() >= 2000000;
   }
}
