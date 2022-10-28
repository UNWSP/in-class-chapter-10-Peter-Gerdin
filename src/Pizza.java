public class Pizza {
    String description;
    double price;

    public Pizza(String desc, double pr){
        this.description = desc;
        this.price = pr;
    }

    public void display(){
        System.out.println("description: "+ description +"\nprice: " + price);
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
