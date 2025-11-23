public class Sale extends Deal {
    protected String product;
    protected int price;

    public Sale(String product, int price) {
        super("продаже " + product + " на " + price + " руб", 0, price);
        this.product = product;
        this.price = price;

    }


}

