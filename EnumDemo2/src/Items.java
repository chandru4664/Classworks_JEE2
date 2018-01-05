public enum Items{

         SOAP(10,25.00){
          public double findCost(){
               return qty*(price);
          }
          },
         TOOTHPASTE(2,30.50){
            public double findCost(){
               return qty*(price);
          }
          },
          SHAMPOO(5,45.00){
         public double findCost(){
               return qty*(price);
          }};
         
        /* SOAP(10,25.00),TOOTHPASTE(2,30.50), SHAMPOO(5,45.00){
         public double findCost(){
               return qty*(price-5);
          }};*/
    int qty;
    double price;

     Items(int q,double d){
           qty=q;
           price=d;
     }
  /*   public double findCost(){
               return qty*price;
          }*/
    public abstract double findCost();
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	
    
    
	
};
