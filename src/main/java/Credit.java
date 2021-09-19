/*Я понимаю что для работы с финансами лучше использовать BigDecimal
Но в данной задаче я практикую TDD и решил опустить этот момент*/
public class Credit {
    private int totalSum;
    private int percent;
    private int months;

    //Ежемесячный платеж
    public int getMonthlyPayment(int totalSum, int percent, int months) {
        return getOverpayment(totalSum, percent, months) / 12;
    }

    //Сумма к возврату
    public int getRefundableAmount(int totalSum, int percent, int months) {
        return getOverpayment(totalSum, percent, months) + totalSum;
    }

    //Переплата
    public int getOverpayment(int totalSum, int percent, int months) {
        return (percent * months * totalSum / 100) / 10;
    }
}
