package taxes;

public class Tax6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}
