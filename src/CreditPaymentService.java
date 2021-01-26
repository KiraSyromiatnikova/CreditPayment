public class CreditPaymentService {
    public float calculate(float rateYear, int total, int periodMonth) {
        double dblResult = Math.pow(rateYear / 12 / 100 + 1, periodMonth);
        double payment = total * rateYear / 12 / 100 * dblResult / (dblResult - 1);
        return (long) payment;
    }
}
