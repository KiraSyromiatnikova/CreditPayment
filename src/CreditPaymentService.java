public class CreditPaymentService {
    public float calculate(float rate_year, float total, float period_month) {
        double dblResult = Math.pow(rate_year/12/100+1, period_month);
        double payment = total * rate_year/12/100 * dblResult / (dblResult - 1);
        return (long) payment;
    }
}
