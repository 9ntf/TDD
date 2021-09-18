import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditTest {
    Credit credit = new Credit();

    @Test
    public void testGetMonthlyPayment() {
        int totalSum = 100000;
        int percent = 13;
        int months = 12;
        int expectedMonthlyPayment = 8932;
        int monthlyPayment = credit.getMonthlyPayment(totalSum, percent, months);

        Assertions.assertEquals(expectedMonthlyPayment, monthlyPayment);
    }

    @Test
    public void testGetRefundableAmount() {
        int totalSum = 100000;
        int percent = 13;
        int months = 12;
        int expectedRefundableAmount = 107184;
        int refundableAmount = credit.getRefunableAmount(totalSum, percent, months);

        Assertions.assertEquals(expectedRefundableAmount,refundableAmount);
    }

    @Test
    public void testGetOverpayment() {
        int totalSum = 100000;
        int percent = 13;
        int months = 12;
        int expectedOverPayment = 7184;
        int overPayment = credit.getOverpayment(totalSum, percent, months);

        Assertions.assertEquals(expectedOverPayment, overPayment);
    }
}
