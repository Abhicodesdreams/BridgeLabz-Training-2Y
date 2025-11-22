public class BankLimitCheck {

    public static double getLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit;
    }

    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println(getLimit(limit1));
        System.out.println(getLimit(limit2));
    }
}
