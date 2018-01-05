public class ItemsDemo{

    public static void main(String[] args){
            Items item1=Items.SHAMPOO;
            System.out.println("Soap total cost is"+item1.findCost());
            
            Items item2=Items.SHAMPOO;
            item2.setPrice(50);
            item2.setQty(50);
            System.out.println("Soap total cost is"+item2.findCost());
   }
}