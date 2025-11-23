public class Expenditure extends Deal {
    protected String product;
    protected int price;

    public Expenditure (String product, int price) {
        super("покупке " + product + " на " + price + " руб", price, 0);
        this.product = product;
        this.price = price;

    }


}
