public class Deal {
    protected  String comment; //комментарий
    protected int creditChange; //сумма расходов
    protected  int debitChange; // сумма доходов

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }
    public String getComment(){
        return this.comment;
    }

    public int getCreditChange(){
        return this.creditChange;
    }

    public int getDebitChange(){
        return this.debitChange;
    }



    public void findDeal(){
        System.out.println("Проведена сделка по " + comment + ".");
        System.out.println("Сумма расходов: " + creditChange);
        System.out.println ("Сумма доходов: " + debitChange);
    }





}


