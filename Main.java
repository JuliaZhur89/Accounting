
import taxes.Tax15;
import taxes.Tax6;
import taxes.TaxSystem;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TaxSystem taxSystem = new Tax6();
        Company company = new Company("Рога и копыта", taxSystem);
        company.setTaxSystem(taxSystem);

        company.shiftMoney(35000);
        company.payTaxes();

        TaxSystem taxSystem2 = new Tax15();
        Company company2 = new Company("Ромашка", taxSystem2);
        company2.setTaxSystem(taxSystem2);

        company2.shiftMoney(1500);
        company2.shiftMoney(-3500);
        company2.shiftMoney(25000);
        company2.shiftMoney(-5000);
        company2.payTaxes();


        Deal[] deals =  {
            new Sale("Раф", 1000),
            new Expenditure("Молоко",600),
            new Expenditure("Вода", 500),
            new Expenditure("Кофе", 1300),
            new Sale ("Американо", 200),
            new Sale ("Капучино", 550),
            new Sale("Гляссе", 750)
        };

        company2.applyDeals(deals);





    }

}