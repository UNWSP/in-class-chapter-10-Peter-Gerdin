
public class deliveryPizza extends Pizza {
    String address;
    double deliveryFee;
    public deliveryPizza(String desc, double pr, String addy) {
        super(desc, pr);
        this.address = addy;
        if(pr > 15){
            this.deliveryFee = 3;
        }
        else{
            this.deliveryFee = 5;
        }
    }
    public void display(){
        super.display();
        System.out.println("address: "+ address +"\ndelivery fee: " + deliveryFee);
    }
}
