import taxes.TaxSystem;


public class Company {
    public String title;
    public int debit = 0;
    public int credit = 0;
    public taxes.TaxSystem taxSystem;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {

        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        } else {
        }

    }

    public void setTaxSystem(taxes.TaxSystem taxSystem) {
        this.taxSystem = taxSystem;

    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;

    }


    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            credit += deal.getCreditChange();
            debit += deal.getDebitChange();
            System.out.println("Компания " + title + " за последний месяц совершила следующие сделки:");
            deal.findDeal();
        }
        int difference = debit - credit;


        System.out.println("Разница доходов и расходов у компании " + title + " составляет: " + difference + " руб.");
        payTaxes();


        return difference;
    }


}
