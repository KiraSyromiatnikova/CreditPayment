public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        long payment = (long) service.calculate((float) 9.99, 1000000, 36);
        System.out.println(payment);
    }
}