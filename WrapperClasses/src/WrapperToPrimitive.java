public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = 45.67;

        double d = dObj;            // auto-unboxing
        int i = dObj.intValue();    // cast to int

        System.out.println("Double primitive: " + d);
        System.out.println("Integer value: " + i);
    }
}
